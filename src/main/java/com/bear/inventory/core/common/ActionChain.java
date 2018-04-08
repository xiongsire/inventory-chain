package com.bear.inventory.core.common;

import java.util.List;
import com.google.common.collect.Lists;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
public class ActionChain implements Appendable {

    private CommonIntercept commonIntercept = new CommonIntercept();

    /**
     * action list
     */
    private List<IAction> actionList = Lists.newArrayList();

    /**
     * append action by class type
     * @param clazz
     * @return
     */
   @Override
    public ActionChain appendAction(Class<? extends IAction> clazz) {
        IAction iAction = ActionBeanFactory.getActionInstance(clazz);
        actionList.add(iAction);
        return this;
    }

    public void execute(ActionContext actionContext) {
        actionList.forEach(action -> {
            doAction(actionContext, action);
        });
    }

    private void doAction(ActionContext actionContext, IAction iAction) {
        try {
            commonIntercept.preIntercept(actionContext, iAction);
            iAction.execute(actionContext);
            commonIntercept.afterIntercept(actionContext, iAction);
        } catch (Exception e) {
            commonIntercept.errorIntercept(actionContext, iAction, e);
        } finally {
            commonIntercept.finalIntercept(actionContext, iAction);
        }
    }
}

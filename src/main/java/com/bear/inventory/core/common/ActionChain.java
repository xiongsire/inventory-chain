package com.bear.inventory.core.common;

import java.util.List;
import com.google.common.collect.Lists;

import static org.springframework.aop.support.AopUtils.getTargetClass;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
public class ActionChain<T extends ActionContext> implements Appendable {

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

    public ActionResult execute(T actionContext) {
       ActionResult actionResult = ActionResult.success();
       IAction<T> currentAction = null;
       while ((currentAction = nextAction(currentAction)) != null && actionResult.getSuccess()) {
           try {
               commonIntercept.preIntercept(actionContext, currentAction);
               currentAction.execute(actionContext);
               commonIntercept.afterIntercept(actionContext, currentAction);
           } catch (Exception e) {
               commonIntercept.errorIntercept(actionContext, currentAction, e, actionResult);
           } finally {
               commonIntercept.finalIntercept(actionContext, currentAction);
           }
       }
       return actionResult;
    }

    private IAction<T> nextAction(IAction<T> currentAction) {
        if (actionList.size() == 0) {
            return null;
        }
        if (currentAction == null) {
            return actionList.get(0);
        }
        int currIndex = -1;

        for (int i = 0; i < actionList.size(); i++) {
            if (actionList.get(i).getClass().equals(getTargetClass(currentAction))) {
                currIndex = i;
                break;
            }
        }
        if (currIndex == actionList.size() - 1) {
            return null;
        } else {
            return actionList.get(currIndex + 1);
        }
        // 不考虑会有 currIndex 小于零的情况
    }
}

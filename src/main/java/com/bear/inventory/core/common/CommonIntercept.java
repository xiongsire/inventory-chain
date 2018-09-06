package com.bear.inventory.core.common;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
public class CommonIntercept implements IInterceptor {

    @Override
    public void preIntercept(ActionContext actionContext, IAction iAction) {
        //System.out.println("pre intercept");
    }

    @Override
    public void afterIntercept(ActionContext actionContext, IAction iAction) {
        //System.out.println("after intercept");
    }

    @Override
    public void errorIntercept(ActionContext actionContext, IAction iAction, Throwable ex, ActionResult actionResult) {
        InventoryRuntimeException inventoryRuntimeException = (InventoryRuntimeException) ex;
        inventoryRuntimeException.getMessage();
        actionResult.setSuccess(false);
        System.out.println(inventoryRuntimeException.getMsg());
    }

    @Override
    public void finalIntercept(ActionContext actionContext, IAction iAction) {
        //System.out.println("final intercept");
    }
}

package com.bear.inventory.core.common;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
public interface IInterceptor {

    /**
     * pre intercept
     * @param actionContext
     */
    void preIntercept(ActionContext actionContext, IAction iAction);

    /**
     * after intercept
     * @param actionContext
     */
    void afterIntercept(ActionContext actionContext, IAction iAction);

    /**
     * error intercept
     * @param actionContext
     */
    void errorIntercept(ActionContext actionContext, IAction iAction, Throwable ex, ActionResult actionResult);

    /**
     * final intercept
     * @param actionContext
     */
    void finalIntercept(ActionContext actionContext, IAction iAction);
}

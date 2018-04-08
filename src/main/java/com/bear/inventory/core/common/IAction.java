package com.bear.inventory.core.common;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
public interface IAction<T extends ActionContext> {
    /**
     * execute action
     * @param actionContext
     * @throws RuntimeException
     */
    void execute(T actionContext);
}

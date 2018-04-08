package com.bear.inventory.core.common;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
public interface Appendable {

    /**
     * append action
     * @param clazz
     * @return
     */
    Appendable appendAction(Class<? extends IAction> clazz);
}

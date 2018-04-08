package com.bear.inventory.core.service;

import com.bear.inventory.core.increase.IncreaseContext;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
public interface InventoryService {
    void write(IncreaseContext increaseContext);
}

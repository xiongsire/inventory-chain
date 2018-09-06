package com.bear.inventory.core.service;

import com.bear.inventory.core.trade.TradeContext;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
public interface InventoryService {
    void write(TradeContext tradeContext);
}

package com.bear.inventory.core.impl;

import com.bear.inventory.core.common.ActionChain;
import com.bear.inventory.core.trade.*;
import com.bear.inventory.core.service.InventoryService;
import org.springframework.stereotype.Service;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    @Override
    public void write(TradeContext tradeContext) {
        ActionChain<TradeContext> actionChain = new ActionChain<>();
        actionChain
                .appendAction(TradePreCheckAction.class)
                .appendAction(TradeValidateAction.class)
                .appendAction(TradeGroupAction.class)
                .appendAction(TradeEventGenerateAction.class)
                .appendAction(TradeInventoryGenerateAction.class)
                .appendAction(TradeTransactionalAction.class);
        actionChain.execute(tradeContext);
    }
}

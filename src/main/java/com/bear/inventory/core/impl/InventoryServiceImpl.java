package com.bear.inventory.core.impl;

import com.bear.inventory.core.common.ActionChain;
import com.bear.inventory.core.increase.IncreaseContext;
import com.bear.inventory.core.increase.PreCheckAction;
import com.bear.inventory.core.increase.ValidateAction;
import com.bear.inventory.core.service.InventoryService;
import org.springframework.stereotype.Service;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    @Override
    public void write(IncreaseContext increaseContext) {
        ActionChain actionChain = new ActionChain();
        actionChain.appendAction(PreCheckAction.class).appendAction(ValidateAction.class);
        actionChain.execute(increaseContext);
    }
}

package com.bear.inventory.core.trade;

import com.bear.inventory.core.common.IAction;
import org.springframework.stereotype.Component;

/**
 * @author Xiongmin
 * 2018/9/4
 */
@Component
public class TradeInventoryGenerateAction implements IAction<TradeContext> {

    /**
     * 根据 eventEnrichDTOS 生成待更新的 inventoryUpdateMap, inventoryLog,
     * @param actionContext
     */
    @Override
    public void execute(TradeContext actionContext) {
        System.out.println("5. TradeInventoryGenerateAction：生成待更新的 inventoryUpdateMap, 待插入 inventoryLog");
    }
}

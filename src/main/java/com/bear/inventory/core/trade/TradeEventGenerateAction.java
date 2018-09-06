package com.bear.inventory.core.trade;

import com.bear.inventory.core.common.IAction;
import org.springframework.stereotype.Component;

/**
 * @author Xiongmin
 * 2018/9/4
 */
@Component
public class TradeEventGenerateAction implements IAction<TradeContext> {

    /**
     * 根据分组查库存，不存在则终止责任链
     * 根据分组构建 insertEventList, updateEventList, eventEnrichDTOS, inventoryMap
     * EventEnrichDTO 结构：inventoryEvent，realQuantity，withholdQuantityDelta，occupyQuantityDelta，isUpdate
     * @param actionContext
     */
    @Override
    public void execute(TradeContext actionContext) {
        System.out.println("4. TradeEventGenerateAction：生成 insertEventList, updateEventList, eventEnrichDTOS, inventoryMap");
    }
}

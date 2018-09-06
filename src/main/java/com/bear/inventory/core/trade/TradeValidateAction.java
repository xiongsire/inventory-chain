package com.bear.inventory.core.trade;

import com.bear.inventory.core.common.IAction;
import com.bear.inventory.core.common.InventoryRuntimeException;
import org.springframework.stereotype.Component;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Component
public class TradeValidateAction implements IAction<TradeContext> {

    /**
     * 1. 跟据 tradeRequests，查询已经存在的 existEventMap（比如当前是 occupy 操作，可以先查出对应的 withhold event，最终是要更新 event，而不是每次都插入新的 event）
     * 2. 遍历已存在 existEventMap，校验状态流转的合法性，同时从 tradeRequests 中移除幂等请求
     * 3. 如果所有请求都是幂等的（即 tradeRequests 已经被移空了），直接设置幂等字段为 true，结束责任链，否则继续
     * @param actionContext
     */
    @Override
    public void execute(TradeContext actionContext) {
        System.out.println("2. TradeValidateAction：校验状态流转的合法性，幂等性校验");
        //throw new InventoryRuntimeException("合法性校验失败，终止责任链");
    }
}

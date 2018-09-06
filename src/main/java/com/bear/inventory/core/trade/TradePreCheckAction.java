package com.bear.inventory.core.trade;

import com.bear.inventory.core.common.IAction;
import org.springframework.stereotype.Component;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Component
public class TradePreCheckAction implements IAction<TradeContext> {

    /**
     * 前置校验参数的合法性
     * 1. 请求最大长度限制
     * 2. 请求参数大于零限制
     * @param actionContext
     */
    @Override
    public void execute(TradeContext actionContext) {
        System.out.println("1. TradePreCheckAction：前置参数校验");
    }
}

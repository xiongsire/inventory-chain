package com.bear.inventory.core.trade;

import com.bear.inventory.core.common.IAction;
import org.springframework.stereotype.Component;

/**
 * @author Xiongmin
 * 2018/9/6
 */
@Component
public class TradeTransactionalAction implements IAction<TradeContext> {
    @Override
    public void execute(TradeContext actionContext) {
        System.out.println("6. TradeTransactionalAction：执行事务操作");
    }
}

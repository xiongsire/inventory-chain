package com.bear.inventory.core.trade;

import com.bear.inventory.core.common.IAction;
import org.springframework.stereotype.Component;

/**
 * @author Xiongmin
 * 2018/9/4
 */
@Component
public class TradeGroupAction implements IAction<TradeContext> {

    @Override
    public void execute(TradeContext context) throws RuntimeException {
        System.out.println("3. TradeGroupAction：按照唯一库存行分组");
    }
}
package com.bear.inventory.core.trade;

import com.bear.inventory.core.common.IAction;
import org.springframework.stereotype.Component;

/**
 * @author Xiongmin
 * 2018/9/4
 */
@Component
public class SKULineGroupAction implements IAction<IncreaseContext> {

    @Override
    public void execute(IncreaseContext context) throws RuntimeException {

        // 对订单下不同 sku 按照唯一库存行分组
        System.out.println("拆分");
    }
}
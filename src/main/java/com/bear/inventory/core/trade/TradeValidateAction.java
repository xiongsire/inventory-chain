package com.bear.inventory.core.trade;

import com.bear.inventory.core.common.IAction;
import com.bear.inventory.core.common.InventoryRuntimeException;
import org.springframework.stereotype.Component;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Component
public class ValidateAction implements IAction<IncreaseContext> {

    @Override
    public void execute(IncreaseContext actionContext) {
        System.out.println("validate action, count must gt 0: " + (actionContext.getCount() > 0));
        throw new InventoryRuntimeException("validate false");
    }
}

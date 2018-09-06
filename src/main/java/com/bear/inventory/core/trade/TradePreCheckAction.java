package com.bear.inventory.core.trade;

import com.bear.inventory.core.common.IAction;
import org.springframework.stereotype.Component;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Component
public class PreCheckAction implements IAction<IncreaseContext> {

    @Override
    public void execute(IncreaseContext actionContext) {
        System.out.println("pre check action, it is idempotent: " + actionContext.getIdempotent());
    }
}

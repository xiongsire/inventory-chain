package com.bear.inventory.core.increase;

import com.bear.inventory.core.common.ActionContext;
import lombok.Builder;
import lombok.Data;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Builder
@Data
public class IncreaseContext extends ActionContext {
    /**
     * increase count
     */
    private Integer count;
    /**
     * is idempotent
     */
    private Boolean idempotent;
}

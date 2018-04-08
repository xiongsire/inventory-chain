package com.bear.inventory.core.common;

import lombok.Data;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Data
public class ActionContext {

    private String traceId;

    private String startTime;

    private String endTime;

    private boolean idempotent;
}

package com.bear.inventory.core.common;

import lombok.Data;

/**
 * @author Xiongmin
 * 2018/9/6
 */
@Data
public class ActionResult<T> {

    private Boolean success;

    private String errorCode;

    private String errorMsg;

    private T data;

    ActionResult(boolean success) {
        this.success = success;
    }

    public static ActionResult success() {
        return new ActionResult(true);
    }
}

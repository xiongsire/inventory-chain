package com.bear.inventory.core.common;

import lombok.Data;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Data
public class InventoryRuntimeException extends RuntimeException {
    private String msg;
    public InventoryRuntimeException(String msg) {
        this.msg = msg;
    }
}

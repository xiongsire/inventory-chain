package com.bear.inventory.core.trade;

import com.bear.inventory.core.common.ActionContext;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Builder
@Data
public class TradeContext extends ActionContext {

    /**
     *  WITHHOLD / OCCUPY/ CONFIRM /CANCEL
     */
    private Integer status;

    /**
     * is idempotent
     */
    private Boolean idempotent;

    /**
     * 交易请求（此处为了省事，忽略了 TradeRequest 类的定义）
     */
    private List tradeRequests;

    /**
     * 已经存在的 event map，key 是唯一库存行
     */
    private Map existEventMap;
}

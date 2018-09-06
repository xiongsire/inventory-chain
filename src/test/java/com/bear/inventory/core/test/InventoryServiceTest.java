package com.bear.inventory.core.test;

import com.bear.inventory.core.trade.TradeContext;
import com.bear.inventory.core.service.InventoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InventoryServiceTest {
    @Autowired
    private InventoryService inventoryService;

    @Test
    public void test() {
        TradeContext tradeContext =
            TradeContext.builder().idempotent(false).build();
        inventoryService.write(tradeContext);
    }
}
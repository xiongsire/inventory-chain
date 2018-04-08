package com.bear.inventory.core.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author xiongmin
 * @since 2018/04/08
 */
@Service
public class ActionBeanFactory implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ActionBeanFactory.applicationContext = applicationContext;
    }

    public static <T extends ActionContext> IAction getActionInstance(Class<? extends IAction> clazz) {
        return applicationContext.getBean(clazz);
    }
}

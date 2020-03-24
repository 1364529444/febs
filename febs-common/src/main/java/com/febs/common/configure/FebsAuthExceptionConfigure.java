package com.febs.common.configure;

import com.febs.common.handler.FebsAccessDeniedHandler;
import com.febs.common.handler.FebsAuthExceptionEntryPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * 注册FebsAccessDeniedHandler和FebsAuthExceptionEntryPoint
 * @ConditionalOnMissingBean注解的意思是，当IOC容器中没有指定名称或类型的Bean的时候，就注册它
 */
public class FebsAuthExceptionConfigure {
    @Bean
    @ConditionalOnMissingBean(name = "accessDeniedHandler")
    public FebsAccessDeniedHandler accessDeniedHandler() {
        return new FebsAccessDeniedHandler();
    }

    @Bean
    @ConditionalOnMissingBean(name = "authenticationEntryPoint")
    public FebsAuthExceptionEntryPoint authenticationEntryPoint() {
        return new FebsAuthExceptionEntryPoint();
    }
}

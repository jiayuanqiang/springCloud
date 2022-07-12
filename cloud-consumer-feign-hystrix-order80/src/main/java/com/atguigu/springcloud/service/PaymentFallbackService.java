package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2019-11-12 11:12
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService ok...服务降级";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService time...服务降级";
    }
}

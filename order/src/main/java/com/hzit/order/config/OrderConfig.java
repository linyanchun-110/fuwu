package com.hzit.order.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@Data
public class OrderConfig {
   @Value("${order.goods.url}")
    private String ItemUrl;
}

package com.hzit.order.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@RefreshScope
@Data
public class JdbcConfigBean {
    @Value("${jdbc.url}")
    private String url;

}

package com.hzit.order.controller;

import com.hzit.order.config.JdbcConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJdbcConfig {
    @Autowired
    private JdbcConfigBean jdbcConfigBean;
    @RequestMapping("/configUrl")
    public String queryConfigUrl(){
        String url=jdbcConfigBean.getUrl();
        return url;
    }
}

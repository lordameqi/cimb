package com.starterkit.springboot.brs.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:custom.properties")
public class PropertiesConfig {
    @Autowired
    private Environment environtment;

    public String getConfigValue(String configKey) {
        return environtment.getProperty(configKey);
    }
}

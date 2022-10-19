package com.cimb.springbootujian.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class PropertiesConfig {
    @Autowired
    private Environment env;

    public String getConfigValue(String config){
        return env.getProperty(config);
    }
}

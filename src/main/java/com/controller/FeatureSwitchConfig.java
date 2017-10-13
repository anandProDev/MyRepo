package com.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myFlag")
public class FeatureSwitchConfig {

    boolean enabled;
}

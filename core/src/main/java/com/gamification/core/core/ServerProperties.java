package com.gamification.core.core;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
@Getter
@Setter
public class ServerProperties {

    private String name;
    private String environment;
    private boolean enabled;
    private List<String> servers = new ArrayList<>();

}

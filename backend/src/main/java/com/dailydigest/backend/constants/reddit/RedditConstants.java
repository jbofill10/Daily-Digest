package com.dailydigest.backend.constants.reddit;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(value = "reddit")
@Data
public class RedditConstants {
    private String redditUrl;
    private String userAgent;
    private String userAgentArgs;
    private String json;
}

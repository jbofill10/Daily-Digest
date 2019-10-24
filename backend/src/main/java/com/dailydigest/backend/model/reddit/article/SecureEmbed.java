package com.dailydigest.backend.model.reddit.article;

import lombok.Data;

@Data
public class SecureEmbed {
    private String content;
    private int width;
    private boolean scrolling;
    private String mediaDomainUrl;
    private int height;
}

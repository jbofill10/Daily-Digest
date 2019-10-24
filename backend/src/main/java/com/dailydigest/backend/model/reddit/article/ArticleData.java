package com.dailydigest.backend.model.reddit.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticleData {
    private String title;
    private String subreddit_name_prefixed;
    private int ups;
    private SecureEmbed secure_media_embed;
    private String permalink;
    private String url;
    private String author;
}

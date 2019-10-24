package com.dailydigest.backend.model.reddit.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Parent {
    private ParentData data;
}

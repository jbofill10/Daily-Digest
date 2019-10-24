package com.dailydigest.backend.model.reddit.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParentData {
    private ArrayList<Article> children;
}

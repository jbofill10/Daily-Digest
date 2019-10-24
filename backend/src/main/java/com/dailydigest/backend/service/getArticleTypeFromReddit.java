package com.dailydigest.backend.service;

import com.dailydigest.backend.model.reddit.article.Article;
import com.dailydigest.backend.model.reddit.article.Parent;
import com.dailydigest.backend.model.reddit.article.ParentData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
@RestController
@RequestMapping(value = "/api/")
public class getArticleTypeFromReddit {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "reddit/{subreddit}", method = RequestMethod.GET)
    public ArrayList<Article> getArticle(@PathVariable("subreddit") String subreddit) {

        ObjectMapper objectMapper = new ObjectMapper();

        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "DailyDigest by RationalRepublican10");
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Parent> response = restTemplate.exchange("https://www.reddit.com/r/programming.json", HttpMethod.GET, entity, Parent.class);
        Parent parent = response.getBody();

        return parent.getData().getChildren();
    }
}
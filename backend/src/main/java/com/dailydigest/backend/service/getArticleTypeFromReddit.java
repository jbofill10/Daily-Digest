package com.dailydigest.backend.service;

import com.dailydigest.backend.constants.reddit.RedditConstants;
import com.dailydigest.backend.model.reddit.article.Article;
import com.dailydigest.backend.model.reddit.article.Parent;
import com.dailydigest.backend.model.reddit.article.ParentData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    RedditConstants redditConstants;

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "reddit/{subreddit}", method = RequestMethod.GET)
    public ArrayList<Article> getArticle(@PathVariable("subreddit") String subreddit) {

        ObjectMapper objectMapper = new ObjectMapper();

        HttpHeaders headers = new HttpHeaders();
        headers.add(redditConstants.getUserAgent(), redditConstants.getUserAgentArgs());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Parent> response = restTemplate.exchange(redditConstants.getRedditUrl() + "/r/" + subreddit + redditConstants.getJson(), HttpMethod.GET, entity, Parent.class);
        Parent parent = response.getBody();

        if (response.getStatusCode().equals(HttpStatus.OK)) {
            if (parent != null) {
                return parent.getData().getChildren();
            } else {
                return null;
            }
        }

        return null;
    }
}
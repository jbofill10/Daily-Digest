package com.dailydigest.backend.service;

import com.dailydigest.backend.model.reddit.Article;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service
@RestController
@RequestMapping(value = "/api/")
public class getArticleTypeFromReddit {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "reddit/{subreddit}", method = RequestMethod.GET)
    public void getArticle(@PathVariable("subreddit") String subreddit){
        Article article = new Article();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange("https://www.reddit.com/r/programming.json", HttpMethod.GET, entity, String.class);
        System.out.println(response.getBody());
    }
}

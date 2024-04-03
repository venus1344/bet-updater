package org.rdxi.betupdater.booker.Leagues;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
@RestController
public class LeagueController {

    @Value("${base_url}")
    private String base_uri;

    @Value("${api_key}")
    private String api_key;

    private WebClient webClient;

    @GetMapping("/api/v1/call/leagues")
    public Object getLeagues() {
        String uri = base_uri + "/sports?apiKey=" + api_key;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, Object.class);
    }
}

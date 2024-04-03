package org.rdxi.betupdater.booker.Odds;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
@RestController
public class OddController {

    @Value("${base_url}")
    private String base_uri;

    @Value("${api_key}")
    private String api_key;

    @GetMapping("/api/v1/call/odds")
    public Object getEplOdds() {
        String uri = base_uri + "/sports/soccer_epl/odds?apiKey=" + api_key
                +"&regions=eu&" +
                "markets=h2h,spreads" +
                "&dateFormat=iso" +
                "&oddsFormat=decimal";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, Object.class);
    }
}

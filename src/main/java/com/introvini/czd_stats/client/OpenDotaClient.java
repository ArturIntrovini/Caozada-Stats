package com.introvini.czd_stats.client;

import com.introvini.czd_stats.dto.PlayerResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
public class OpenDotaClient {

    private final WebClient client;

    public OpenDotaClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("https://api.opendota.com/api").build();
    }

    public List<PlayerResponse> getPlayerMatches(int playerID, int date) {
        return client
                .get()
                .uri(
                        uriBuilder -> uriBuilder
                        .path("/players/" + playerID + "/matches")
                        .queryParam("date", date)
                        .queryParam("lobby_type", 7)
                        .build()
                )
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<PlayerResponse>>(){})
                .block();
    }

}
package com.introvini.czd_stats.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecificMatchResponse {

    @JsonProperty("match_id")
    public long matchID;
    @JsonProperty("lobby_type")
    public int lobby_type;

}
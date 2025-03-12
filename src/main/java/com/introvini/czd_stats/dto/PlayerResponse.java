package com.introvini.czd_stats.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerResponse {

    @JsonProperty("match_id")
    private long matchID;
    @JsonProperty("player_slot")
    private int playerSlot;
    @JsonProperty("radiant_win")
    private boolean radiantWin;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("start_time")
    private int start_time;
    @JsonProperty("kills")
    private int kills;
    @JsonProperty("assists")
    private int assists;
    @JsonProperty("deaths")
    private int deaths;

}
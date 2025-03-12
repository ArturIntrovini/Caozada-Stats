package com.introvini.czd_stats.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "player_matches")
public class PlayerEntity {

    @Id
    private long matchID;
    private int playerSlot;
    private boolean radiantWin;
    private int duration;
    private int start_time;
    private int kills;
    private int assists;
    private int deaths;

}
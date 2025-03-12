package com.introvini.czd_stats.controller;

import com.introvini.czd_stats.model.PlayerEntity;
import com.introvini.czd_stats.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/{playerID}")
    public List<PlayerEntity> getMatchesByPlayerID(@PathVariable int playerID, @RequestParam int date) {

        return playerService.getMatchesByPlayerID(playerID, date);

    }

}
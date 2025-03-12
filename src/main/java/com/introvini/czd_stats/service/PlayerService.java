package com.introvini.czd_stats.service;

import com.introvini.czd_stats.client.OpenDotaClient;
import com.introvini.czd_stats.dto.PlayerResponse;
import com.introvini.czd_stats.mapper.PlayerMapper;
import com.introvini.czd_stats.model.PlayerEntity;
import com.introvini.czd_stats.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository repository;
    private final PlayerMapper mapper;
    private final OpenDotaClient client;

    public PlayerService(PlayerRepository repository, PlayerMapper mapper, OpenDotaClient client) {
        this.repository = repository;
        this.mapper = mapper;
        this.client = client;
    }

    public List<PlayerEntity> getMatchesByPlayerID(int playerID, int date) {
        List<PlayerResponse> response = client.getPlayerMatches(playerID, date);
        return repository.saveAll(mapper.toEntity(response));
    }

}
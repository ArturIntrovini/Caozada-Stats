package com.introvini.czd_stats.mapper;

import com.introvini.czd_stats.dto.PlayerResponse;
import com.introvini.czd_stats.model.PlayerEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    PlayerEntity toEntity(PlayerResponse response);

    List<PlayerEntity> toEntity(List<PlayerResponse> response);

}
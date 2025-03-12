package com.introvini.czd_stats.repository;

import com.introvini.czd_stats.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {

}
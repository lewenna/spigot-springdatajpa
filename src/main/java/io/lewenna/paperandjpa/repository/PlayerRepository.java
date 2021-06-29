package io.lewenna.paperandjpa.repository;

import io.lewenna.paperandjpa.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}

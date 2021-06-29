package io.lewenna.paperandjpa.service;

import io.lewenna.paperandjpa.entity.Player;
import io.lewenna.paperandjpa.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("playerService")
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    public void addPlayer(Player player){
        playerRepository.save(player);
    }
}

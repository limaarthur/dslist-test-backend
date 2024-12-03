package com.ignitec.dslist.services;

import com.ignitec.dslist.dtos.GameMinDTO;
import com.ignitec.dslist.dtos.GameDTO;
import com.ignitec.dslist.entities.Game;
import com.ignitec.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = gameRepository.findById(id).get();
        GameDTO gameDTO = new GameDTO(game);
        return gameDTO;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> listGame = gameRepository.findAll();
        List<GameMinDTO> gameMinDTO = listGame.stream().map(game -> new GameMinDTO(game)).toList();
        return gameMinDTO;
    }
}


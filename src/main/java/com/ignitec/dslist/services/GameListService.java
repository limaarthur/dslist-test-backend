package com.ignitec.dslist.services;

import com.ignitec.dslist.dtos.GameDTO;
import com.ignitec.dslist.dtos.GameListDTO;
import com.ignitec.dslist.dtos.GameMinDTO;
import com.ignitec.dslist.entities.Game;
import com.ignitec.dslist.entities.GameList;
import com.ignitec.dslist.repositories.GameListRepository;
import com.ignitec.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> listGame = gameListRepository.findAll();
        List<GameListDTO> gameListDTO = listGame.stream().map(game -> new GameListDTO(game)).toList();
        return gameListDTO;
    }
}


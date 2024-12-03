package com.ignitec.dslist.dtos;

import com.ignitec.dslist.entities.GameList;

public record GameListDTO(Long id, String name) {
    public GameListDTO(GameList gameList) {
        this(gameList.getId(), gameList.getName());
    }
}

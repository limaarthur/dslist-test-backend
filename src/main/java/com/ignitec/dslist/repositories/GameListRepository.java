package com.ignitec.dslist.repositories;

import com.ignitec.dslist.entities.Game;
import com.ignitec.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}

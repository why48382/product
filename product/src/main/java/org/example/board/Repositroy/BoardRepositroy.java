package org.example.board.Repositroy;

import org.example.board.model.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepositroy extends JpaRepository <BoardEntity, Integer>{
List<BoardEntity> findByTitle(String title);

}

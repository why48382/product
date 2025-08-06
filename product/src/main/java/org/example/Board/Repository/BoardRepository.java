package org.example.board.Repository;

import org.example.board.model.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository <BoardEntity, Integer>{
List<BoardEntity> findByTitle(String title);

}

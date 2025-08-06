package org.example.board.service;


import org.example.board.Repository.BoardRepository;
import org.example.board.model.BoardDto;
import org.example.board.model.BoardEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    private final BoardRepository boardRepository;
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void save(BoardDto.Register dto) {
        boardRepository.save(dto.toEntity());
    }

    public List<BoardDto.Board> list() {
        List<BoardEntity> result = boardRepository.findAll();
        return result.stream().map(BoardDto.Board::from).toList();
    }

    public BoardDto.Board read(Integer idx) {
        Optional<BoardEntity> result = boardRepository.findById(idx);

        if (result.isPresent()) {
            BoardEntity entity = result.get();

            return BoardDto.Board.from(entity);
        }
        return null;
    }
}

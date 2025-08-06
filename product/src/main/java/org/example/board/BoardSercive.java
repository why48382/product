package org.example.board;

import org.example.product.model.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardSercive {
    private final BoardRepository boardRepository;
    public BoardSercive(BoardRepository boardRepository) {
        this.BoardRepository = boardRepository;
    }

    public void save(BoardDto.Resister dto) {
        boardRepository.save(dto.toEntity());
    }

    public List<BoardDto.Board> list() {
        List<BoardEntity> result = boardRepository.findAll();
        return result.stream().map(BoardDto.board::from).toList();
    }

    public List<BoardDto.Board> read(Integer idx) {
        List<BoardEntity> result = boardRepository.findById(idx);
        return result.stream().map(BoardDto.board::from).toList();
    }
}

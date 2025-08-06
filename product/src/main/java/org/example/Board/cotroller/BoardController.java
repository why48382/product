package org.example.board.cotroller;

import org.example.board.model.BoardDto;


import org.example.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/save")
    public ResponseEntity boardSave(@RequestBody BoardDto.Register dto) {
        boardService.save(dto);
        return ResponseEntity.status(200).body("저장 성공");
    }

    @GetMapping("/read")
    public ResponseEntity boardRead(Integer idx) {
        BoardDto.Board result = boardService.read(idx);
        return ResponseEntity.status(200).body(result);
    }

    @GetMapping("/list")
    public ResponseEntity BoardList() {
        List<BoardDto.Board> list = boardService.list();
        return ResponseEntity.status(200).body(list);
    }
}

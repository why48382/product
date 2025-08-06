package org.example.product.Board.cotroller;

import org.example.product.Board.model.BoardDto;
import org.example.product.Board.service.BoardService;
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
        boardService.register(dto);
        return ResponseEntity.status(200).body("저장 성공");
    }

    @GetMapping("/read")
    public ResponseEntity boardRead(Integer idx) {
        BoardDto.board result = boardService.read(idx);
        return ResponseEntity.status(200).body(result);
    }

    @GetMapping("/list")
    public ResponseEntity BoardList() {
        List<BoardDto.board> list = boardService.list();
        return ResponseEntity.status(200).body(list);
    }
}

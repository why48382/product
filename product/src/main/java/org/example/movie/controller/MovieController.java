package org.example.movie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieController movieController) {
        this.movieController = movieController;
    }

    @PostMapping("/save")
    public ResponseEntity Save(@RequestBody MovieDto.Register dto) {
        movieService.register(dto);
        return ResponseEntity.status(200).body("저장 성공");
    }

    @GetMapping("/read")
    public ResponseEntity Read(Integer idx) {
        MovieDto.Movie result = movieService.read(idx);
        return ResponseEntity.status(200).body(result);
    }

    @GetMapping("/list")
    public ResponseEntity List() {
        List<MovieDto.Movie> list = movieService.list();
        return ResponseEntity.status(200).body(list);


}

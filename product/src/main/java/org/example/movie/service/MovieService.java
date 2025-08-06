package org.example.movie.service;

import lombok.RequiredArgsConstructor;
import org.example.movie.model.MovieEntity;
import org.example.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
    // 어노테이션으로 생성자 생성

    public void save(MovieDto.resister dto) {
        movieRepository.save(dto.toEntity());
    }

    public MovieDto.movie read(Integer id) {
        Optional<MovieEntity> result = movieRepository.findById(id);
        if (result.isPresent()) {
            MovieEntity entity = result.get();
            return MovieDto.movie.from(entity);
        }
        return null;
    }

    public List<MovieDto.movie> list() {
        List<MovieEntity> result = movieRepository.findAll();
        return result.stream().map(MovieDto.movie::from).toList();
    }
}

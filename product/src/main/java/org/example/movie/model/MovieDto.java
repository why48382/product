package org.example.movie.model;

import lombok.Builder;
import lombok.Getter;
@Getter

public class MovieDto {
    @Builder
    public static class Movie{
        private Integer idx;
       private String title;
       private String showtime;
       private String content;

       private static MovieDto.Movie from(MovieEntity entity){
           MovieDto.Movie dto = Movie.builder()
                   .idx(entity.getIdx)
                   .title(entity.getTitle)
                   .showtime(entity.getShowtime)
                   .content(entity.getContent)
                   .build() ;
            return  dto;
       }


        @Getter
        public static class Register {
            private String title;
            private String showtime;
            private String content;

            public MovieEntity toEntity() {
                MovieEntity entity = MovieEntity.builder()
                        .title(title)
                        .showtime(showtime)
                        .content(content)
                        .build();
                return entity;
            }
        }
    }
    }
}

package org.example.board.model;


import org.example.board.model.BoardEntity;

public class BoardDto {
    public static class Board {
        private Integer idx;
        private String title;
        private String content;

        public static BoardDto.Board from(BoardEntity entity) {
            BoardDto.Board dto = new BoardDto.Board();
            dto.setTitle(entity.getTitle());
            dto.setContent(entity.getContent());

            return dto;
        }

        public Integer getIdx() {
            return idx;
        }

        public void setIdx(Integer idx) {
            this.idx = idx;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }



    }

    public static class Register {
        private String title;
        private String content;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public BoardEntity toEntity() {
            BoardEntity entity = new BoardEntity();
            entity.setName(title);
            entity.setDetail(content);

            return entity;
        }


    }
}

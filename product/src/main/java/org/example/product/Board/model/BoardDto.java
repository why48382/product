package org.example.product.Board.model;

public class BoardDto {
    public static class board {
        private Integer idx;
        private String title;
        private String content;

        public static BoardDto.board from(BoardEntity entity) {
            Boarddto.board dto = new BoardDto.board();
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

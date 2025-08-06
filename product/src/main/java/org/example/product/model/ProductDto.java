package org.example.product.model;

public class ProductDto {
    public static class product {
        private Integer idx;
        private String detail;
        private String name;
        private Integer price;

        public static ProductDto.product from(ProductEntity entity) {
            ProductDto.product dto = new ProductDto.product();
            dto.setIdx(entity.getIdx);
            dto.setDetail(entity.getDetail());
            dto.setName(entity.getName());
            dto.setPrice(entity.getPrice());

            return dto;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getIdx() {
            return idx;
        }

        public void setIdx(Integer idx) {
            this.idx = idx;
        }
    }

    public static class Register {
        private String detail;
        private String name;
        private Integer price;


        public ProductEntity toEntity() {
            ProductEntity entity = new ProductEntity();
            entity.setName(name);
            entity.setDetail(detail);
            entity.setPrice(price);

            return entity;
        }


    }
}

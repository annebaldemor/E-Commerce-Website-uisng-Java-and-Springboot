package com.middle.app.midrest.Models;

import javax.persistence.*;

@Entity
public class AddToCart {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column
        private String ProductName;
        @Column
        private String ProductCode;
        @Column
        private int Price;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getProductName() {
            return ProductName;
        }

        public void setProductName(String ProductName) {
            this.ProductName = ProductName;
        }

        public String getProductCode() {
            return ProductCode;
        }

        public void setProductCode(String ProductCode) {
            this.ProductCode = ProductCode;
        }

        public int getPrice() {
            return Price;
        }

        public void setPrice(int Price) {
            this.Price = Price;
        }
}


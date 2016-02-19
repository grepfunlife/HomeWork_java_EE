package com.grepfunlife.entity; /**
 * Created by love_polyanskaya on 05.02.16.
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sl_product")

public class Product implements  Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="product_gen")
    @SequenceGenerator(name="product_gen", sequenceName="sl_product_product_id_seq")
    @Column(name = "product_id")
    private long productId;
    @Column(name = "productname")
    private String productName;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category categoryName;
    @Column(name = "comment")
    private String comment;
    @Column(name = "in_list")
    private boolean inList;

    public Product() {

    }

    public Product(String productName) { this.productName = productName; }

    public long getProductId() { return productId; }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isInList() {
        return inList;
    }

    public void setInList(boolean inList) {
        this.inList = inList;
    }

    public String getProductName() { return productName; }

    public void setProductName(String productName) { this.productName = productName; }

    public Category getCategoryName() { return categoryName; }

    public void setCategoryName(Category categoryName) { this.categoryName = categoryName; }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", categoryName=" + categoryName +
                ", comment='" + comment + '\'' +
                ", inList=" + inList +
                '}';
    }
}
package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "soldproducts")
public class SoldProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "piece", nullable = false)
    private int piece;

    @Column(name = "in_basket")
    private boolean in_basket;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bill_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Bill bill;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public boolean isIn_basket() {
        return in_basket;
    }

    public void setIn_basket(boolean in_basket) {
        this.in_basket = in_basket;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}

package com.middle.app.midrest.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddItem {

    @Id
    private long itemId;
    @Column
    private String itemName;
    @Column
    private String itemSpecs;
    @Column
    private int itemPrice;
    @Column
    private int itemAmount;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemSpecs() {
        return itemSpecs;
    }

    public void setItemSpecs(String itemSpecs) {
        this.itemSpecs = itemSpecs;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }
}

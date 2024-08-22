package com.middle.app.midrest.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Checkout {

    @Id
    private long checkoutID;
    @Column
    private String orderedID;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private long contactNumber;
    @Column
    private int totalAmount;

    public long getCheckoutID() {
        return checkoutID;
    }
    public void setCheckoutID(long checkoutID) {
        this.checkoutID = checkoutID;
    }

    public String getOrderedID() {

        return orderedID;
    }

    public void setOrderedID(String orderedID) {
        this.orderedID = orderedID;
    }

    public String getAddress() {

        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {

        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getTotalAmount() {

        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}

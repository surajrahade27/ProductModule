package com.simplevat.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iProductCode;
    private String sName;
    private double  fVatPercentage;
    private int iUnit;

    public int getiProductCode() {
        return iProductCode;
    }

    public void setiProductCode(int iProductCode) {
        this.iProductCode = iProductCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getfVatPercentage() {
        return fVatPercentage;
    }

    public void setfVatPercentage(double fVatPercentage) {
        this.fVatPercentage = fVatPercentage;
    }

    public int getiUnit() {
        return iUnit;
    }

    public void setiUnit(int iUnit) {
        this.iUnit = iUnit;
    }
}

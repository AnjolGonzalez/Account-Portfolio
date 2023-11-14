package com.pluralsightfinance;

public class Jewelry extends FixedAsset{
    double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }
    public double getValue() {
        return 0;
    }
    public double getKarat() {
        return karat;
    }
    public void setKarat(double karat) {
        this.karat = karat;
    }
}

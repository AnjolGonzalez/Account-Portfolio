package com.pluralsightfinance;

public class House extends FixedAsset{

    public int yearBuild, squareFeet, bedrooms;
    public House(String name, double marketValue, int yearBuild, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuild = yearBuild;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public double getValue() {
        return 0;
    }
    public int getYearBuild() {
        return yearBuild;
    }

    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
}

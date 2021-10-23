package com.generation.uber;

public class UberDriver {

    private String name;
    private String carModel;
    private String plate;
    private int minimum=7;
    private double ratePerKm = 1.5;
    private int ratePerMinute = 1;
    private int currentMonthSalary = 0;

    public double calculatePrice(double km) {
        return Math.max(ratePerKm*km,7);
    }


    public String getName() {
        return name;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getPlate() {
        return plate;
    }

    public int getMinimum() {
        return minimum;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public int getRatePerMinute() {
        return ratePerMinute;
    }

    public int getCurrentMonthSalary() {
        return currentMonthSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public void setRatePerMinute(int ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    public void setCurrentMonthSalary(int currentMonthSalary) {
        this.currentMonthSalary = currentMonthSalary;
    }

    /*public String name;
    public int age;
    String car;
    String licence;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCar() {
        return car;
    }

    public String getLicence() {
        return licence;
    }

    public UberDriver (String name, int age, String car, String licence) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.licence = licence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }*/
}

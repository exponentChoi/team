package com.example.weather.Model;

public class Main {
    private double temp;
    private double pressure;
    private int humideity;
    private double temp_min;
    private double temp_max;

    public Main(double temp, double pressure, int humideity, double temp_min, double temp_max) {
        this.temp = temp;
        this.pressure = pressure;
        this.humideity = humideity;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumideity() {
        return humideity;
    }

    public void setHumideity(int humideity) {
        this.humideity = humideity;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }
}

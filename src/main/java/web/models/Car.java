package web.models;

public class Car {
    private String brand;
    private int yearOfProduction;
    private String series;

    public Car() {
    }

    public Car(String brand, int yearOfProduction, String series) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}

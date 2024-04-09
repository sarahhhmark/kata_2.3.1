package web.models;

public class Car {
    private static int COUNT;
    private int id;
    private String model;
    private String series;
    private String color;

    public Car(String model, String series, String color) {
        this.id = ++COUNT;
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

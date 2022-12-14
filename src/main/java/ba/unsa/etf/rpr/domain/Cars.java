package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Cars {
    private int idCar;
    private String Name,color;
    private boolean available;
    private int price;

    public int getIdCar() {
        return idCar;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return Name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cars)) return false;
        Cars cars = (Cars) o;
        return getIdCar() == cars.getIdCar() && isAvailable() == cars.isAvailable() && getPrice() == cars.getPrice() && getName().equals(cars.getName()) && getColor().equals(cars.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdCar(), getName(), getColor(), isAvailable(), getPrice());
    }
}

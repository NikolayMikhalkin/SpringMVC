package web.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Car {

    private String model;
    private int horsePower;
    private String carBodyType;

    public Car() {

    }

    public Car (String model, int horsePower, String carBodyType) {
        this.model = model;
        this.horsePower = horsePower;
        this.carBodyType = carBodyType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    public static List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", 200, "sedan"));
        cars.add(new Car("BMW", 250, "crossover"));
        cars.add(new Car("Lada", 90, "sedan"));
        cars.add(new Car("Haval", 180, "crossover"));
        cars.add(new Car("Honda", 160, "universal"));
        return cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", carBodyType='" + carBodyType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower && Objects.equals(model, car.model) && Objects.equals(carBodyType, car.carBodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, horsePower, carBodyType);
    }
}

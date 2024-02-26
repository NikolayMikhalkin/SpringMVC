package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarSiervice{

    @Override
    public List<Car> createCarsList(int n) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cars.add(new Car());
        }
        return cars;
    }

    @Override
    public List<Car> getCars(int n) {
        return createCarsList(n);
    }
}

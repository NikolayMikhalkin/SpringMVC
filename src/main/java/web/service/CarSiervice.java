package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarSiervice {

    public List<Car> createCarsList(int n);

    public List<Car> getCars(int n);
}

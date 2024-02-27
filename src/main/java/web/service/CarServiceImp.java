package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> cars = Car.getCarList();
        if (count == null || count < 1 || count > 5) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}

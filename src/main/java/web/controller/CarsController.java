package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarsController {

    private final CarService carServiceImp;

    @Autowired
    public CarsController (CarService carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "5", required = false) Integer count, ModelMap model) {
        List<Car> cars = carServiceImp.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}

package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String model;

    int horsePower;

    String carBodyType;

    public Car() {

    }

    public Car (String model, int horsePower, String carBodyType) {
        this.model = model;
        this.horsePower = horsePower;
        this.carBodyType = carBodyType;
    }

}

package com.quentin.getSomeInfo.Car.Service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.quentin.getSomeInfo.Car.Model.Car;
import com.quentin.getSomeInfo.Car.Model.Car.FUEL;
import com.quentin.getSomeInfo.Car.Model.Car.TRANSMISSION;

@RestController
@CrossOrigin
public class CarService implements CarApi{
    
    @Override
    public ArrayList<Car> getCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "C63", 49799.98, 5, FUEL.PETROL, "Grey", TRANSMISSION.AUTOMATIC));
        cars.add(new Car("BMW", "i8", 128999.00, 3, FUEL.ELECTRIC, "Blue", TRANSMISSION.AUTOMATIC));
        cars.add(new Car("Mazda", "626", 2000.99, 5, FUEL.DIESEL, "Green", TRANSMISSION.AUTOMATIC));
        cars.add(new Car("Hyundai", "i10", 16999.99, 3, FUEL.HYBRID, "White", TRANSMISSION.HALFAUTOMATIC));
        return cars;
    }
    
}

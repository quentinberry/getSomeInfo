package com.quentin.getSomeInfo.Car.Service;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.quentin.getSomeInfo.Car.Model.Car;

public interface CarApi {

    @GetMapping("/cars/info")
    @ResponseStatus(HttpStatus.OK)
    public  ArrayList<Car> getCars();
    
}

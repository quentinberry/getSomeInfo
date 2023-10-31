package com.quentin.getSomeInfo.Beverages.Service;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.quentin.getSomeInfo.Beverages.Model.Beverage;

public interface BeverageApi {

    @GetMapping("/beverages/info")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<Beverage> getBeverages();    
}

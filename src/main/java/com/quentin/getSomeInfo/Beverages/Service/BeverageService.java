package com.quentin.getSomeInfo.Beverages.Service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.quentin.getSomeInfo.Beverages.Model.Beverage;

@RestController
@CrossOrigin
public class BeverageService implements BeverageApi{
    
    @Override
    public ArrayList<Beverage> getBeverages() {
        ArrayList<Beverage> beverages = new ArrayList<>();
        beverages.add(new Beverage("Coca Cola", "Cherry", new ArrayList<>(Arrays.asList("330ml", "500ml", "1000ml", "1500ml")), false,true));
        beverages.add(new Beverage("Monster Energy", "Ginger", new ArrayList<>(Arrays.asList("500ml")), false,true));
        beverages.add(new Beverage("Desperados", "Original", new ArrayList<>(Arrays.asList("330ml", "500ml")), true,false));
        beverages.add(new Beverage("Evian", "Water", new ArrayList<>(Arrays.asList("250ml", "500ml", "1000ml")), false,false));
        return beverages;
    }
}

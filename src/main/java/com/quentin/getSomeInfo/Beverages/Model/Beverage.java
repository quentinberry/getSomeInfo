package com.quentin.getSomeInfo.Beverages.Model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Beverage {
    public String brand;
    public String taste;
    public ArrayList<String> fillingSizes;
    public Boolean isAlcoholic;
    public Boolean isCaffeinated;
}

package com.quentin.getSomeInfo.Car.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Car {
    public static enum FUEL {
        PETROL,
        DIESEL,
        ELECTRIC,
        HYDROGEN,
        HYBRID
      };

      public static enum TRANSMISSION {
        AUTOMATIC,
        MANUAL,
        HALFAUTOMATIC
      }

    public String brand;
    public String model;
    public Double price;
    public Integer dooorCount;
    public FUEL fuel;
    public String color;
    public TRANSMISSION transmission;

}
package com.nicola.car;

import java.math.BigDecimal;

public class CarDAO {

    private static final Car[] cars = {
            new Car("1984", new BigDecimal("75.00"),Brand.TESLA,true),
            new Car("0313", new BigDecimal("50.00"),Brand.BMW,false),
            new Car("5698", new BigDecimal("90.00"),Brand.MERCEDES,true),
            new Car("1492", new BigDecimal("22.00"),Brand.FIAT,false),
            new Car("1861", new BigDecimal("31.00"),Brand.FORD,false)
    };
    public Car[] getAllCars(){
        return cars;
    }

}

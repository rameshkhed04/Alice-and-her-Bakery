package com.bakery.Alice_and_her_bakery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class StrawberryF implements  Frostingi{
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}

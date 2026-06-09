package com.bakery.Alice_and_her_bakery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
@Qualifier("Strawberry")
public class StrawbwrryS implements Syrupi{
    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}

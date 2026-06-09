package com.bakery.Alice_and_her_bakery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Chocolet")
public class ChocoletS implements Syrupi{
    @Override
    public String getSyrupType() {
        return "Chocolet Syrup";
    }
}

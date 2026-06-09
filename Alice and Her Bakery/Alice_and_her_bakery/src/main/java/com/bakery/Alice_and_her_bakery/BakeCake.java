package com.bakery.Alice_and_her_bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class BakeCake {
    private final Frostingi frosting;
    private final Syrupi syrup;
@Autowired
    public BakeCake(Frostingi frosting,@Qualifier("Strawberry")Syrupi syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }
    public void bakeCake(){
        System.out.println("Baking your delicious cake "+ frosting.getFrostingType() + " and "+syrup.getSyrupType()+"!" );

    }
}

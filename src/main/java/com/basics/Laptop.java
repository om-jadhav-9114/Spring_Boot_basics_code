package com.basics;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    Battery b;
    Mouse m;
    Keyboard k;

    public Laptop(Battery b, Mouse m, Keyboard k) {
        this.b = b;
        this.m = m;
        this.k = k;
    }

    public String getlaptopinfo(){

        return b.getBatteryinfo()+"\n"+m.getmouseinfo()+"\n"+
                k.Keyboardinfo()+"\nthis is my new laptop";
    }
}

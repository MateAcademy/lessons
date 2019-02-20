package com.mateacademy.patterny.fabrica;

import com.mateacademy.patterny.interfaceSocks.*;

public class Fabrica extends AbstractFabrica {

    public Socks create(String type) {
        if ("r".equals(type))
        {
            return  new Russian();
        }
        else {
            return  new USA();
        }
    }
}

package com.mateacademy.patterny.interfaceSocks;

import com.mateacademy.patterny.fabrica.AbstractFabrica;

public class SocksFacrory extends AbstractFabrica {

    public Socks create(String type) {

        if ("mans".equals(type))
        {
            return  new Mans();
        }
        if("womane".equals(type))
        {
            return  new Womens();
        }else
            return new UkrainianSocks(type);
    }
}

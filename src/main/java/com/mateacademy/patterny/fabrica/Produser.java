package com.mateacademy.patterny.fabrica;

import com.mateacademy.patterny.interfaceSocks.Socks;
import com.mateacademy.patterny.interfaceSocks.SocksFacrory;

public class Produser {
    public static AbstractFabrica creatFabrica(String type) {

            if ("r".equals(type))
            {
                return  new Fabrica();
            }
            else {
                return  new SocksFacrory();
            }
        }

}

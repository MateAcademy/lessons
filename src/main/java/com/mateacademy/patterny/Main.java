package com.mateacademy.patterny;

import com.mateacademy.patterny.fabrica.AbstractFabrica;
import com.mateacademy.patterny.fabrica.Produser;
import com.mateacademy.patterny.interfaceSocks.Socks;
import com.mateacademy.patterny.interfaceSocks.SocksFacrory;


public class Main {
    public static void main(String[] args) {
        SocksFacrory socksFacrory = new SocksFacrory();
        Socks n = socksFacrory.create("mans4");
        System.out.println(n);

        AbstractFabrica abstractFabrica = Produser.creatFabrica("r");
        Socks n2 = abstractFabrica.create("r");
        System.out.println(n2);

    }

}

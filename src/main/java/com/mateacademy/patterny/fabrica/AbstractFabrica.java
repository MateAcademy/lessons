package com.mateacademy.patterny.fabrica;

import com.mateacademy.patterny.interfaceSocks.Socks;

public abstract class AbstractFabrica {
    public abstract Socks create(String type);
}

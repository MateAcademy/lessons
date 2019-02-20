package com.mateacademy.patterny.interfaceSocks;

public abstract class SocksAbsractClass implements Socks {

    public  String type;
    private String color;
    private Integer size;

    public SocksAbsractClass(String type) {
        this.type = type;
    }

    @Override
    public Integer getSize() {
        return null;
    }

    @Override
    public Integer setSize(int s) {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String setColor(String c) {
        return null;
    }

    @Override
    public String toString() {
        System.out.println( this.type);
                //"Socs color: " + this.getColor() +
                //"\nSocs size: " + this.getSize());
        return super.toString();
    }


}

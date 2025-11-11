package org.example;

public class Hex{
    private final int value;

    public Hex(int value){
        this.value = value;
    }

    public int valueOf(){
        return value;
    }

    public String toString(){
        return "0x" + Integer.toHexString(value).toUpperCase();
    }

    public String toJSON(){
        return toString();
    }


    public Hex plus(Hex other){
        return new Hex(value + other.value);
    }

    public Hex minus(Hex other){
        return new Hex(Math.abs(value - other.value));
    }

    public Hex plus(int number){
        int val = getValue(number);
        return new Hex(value + val);
    }

    public Hex minus(int number ){
        int val = getValue(number);
        return new Hex(value - val);
    }

    public static int parse(String hexString){
        if (hexString == null) throw new IllegalArgumentException("Null string");
        return Integer.parseInt(hexString.replace("0x", ""), 16);    }

    public boolean equals(Object other){
        if(this == other) return true;
        if(!(other instanceof  Hex)) return false;
        Hex obj = (Hex) other;
        return this.value == obj.value;
    }

    public int getValue(Object other) {
        if(other instanceof Hex) return ((Hex)other).value;
        else if(other instanceof Number) return ((Number) other).intValue();
        else throw new IllegalArgumentException("Argument must be Hex or Number");
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }
}
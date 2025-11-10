package org.example;

public class Cube {

    /*
    This cube needs help!
    Define a constructor (or more) such that one can instantiate an object 
    via it, handling either no arguments or a single integer
    */
    private int side;

    public  Cube() {

    }

    public Cube(int side){
        this.side = Math.abs(side);
    }



    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}

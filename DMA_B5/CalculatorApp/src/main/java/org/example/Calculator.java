package org.example;

public  class Calculator {

    public double calculate(double x, double y, int  operation){
        switch (operation)
        {
            case 1: return x + y;
            case 2: return x - y;
            case 3: return x * y;
            case 4:
                if (y != 0)
                    return  x / y;
                else{
                    System.out.println("0 bolmek olmaz.");
                }
                    break;
            default:
                System.out.println("sehv emeliyat daxil edibsiniz.");
        }
        return  0;

    }
}

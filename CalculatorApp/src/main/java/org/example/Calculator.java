package org.example;

public  class Calculator {

    public double calculate(double x, double y, int  emeliyat){
        double result  = 0;
        switch (emeliyat)
        {
            case 1:
                result = x + y;
                break;
            case 2:
                result =  x - y;
                break;
            case 3:
                result = x * y;
                break;
            case 4:
                if (y != 0)
                    result = x / y;
                else{
                    System.out.println("0 bolmek olmaz.");
                }
                    break;
            default:
                System.out.println("sehv emeliyat daxil edibsiniz.");
        }
        return  result;

    }
}

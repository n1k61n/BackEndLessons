package org.example;


/*
Tapşırıq 8: Abstrakt Siniflərin Dərin İrsiyyəti (Deep Abstract Inheritance)
•	Mövzu: Üç səviyyəli abstraksiya, Abstract Metod və Non-Abstract Metod kombinasiyası.
•	Tapşırıq:
1.	Məhsul (Product) adlı ən yuxarı abstract sinif yaradın.
Bu sinfin qiymətiHesabla adlı abstract metodu olsun.
2.	Elektronika (Electronics) adlı Məhsul sinfindən miras alan ikinci abstract sinif yaradın.
 Bu sinifə gömrükRüsumu (CustomsDuty - non-abstract) adlı metod əlavə edin (məsələn, qiymətin 5%-ni qaytarsın).
3.	SmartfonSmartphone () adlı Elektronika sinfindən miras alan adi (non-abstract) sinif yaradın.
4.	Smartfon sinfi ən yuxarıdakı qiymətiHesabla metodunu implement etsin (məsələn, gömrükRüsumu üzərinə
öz baza qiymətini gəlsin).
 */

public abstract class Product {
    String name;
    double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    abstract double calculatePrice();

}

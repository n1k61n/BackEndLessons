package org.example;


/*
Tapşırıq 4: Statik Üzvlər və Tək Nümunə (Singleton Pattern)
•	Tələb olunan: private constructor, private static atribut, public static metod.
1.	Parametrlər (Settings) adlı sinif yaradın. Bu sinifdən proqramda yalnız bir nümunə
 (instance) yaradılmalıdır.
2.	Sinfin constructorunu private edin.
3.	Öz növündə private static bir atribut yaradın (sinfin tək nümunəsini saxlamaq üçün).
4.	Sinifə public static Parametrlər getInstance() adlı metod yaradın. Bu metod obyekti yalnız
ilk dəfə çağrıldıqda yaratmalıdır (Lazy Initialization).
5.	main metodunda bu metodu iki dəfə çağırın və hər iki obyektin eyni (bərabər) olduğunu yoxlayın.
 */

public class Settings {
    private static Settings instance;
    private final String version = "1.0.1";

    private Settings() {
        System.out.println("obyekt yadildi");
    }

    public static Settings getInstance(){
        if(instance == null){
            instance = new Settings();
        }
        return instance;
    }

    public String getVersion() {
        return version;
    }
}

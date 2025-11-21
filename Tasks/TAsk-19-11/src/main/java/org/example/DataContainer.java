package org.example;

/*
Tapşırıq 7: Generic Siniflər və Tip Təhlükəsizliyi (Generics and Type Safety)
•	Mövzu: Generic Sinif (Generic Class), tip məhdudlaşdırması (extends).
•	Tapşırıq:
1.	MəlumatSaxlayıcısı<T> (DataContainer) adlı generic sinif yaradın.
Bu sinif istənilən tipdə bir elementi (T) saxlamaq üçün data adlı private atributa sahib olsun.
2.	Sinifə setData və getData metodları əlavə edin.
3.	MəlumatSaxlayıcısı sinfinə tip məhdudlaşdırması (<T extends Number>) əlavə edin,
yəni bu sinif yalnız Number sinfindən miras alan tipləri (məsələn, Integer, Double) saxlaya bilsin.
4.	main metodunda MəlumatSaxlayıcısı<Integer> və MəlumatSaxlayıcısı<Double> obyektlərini
yaradıb test edin. Stringlə test etməyə çalışdıqda Java kompilyatorunun xəta verməsini göstərin.
________________________________________
 */
public class DataContainer <T extends Number>{
    private T data;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "data=" + data +
                '}';
    }
}

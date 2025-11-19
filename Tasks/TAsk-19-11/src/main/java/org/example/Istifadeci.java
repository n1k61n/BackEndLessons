package org.example;

/**
 * Tapşırıq 6: Daxili Siniflər və Verilənlərin Gizlədilməsi
 * Əsas sinif: İstifadəçi (User)
 * Daxili sinif: Təhlükəsizlik (Security)
 */
public class Istifadeci {
    // 1. İstifadeci sinfinin private atributları
    private String ad;
    private String email;
    private String heshlenmisParol; // Encapsulation üçün əlavə edilib

    // Konstruktor
    public Istifadeci(String ad, String email) {
        this.ad = ad;
        this.email = email;
    }

    // Getter metodları (Encapsulation qaydalarına görə)
    public String getAd() {
        return ad;
    }

    public String getEmail() {
        return email;
    }

    public String getHeshlenmisParol() {
        return heshlenmisParol;
    }

    // 4. paroluTəyinEt metodu
    // Bu metod daxili sinfin static metodunu istifadə edərək parolu həşləyir.
    public void paroluTeyinEt(String sadeParol) {
        // Daxili sinfin static metodu çağırılır
        this.heshlenmisParol = Security.hashParol(sadeParol, this.ad);
        System.out.println("Parol uğurla həşləndi və təyin edildi.");
    }

    // 2. Təhlükəsizlik (Security) adlı private static daxili sinif (Nested Class)
    private static class Security {
        // 3. hashParol static metodu
        // Parol və istifadəçi adını birləşdirərək sadə həş yaradır.
        public static String hashParol(String parol, String istifadeciAdi) {
            // "ISTIFADECI_PAROL" formatında sadə həş yaratmaq üçün:
            return istifadeciAdi.toUpperCase() + "_" + parol;
        }
    }
}

// Tapşırığı yoxlamaq üçün əlavə Main sinfi
class Test {
    public static void main(String[] args) {
        // 1. İstifadəçi obyekti yaratmaq
        Istifadeci user = new Istifadeci("Elvin", "elvin.mammadov@example.com");

        System.out.println("--- İstifadəçi Məlumatı ---");
        System.out.println("Ad: " + user.getAd());
        System.out.println("Email: " + user.getEmail());

        // Parol hələ təyin olunmayıb
        System.out.println("Həşlənmiş Parol (əvvəl): " + user.getHeshlenmisParol());

        System.out.println("\n--- Parolun Təyini ---");
        // 4. ParoluTeyinEt metodunu çağırmaq
        user.paroluTeyinEt("gizli123");

        System.out.println("\n--- Yeni Məlumat ---");
        // Yeni həşlənmiş parolu yoxlamaq
        System.out.println("Həşlənmiş Parol (sonra): " + user.getHeshlenmisParol());

        // Qeyd: Daxili static sinif (Security) private olduğu üçün,
        // xarici sinifdən (Test sinfindən) birbaşa çağırıla bilməz,
        // bu da verilənlərin gizlədilməsini (Data Hiding) gücləndirir.
        // Məsələn, 'Istifadeci.Security.hashParol(...)' Test sinfində işləməyəcək.
    }
}

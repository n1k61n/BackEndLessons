package org.example;

// Thread sinfini genişləndirən öz sinfimizi yaradırıq
public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Thread-in işi burada yerinə yetirilir
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " işləyir: addım " + i);
            try {
                Thread.sleep(1000); // 0.5 saniyə gözləyir
            } catch (InterruptedException e) {
                System.out.println(name + " dayandırıldı.");
            }
        }
        System.out.println(name + " tamamlandı.");
    }
}

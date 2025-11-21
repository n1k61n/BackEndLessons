package org.example;


import java.util.ArrayList;
import java.util.Scanner;

// ===== ENUM =====
enum Genre {
    FICTION, SCIENCE, HISTORY, TECHNOLOGY, OTHER
}

// ===== ABSTRACT CLASS =====
abstract class LibraryItem {
    String title;
    String author;
    Genre genre;
    boolean isAvailable = true;

    public LibraryItem(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    abstract void showInfo();

    public void borrowItem() {
        if (!isAvailable) {
            System.out.println("❌ Bu material artıq götürülüb!");
        } else {
            isAvailable = false;
            System.out.println("✅ '" + title + "' materialı götürüldü.");
        }
    }

    public void returnItem() {
        if (isAvailable) {
            System.out.println("ℹ️ Bu material artıq kitabxanadadır.");
        } else {
            isAvailable = true;
            System.out.println("🔄 '" + title + "' geri qaytarıldı.");
        }
    }
}

// ===== BOOK CLASS =====
class Book extends LibraryItem {
    int pageCount;

    public Book(String title, String author, Genre genre, int pageCount) {
        super(title, author, genre);
        this.pageCount = pageCount;
    }

    @Override
    void showInfo() {
        System.out.println("📘 Kitab: " + title + " | Müəllif: " + author +
                " | Janr: " + genre + " | Səhifə: " + pageCount +
                " | Mövcuddur: " + (isAvailable ? "Bəli" : "Xeyr"));
    }
}

// ===== MAGAZINE CLASS =====
class Magazine extends LibraryItem {
    int issueNumber;

    public Magazine(String title, String author, Genre genre, int issueNumber) {
        super(title, author, genre);
        this.issueNumber = issueNumber;
    }

    @Override
    void showInfo() {
        System.out.println("📰 Jurnal: " + title + " | Müəllif: " + author +
                " | Buraxılış: " + issueNumber +
                " | Mövcuddur: " + (isAvailable ? "Bəli" : "Xeyr"));
    }
}

// ===== DVD CLASS =====
class DVD extends LibraryItem {
    int duration; // dəqiqə

    public DVD(String title, String author, Genre genre, int duration) {
        super(title, author, genre);
        this.duration = duration;
    }

    @Override
    void showInfo() {
        System.out.println("💿 DVD: " + title + " | Müəllif: " + author +
                " | Janr: " + genre + " | Müddət: " + duration + " dəq" +
                " | Mövcuddur: " + (isAvailable ? "Bəli" : "Xeyr"));
    }
}

// ===== LIBRARY CLASS =====
class Library {
    ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("✅ '" + item.title + "' kitabxanaya əlavə olundu.");
    }

    public void showAllItems() {
        if (items.isEmpty()) {
            System.out.println("📭 Kitabxanada material yoxdur.");
            return;
        }
        System.out.println("📚 --- Bütün Materiallar ---");
        for (LibraryItem item : items) {
            item.showInfo();
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.title.equalsIgnoreCase(title)) {
                item.showInfo();
                found = true;
            }
        }
        if (!found)
            System.out.println("🔍 '" + title + "' tapılmadı.");
    }

    public void borrowItem(String title) {
        for (LibraryItem item : items) {
            if (item.title.equalsIgnoreCase(title)) {
                item.borrowItem();
                return;
            }
        }
        System.out.println("❌ '" + title + "' adlı material tapılmadı.");
    }

    public void returnItem(String title) {
        for (LibraryItem item : items) {
            if (item.title.equalsIgnoreCase(title)) {
                item.returnItem();
                return;
            }
        }
        System.out.println("❌ '" + title + "' adlı material tapılmadı.");
    }
}

// ===== MAIN CLASS =====
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n===== KITABXANA SISTEMI =====");
            System.out.println("1. Material əlavə et");
            System.out.println("2. Bütün materialları göstər");
            System.out.println("3. Başlığa görə axtar");
            System.out.println("4. Material götür");
            System.out.println("5. Material qaytar");
            System.out.println("6. Çıxış");
            System.out.print("Seçim: ");

            int choice = sc.nextInt();
            sc.nextLine(); // buffer təmizləmək üçün

            switch (choice) {
                case 1 -> {
                    System.out.println("Növ seç: 1-Book, 2-Magazine, 3-DVD");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Başlıq: ");
                    String title = sc.nextLine();
                    System.out.print("Müəllif: ");
                    String author = sc.nextLine();
                    System.out.print("Janr (FICTION, SCIENCE, HISTORY, TECHNOLOGY, OTHER): ");
                    Genre genre = Genre.valueOf(sc.nextLine().toUpperCase());

                    if (type == 1) {
                        System.out.print("Səhifə sayı: ");
                        int pages = sc.nextInt();
                        library.addItem(new Book(title, author, genre, pages));
                    } else if (type == 2) {
                        System.out.print("Buraxılış nömrəsi: ");
                        int issue = sc.nextInt();
                        library.addItem(new Magazine(title, author, genre, issue));
                    } else if (type == 3) {
                        System.out.print("Müddət (dəq): ");
                        int duration = sc.nextInt();
                        library.addItem(new DVD(title, author, genre, duration));
                    } else {
                        System.out.println("❌ Yanlış seçim!");
                    }
                }
                case 2 -> library.showAllItems();
                case 3 -> {
                    System.out.print("Axtarılan başlıq: ");
                    String title = sc.nextLine();
                    library.searchByTitle(title);
                }
                case 4 -> {
                    System.out.print("Götürüləcək başlıq: ");
                    String title = sc.nextLine();
                    library.borrowItem(title);
                }
                case 5 -> {
                    System.out.print("Qaytarılacaq başlıq: ");
                    String title = sc.nextLine();
                    library.returnItem(title);
                }
                case 6 -> {
                    System.out.println("👋 Proqram dayandırıldı.");
                    return;
                }
                default -> System.out.println("❌ Yanlış seçim!");
            }
        }
    }
}

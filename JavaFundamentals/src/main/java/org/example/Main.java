package org.example;


//Bölmə 4: Casting, Parsing və Conversion
//        1. double tipi bir dəyəri int-ə cast edən kod yaz və nəticəni izah et.
//        2. String "123" dəyərini int-ə çevirən və onunla 10 əlavə edib nəticəni çap edən proqram yaz.
//        3. int dəyərini String-ə çevirib length() metodundan istifadə edən kod yaz.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println(greeting(scanner));
//        System.out.println(add(scanner));
        int a = 4;
        double b = 1.2;
        boolean exit = true;
        char c = 'A';
//        difFloatAndDouble();
//        difIntandinteger();
//        stringType();
//        stringCompare();
//bolme 3
//        printArray();
//        twoDimensionArray();
//        arrayString();
//        findMax();
//        arrayAverage();
        //bolme 4
//        convertDoubleToInt();
//        stringToInt();
//        intToString();

        //bolme 5




    }
//            🔹 Bölmə 5: Arithmetic və Operatorlar
//1. Bir neçə riyazi əməliyyat (+, -, *, /, %) yerinə yetir və nəticələrini çap et.
    static void arifmeticoperation(){
        
    }
//            2. compound assignment operatorlarından (+=, -=, *=) istifadə edən kod nümunəsi yaz.


//3. int dəyərini String-ə çevirib length() metodundan istifadə edən kod yaz.

    static void intToString(){
        int num = 123456789;
        String s = String.valueOf(num);
        System.out.println(s.length());
    }


//    Bölmə 4: Casting, Parsing və Conversion
//1. double tipi bir dəyəri int-ə cast edən kod yaz və nəticəni izah et.
    static void convertDoubleToInt(){
        double a = 13.45;
        int b  = (int)a;
        System.out.println(b);
    }
//2. String "123" dəyərini int-ə çevirən və onunla 10 əlavə edib nəticəni çap edən proqram yaz.
    static void stringToInt(){
        String s = "123";
        int num = Integer.parseInt(s);
        int on = num + 10;
        System.out.println(on);
    }

//            🔹 Bölmə 6: Flow Control
//1. İstifadəçidən ədəd al və if-else ilə onun müsbət, mənfi və ya sıfır olduğunu çap et.
//2. switch operatoru ilə 1–7 arası ədədlərə uyğun gün adını çap edən proqram yaz.
//3. for dövrü ilə 1-dən 10-a qədər olan ədədlərin cəmini hesabla.
//            4. while dövrü ilə 1-dən 100-ə qədər cüt ədədləri çap et.
//            5. do-while dövrü ilə istifadəçidən parol istəyən və “1234” daxil edilənə qədər təkrarlayan proqram yaz.





//        5. ArrayList<Integer> içərisindəki ədədlərin ortalamasını hesablayan metod yaz.
    static void arrayAverage(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        System.out.println(sum / numbers.toArray().length);
    }


//        4. Massivin ən böyük elementini tapan proqram yaz.
    static void findMax(){
        int[] numbers = {2,-1, 5, 99, -100, 0};
        int max = Integer.MIN_VALUE;
        for(int num : numbers){
            if(max < num)
                max = num;
        }
        System.out.println(max);
    }

    //        3. ArrayList<String> yaradıb, bir neçə şəhər adı əlavə et, sonra birini sil və siyahını çap et.
    static void arrayString(){
        List<String> city = new ArrayList<>();
        city.add("Baki");
        city.add("Moscow");
        city.add("New York");
        city.add("Paris");
        city.add("London");

        city.remove("Paris");

        for(String c : city){
            System.out.println(c);
        }
    }

    static void twoDimensionArray(){
        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[0].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printArray(){
        int [] num = new int[] {1,2,3,4,5};
        for(int i : num) System.out.println(i);
    }

    static void stringCompare(){
        String a = "hello";
        String b = new String("hello");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }


    //        4. Bir String dəyişəni yaradıb, onun uzunluğunu, böyük hərflə variantını və sonuna əlavə edilmiş sözü çap et.
    static void stringType(){
        String word = "programming";
        String elave = word + " rocks!";

        System.out.println("uzunluq: " + word.length());
        System.out.println("boyuk herfle: " + word.toUpperCase());
        System.out.println("elave edilmis soz: " + elave);
    }
    static void difIntandinteger(){
        int a = 42;
        Integer b = a;
        Integer c = Integer.valueOf(58);
        int d = c;
        System.out.println("Primitive int: " + a);
        System.out.println("Boxed Integer: " + b);
        System.out.println("Unboxed int: " + d);
    }

    static void difFloatAndDouble(){
        float a = 1.123456789f;
        double c = 1.123456789;
        System.out.println("float tipi " + a);
        System.out.println("double tipi " + c);

    }

    static double add(Scanner scanner){
        String string = scanner.nextLine();
        String[] line = string.split(" ");
        if (line.length >= 2){
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            return a + b;
        }
        return 0;
    }


    static String greeting(Scanner scanner){
        System.out.print("Adinizi daxil edin: ");
        String name = scanner.nextLine();
        return "Salam " + name;
    }
}
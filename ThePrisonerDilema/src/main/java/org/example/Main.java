package org.example;



public class Main {
    public static void main(String[] args) {
        Player sample = new Player("Sample", true);
        Player random = new Player("Random", true);


        for(byte i = 0 ; i < 100; i++){
            if(sample.isChoice() == true && random.isChoice() == true){
                sample.setScore(3);
                random.setScore(3);
            }
            else if (sample.isChoice() == true && random.isChoice() == false)
                random.setScore(5);
            else if (sample.isChoice() == false && random.isChoice() == true)
                sample.setScore(5);
            else{
                sample.setScore(1);
                random.setScore(1);
            }

            random.setChoice((int)(Math.random() * 2) == 1);
        }
        System.out.println(sample);
        System.out.println(random);
    }
}
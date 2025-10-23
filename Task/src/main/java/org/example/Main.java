package org.example;


import java.util.Random;

public class Main {
    static void main(){
        boolean titFortat = true;
        boolean opponent = false;
        int tftScore = 0;
        int oppScore = 0;

        Random random = new Random();
        for(int i = 0; i < 200; i++){
            if (titFortat && opponent){
                tftScore += 3;
                oppScore += 3;
            }
            else if (!titFortat && !opponent){
                tftScore += 1;
                oppScore += 1;
            }
            else if (!titFortat && opponent){
                tftScore += 5;
                oppScore += 0;
            } else if (titFortat && !opponent){
                tftScore += 0;
                oppScore += 5;
            }
            titFortat = opponent;
            opponent = random.nextInt(2) == 1;
        }

        System.out.println("Tit For Tat: " + tftScore);
        System.out.println("Opponent: " + oppScore);
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

        Sample sample = new Sample("Sample", true);
        Friedman friedman = new Friedman("Friedman", true);
        Joss joss = new Joss("Joss", true);
        TitForTat titForTat = new TitForTat("Tit for Tat", true);
        RandomStrategy randomStrategy = new RandomStrategy("Random", true);

        for(int i = 0; i < 200; i++){
            gameRound(titForTat, randomStrategy);
        }
        System.out.println(titForTat);
        System.out.println(randomStrategy);




    }

    static void gameRound(Player p1, Player p2){
        boolean choicePLayer1 = p1.strategy(p2.getHistory());
        boolean choicePlayer2 = p2.strategy(p1.getHistory());
        p1.setChoice(choicePLayer1);
        p2.setChoice(choicePlayer2);
        if(choicePLayer1 && choicePlayer2){
            p1.setScore(3);
            p2.setScore(3);
        }
        else if (choicePLayer1 && !choicePlayer2){
            p2.setScore(5);
        }
        else if (!choicePLayer1 && choicePlayer2){
            p1.setScore(5);
        }
        else{
            p1.setScore(1);
            p2.setScore(1);
        }
    }
}
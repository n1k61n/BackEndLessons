package org.example;
public class BullsAndCows {

    private String n;
    private int turn = 1;
    private boolean won = false;

    public BullsAndCows(int a) {
        n = "" + a;
        check(a);
    }

    public String compareWith(int x) {
        if (won)      return "You already won!";
        if (turn > 8) return "Sorry, you're out of turns!";

        check(x);
        turn++;
        String s = ""+x;
        int c = 0, b = 0;
        if(s.equals(n)) {
            won = true;
            return "You win!";
        }

        for(int i=0 ; i<4 ; i++) {
            if      (s.charAt(i) == n.charAt(i))   b += 1;
            else if (s.indexOf(n.charAt(i)) != -1) c += 1;
        }
        return String.format("%d bull%s and %d cow%s", b, b!=1?"s":"", c, c!=1?"s":"");
    }

    private void check(int v) {
        if ( v<1000 || v>9999 || (""+v).chars().distinct().count()!=4 )
            throw new IllegalArgumentException();
    }
}
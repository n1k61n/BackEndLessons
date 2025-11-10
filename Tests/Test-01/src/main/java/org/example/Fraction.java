package org.example;

public class Fraction implements Comparable<Fraction>
{
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    // Your work here!
    public long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a % b);
    }
    //Add two fractions
    public Fraction add(Fraction f2) {
        long resTop = top * f2.bottom + f2.top * bottom;
        long resBot = bottom * f2.bottom;
        long resGcd = gcd(resTop, resBot);
        return new Fraction(resTop / resGcd, resBot / resGcd);
    }

    //...and make this class string representable


    @Override
    public String toString() {
        return top + "/" + bottom;
    }
}
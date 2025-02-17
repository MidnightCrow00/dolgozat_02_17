package hu.soter.idomok;

public class Hasab extends FaIdom{
    private double a,b,m;

    public Hasab(double a, double b, double m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getM() {
        return m;
    }
    @Override
    public double terfogat(){
        return a*b*m;
    }

    @Override
    public String toString() {
        return "Hasab{" +
                "a=" + a +
                ", b=" + b +
                ", m=" + m +
                '}';
    }
}

package hu.soter.idomok;

public abstract class FaIdom {
    private static double fajsuly=.8;
    public abstract double terfogat();

    public static double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return terfogat()*FaIdom.fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{}";
    }
}

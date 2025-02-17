package hu.soter.idomok;

public class Gomb extends FaIdom {
    private double r;
    public Gomb(double r) {
        this.r=r;
    }

    @Override
    public double terfogat(){
        return (4*Math.pow(r,3)*Math.PI)/3;
    }

    @Override
    public String toString() {
        return "Gomb{" +
                "r=" + r +
                '}';
    }
}

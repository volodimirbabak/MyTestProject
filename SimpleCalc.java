package testapp;

public class SimpleCalc {
    private double a;
    private double b;

    SimpleCalc(double p1, double p2) {
        this.a = p1;
        this.b = p2;
    }

    public double getSum() {
        return this.a + this.b;
    }
}
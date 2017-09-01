package Ch02_Objects_Classes_Interfaces;

/**
 * Created by Ross on 01.09.2017.
 */
public class ComplexNumber {
    private double x, y;

    public ComplexNumber(double real, double imaginary) {
        x = real;
        y = imaginary;
    }

    public double real() {
        return x;
    }

    public double imaginary() {
        return y;
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "{" + x + "," + y + "}";
    }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.x + b.x, a.y + b.y);
    }

    public ComplexNumber add(ComplexNumber a) {
        return new ComplexNumber(x + a.x, y + a.y);
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.x * b.x - a.y * b.y, a.x * b.y + a.y * b.x);
    }

    public ComplexNumber multiply(ComplexNumber a) {
        return new ComplexNumber(x * a.x - y * a.y, x * a.y + y * a.x);
    }
}

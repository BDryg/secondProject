package ru.omsu.yamp.Ign.FunctionOfOneRealArgument;

import static java.lang.StrictMath.exp;


public class FourthFunction implements IFunction {
    private double a;
    private double b;

    private double lower;
    private double upper;

    public FourthFunction(double lower, double upper, double x, double y) {
        this.lower = lower;
        this.upper = upper;
        this.a = x;
        this.b = y;
    }

    public void setLower(double lower) {this.lower = lower;}

    public void setUpper(double upper) {this.upper = upper;}

    public double getLower() {
        return lower;
    }

    public double getUpper() {
        return upper;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double calculateFunctionInPoint(double x) throws FunctionEcxeption {
        double res = this.a *exp(x)+this.b;
        if (res>= lower && res <= upper) {
            return res;
        }
        throw new FunctionEcxeption("Function is not defined");
    }

}

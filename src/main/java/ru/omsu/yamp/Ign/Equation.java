package ru.omsu.yamp.Ign;


public class App 
{

    private double a;
    private double b;
    private double c;

    public Equation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] solute(){
        double[] solution;
        double discriminant = getDiscriminant();
        if(discriminant >= 0) {
            solution = new double[2];
            solution[0] = (-b + Math.sqrt(discriminant)) / 2;
            solution[1] = (-b - Math.sqrt(discriminant)) / 2;
            return solution;
        }
        return null;
    }

    public double getDiscriminant(){
        return b*b - 4*a*c;
    }

}

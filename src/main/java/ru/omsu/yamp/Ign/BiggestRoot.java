package ru.omsu.yamp.Ign;


public class BiggestRoot
{
    Equation equation;
    public double getBiggestRoot() throws Exception{
        double[] solution = equation.solute();
        if(solution == null){
            throw new Exception("Корней нет.");
        }
        return Math.max(solution[0], solution[1]);

    }

    public BiggestRoot(Equation equation){
        this.equation = equation;
    }

}

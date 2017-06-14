package ru.omsu.yamp.Ign.FunctionOfOneRealArgument;


public class SumOfFunctionValues implements IFunctional {

  

    public double calculateFunctional(IFunction function) throws FunctionEcxeption {
        double A = function.getLower();
        double B = function.getUpper();
        double midpoint = (A+B)/2;
        return function.calculateFunctionInPoint(A) + function.calculateFunctionInPoint(B) + function.calculateFunctionInPoint(midpoint);
    }
}

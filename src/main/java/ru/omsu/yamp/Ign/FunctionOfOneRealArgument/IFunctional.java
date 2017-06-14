package ru.omsu.yamp.Ign.FunctionOfOneRealArgument;


public interface IFunctional{
   <T extends IFunction> double calculateFunctional(T function) throws FunctionEcxeption;
}

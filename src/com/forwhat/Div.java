package com.forwhat;

public class Div extends Operator{
    Div(String OperationSymbol) {
        super(OperationSymbol);
    }

    @Override
    public int Operate(int X1, int X2) {
        return X1 / X2;
    }
}

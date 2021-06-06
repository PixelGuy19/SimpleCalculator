package com.forwhat;

public class Mul extends Operator{
    Mul(String OperationSymbol) {
        super(OperationSymbol);
    }

    @Override
    public int Operate(int X1, int X2) {
        return X1 * X2;
    }
}

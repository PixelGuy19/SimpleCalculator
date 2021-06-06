package com.forwhat;

public class Sum extends Operator{
    Sum(String OperationSymbol) {
        super(OperationSymbol);
    }

    @Override
    public int Operate(int X1, int X2) {
        return X1 + X2;
    }
}

package com.forwhat;

public class ToN extends Operator {
    ToN(String OperationSymbol) {
        super(OperationSymbol);
    }

    @Override
    public int Operate(int X1, int X2) {
        int Output = 0;
        for (int i = X1; i <= X2; i++) {
            Output += i;
        }
        return Output;
    }
}

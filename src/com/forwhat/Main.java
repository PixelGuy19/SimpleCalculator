package com.forwhat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Add operators
        List<Operator> Operators = new ArrayList<Operator>();
        Operators.add(new Sum("+"));
        Operators.add(new Sub("-"));
        Operators.add(new Mul("*"));
        Operators.add(new Div("/"));
        Operators.add(new ToN(":"));

        //Input values
        int X1, X2, Output = 0;
        String Operation;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Input operation symbol");
        Operation = Scanner.nextLine();
        System.out.println("Input first number");
        X1 = Scanner.nextInt();
        System.out.println("Input second number");
        X2 = Scanner.nextInt();

        //Run operators
        for (Operator Op :
                Operators) {
            if (Operation.equals(Op.OperationSymbol)) {
                Output = Op.Operate(X1, X2);
                System.out.println(String.format("\nOutput number = %d", Output));
                return;
            }
        }

        System.out.println("Sorry, operation don't found");
    }
}

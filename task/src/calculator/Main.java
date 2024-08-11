package calculator;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        Double income = 0.0;
        Double NetIncome = 0.0;

        String[] Products = {"Bubblegum", "Toffee", "Ice cream", "Milk chocolate", "Doughnut", "Pancake"};
        Double[] Amounts = {202.0, 118.0, 2250.0, 1680.0, 1075.0, 80.0};
        int numOfProd = Products.length;

        System.out.println("Earned amount:");
        while(count < numOfProd){
            System.out.println(Products[count] + ": $"+ Amounts[count]);
            count++;
            income += Amounts[count - 1];
        }
        System.out.println();
        System.out.println("Income: $" + income); 

        System.out.println("Staff expenses:");
        double staffExpenses = input.nextDouble();

        System.out.println("Other expenses:");
        double otherExpenses = input.nextDouble();

        NetIncome = income - (staffExpenses + otherExpenses);
        
        System.out.println("Net income: $" + NetIncome);    
    }
}
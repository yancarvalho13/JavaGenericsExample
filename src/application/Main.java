package application;

import entities.ValueList;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        ValueList<Integer> valueList = new ValueList<>();


        System.out.print("How many values ? ");
        int n = scan.nextInt();

        try {
            for (int i = 0; i < n; i++) {
                Integer values = scan.nextInt();
                valueList.addValue(values);
            }

            valueList.print();
            System.out.println();
            System.out.println("First: " + valueList.first());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid data type!!");
        }
        scan.close();
    }
}
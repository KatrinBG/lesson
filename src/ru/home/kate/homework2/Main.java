package ru.home.kate.homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        int result;
        String formula = "x-(y/z)";

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число x: ");
        if (in.hasNextInt()) {
            x = in.nextInt();
        } else {
            return;
        }
        System.out.println("Введите число y: ");
        if (in.hasNextInt()) {
            y = in.nextInt();
        } else {
            return;
        }
        System.out.println("Введите число z: ");
        if (in.hasNextInt()) {
            z = in.nextInt();
        } else {
            return;
        }
        in.close();
        System.out.println("formula: " + formula);
        result = calc(x, y, z);
        System.out.println("result: " + result);

    }

    public static Integer calc(int x, int y, int z) {

        return x - (y / z);
    }
}
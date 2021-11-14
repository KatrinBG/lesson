package ru.home.kate.homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int result;
        String formula = "x-(y/z)";

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число x: ");
        int x = in.nextInt();
        System.out.println("Введите число y: ");
        int y = in.nextInt();
        System.out.println("Введите число z: ");
        int z = in.nextInt();
        in.close();
        System.out.println("formula: " + formula);
        result = calc(x, y, z);
        System.out.println("result: " + result);

    }

    public static Integer calc(int x, int y, int z) {

        return x - (y / z);
    }
}
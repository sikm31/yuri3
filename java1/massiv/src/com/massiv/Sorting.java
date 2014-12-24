package com.massiv;

/**
 * Created by y.voytovich on 22.12.2014.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {


    public static int[][] rever(int[][] list) {
        int[][] x = new int[list.length][list.length];
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[(x.length - 1) - i][i] + "\t");

        }

        return x;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите размер массива - одно число и нажмите Enter: ");
        int a = Integer.parseInt(reader.readLine());

        int[][] x = new int[a][a];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        //Диагональ главная
        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < x.length; j++) {
                if (i == j) {
                    System.out.print(x[i][j] + "\t");
                }
            }
        }
        System.out.println();
        //Второстепенная диагональ
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[(x.length - 1) - i][i] + "\t");

        }


}

}

package com.massiv;

/**
 * Created by y.voytovich on 22.12.2014.
 */
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
    //static int[][] x;

        Sorting() throws IOException {

    }
    public static void DiagonalMain(int[][] x) {
        System.out.print("Main diagonal: ");
        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < x.length; j++) {
                if (i == j) {
                    System.out.print(x[i][j] + "\t");
                }
            }
        }


    }
    public static void DiagonalNotMain(int[][] x) {
        System.out.print("NotMain diagonal: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i][(x.length - 1) - i] + "\t");

        }


    }
    public static void Kutok(int[][] x){
        for(int j=0;j<x.length;j++) {
            for (int i=j+1; i < x.length; i += 1) {
//                System.out.println();
//               System.out.print(x[i][j] + "\t");
//                System.out.print(x[j][i] + "\t");
                int m = x[i][j];
                int n = x[j][i];
                x[j][i] = m;
                x[i][j] = n;
                //System.out.print(x[i][j] + "\t");
                //System.out.print(x[j][i] + "\t");



            }

            System.out.println();

        }

    }
    public static void DvaKutka(int[][] x){
        for(int j=0;j<x.length;j++) {
            for (int i=j+1; i < x.length; i += 1) {
//                System.out.println();
//               System.out.print(x[i][j] + "\t");
//                System.out.print(x[j][i] + "\t");
                int m = x[i][j];
                int n = x[j][i];
                x[j][i] = m;
                x[i][j] = n;
                //System.out.print(x[i][j] + "\t");
                //System.out.print(x[j][i] + "\t");



            }

            System.out.println();

        }

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

//        System.out.println();
//        String list = Arrays.deepToString(x)
//                .replace(",", "")
//                .replace("[", "")
//                .replace(" ", "")
//                .replace("]", "");
//        System.out.print(list);
//        //Диагональ главная
//        for (int i = 0; i < x.length; i++) {
//            for (int j = i; j < x.length; j++) {
//                if (i == j) {
//                    System.out.print(x[i][j] + "\t");
//                }
//            }
//        }
//        System.out.println();
//        //Второстепенная диагональ
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(x[i][(x.length - 1) - i] + "\t");
//
//        }
        //Угол
//        for(int j=0;j<x.length;j++) {
//            for (int i=j+1; i < x.length; i += 1) {
//
//              System.out.print(x[i][j] + "\t");
//
//            }
//            System.out.println();
//
//        }
        //DiagonalMain(x);
        //DiagonalNotMain(x);
        Kutok(x);
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }




    }
}

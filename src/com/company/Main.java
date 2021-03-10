/*
Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 */
package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Введите число: ");
	    if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Заданное число по абсолютной величине " + (Check(a)? "является":"не является") + " степенью двойки");
        } else {
	        System.out.println("Вы ввели не число");
        }
    }

    public static boolean Check(int num){
        int number = Math.abs(num);
        return Integer.bitCount(number) == 1;
    }
}

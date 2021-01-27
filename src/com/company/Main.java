/*
Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 */
package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static boolean Check(int num){
        boolean result = false;
        int number = Math.abs(num);
        if (Integer.bitCount(number) == 1)
                result = true;
        return result;
    }

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int a;
	    System.out.println("Введите число: ");
	    if (sc.hasNextInt()) {
            a = sc.nextInt();
            if (Check(a)){
                System.out.println("Заданное число по абсолютной величине является степенью двойки");
            } else {
                System.out.println("Заданное число по абсолютной величине не является степенью двойки");
            }
        } else {
	        System.out.println("Вы ввели не число");
        }
    }
}

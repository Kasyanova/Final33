/*
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки. Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.
Пример для теста работы программы:
Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
* */

package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int number = in.nextInt();
        String[] differentCounts = new String[number];
        in.nextLine();
        for (int i=0;i<differentCounts.length;i++){
            System.out.println("Введите строку номер "+i);
            differentCounts[i] = in.nextLine();
            //System.out.println("строка = "+differentCounts[i]);
        }

        char s;
        for (int i=0; i<number; i++){
            System.out.println(i+" строка содержит символов всего = "+differentCounts[i].length());
            for (int j=0;j<differentCounts[i].length();j++){
                s = differentCounts[i].charAt(j);
                System.out.println("s = "+s);
            }

        }




    }
}
package Seminar1;

import java.util.Scanner;

/*
Дан массив двоичных чисел, например [1,1,0,1,1,1],
вывести максимальное количество подряд идущих 1.
 */

public class Task_3 {
    int n;
    int[] a;
    int b;

    public Task_3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n = in.nextInt();
        a = new int[n];
        System.out.println("Введите " + n + " элементов через пробел");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Введите какое-то число");
        b = in.nextInt();
        in.close();
    }

    public void getMax() {
        int count = 0;
        int anotherCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                anotherCount++;
            } else if (anotherCount != 0) {
                if (count < anotherCount) {
                    count = anotherCount;
                    anotherCount = 0;
                }
            }
        }
        int answer = count < anotherCount ? anotherCount : count;
        System.out.println("Максимальное количество подряд идущих: " + answer);
    }
}

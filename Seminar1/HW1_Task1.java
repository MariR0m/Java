package Seminar1;

import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n) и факториал.

public class HW1_Task1 {
    int n;

    public HW1_Task1() { 
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n-ое число: ");
        n = in.nextInt();
        in.close();
    }

    public void triangleNumber() {
        int sum_tri = 0;
        for (int i = 0; i < n + 1 ; i++) {
            sum_tri = sum_tri + i;
        }
        System.out.println("Треугольное число от " + n + " ранво: " + sum_tri);
    }

    public void factorial() {
        int sum_f = 1;
        for (int i = 1; i < n + 1; i++) {
            sum_f = sum_f * i;
        }
        System.out.println("Факториал от " + n + " ранво: " + sum_f);
    }
}

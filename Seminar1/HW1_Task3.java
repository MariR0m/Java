package Seminar1;
// 3) Реализовать простой калькулятор (+, -, *, /)

import java.util.Scanner;

public class HW1_Task3 {
    double x;
    double y;
    char action;

    public HW1_Task3() { 
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        x = input.nextDouble();
        System.out.println("Введите второе число: ");
        y = input.nextDouble();
        System.out.println("Вы можете выборать следующие операции: +, -, *, /.  Введите действие: ");

        Scanner scanner = new Scanner(System.in);
        action = scanner.next().charAt(0);

        input.close();
    }

    public void calculator() {
        switch (action) {
            case ('+'):
                System.out.println("Ответ: " + (x+y));
                break;
            case ('-'):
                System.out.println("Ответ: " + (x-y));
                break;
            case ('*'):
                System.out.println("Ответ: " + (x*y));
                break;
            case ('/'):
                System.out.println("Ответ: " + (x/y));
                break;
        }
    }
}

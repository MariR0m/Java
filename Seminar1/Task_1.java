package Seminar1;

import java.util.Scanner;

/*
 * Написать программу, которая запросит пользователя ввести Имя в консоли.
 * Получит введенную строку и выведет в консоль сообщение "Привет, Имя"
 */

public class Task_1 {
    public Task_1() { // Так обозначается конструктор класса
        System.out.println("Введите имя!");
    }

    public void nameOutput() {
        Scanner input = new Scanner(System.in); 
        String name = input.next();
        input.close();
        System.out.println("Привет, " + name);
    }

}

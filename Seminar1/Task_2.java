package Seminar1;

import java.util.Calendar;
import java.util.Scanner;

/*
 * В консоли запросить имя пользователя. В зависимости от текущего времени,
вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

public class Task_2 {
    String name;

    public Task_2() { // Так обозначается конструктор класса
        System.out.println("Введите имя!");
        Scanner input = new Scanner(System.in); 
        name = input.next();
        input.close();
    }

    public void goodTime() {
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
        && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) { // Здесь двойное и для того, чтобы если первое условие не пройдет оно не пошло проыерять второе, т.к. это бесмысленно. 
            System.out.println("Доброе утро, " + name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
            && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) { 
            System.out.println("Добрый день, " + name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
            && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) { 
            System.out.println("Добрый вечер, " + name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
            && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) { 
            System.out.println("Доброй ночи, " + name);
        }
    }
}

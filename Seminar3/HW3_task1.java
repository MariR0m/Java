package Seminar3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

public class HW3_task1 {
    
ArrayList<Integer> randomList;

    public HW3_task1() { 
    randomList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomList.add((int)(Math.random()*10));
        }
        System.out.println(randomList);
    }

    public void evenNumbers() {
        
    

        ArrayList<Integer> copyOfMyList = new ArrayList<>(randomList);
        copyOfMyList.removeIf(number -> number % 2 == 0);

        System.out.println("Список без четных чисел: " + copyOfMyList);
    }

    public void maxNumbers() {
        
       System.out.println("Максимальное число списка: " + (Collections.max(randomList)));
        
    }

    public void minNumbers() {
        
       System.out.println("Минимальное число списка: " + (Collections.min(randomList)));
        
    }

    public void cNumbers() {
        
       int result = 0;
       for (int m : randomList) {
        result += m;
       }
       System.out.println("Среднее значение: " + result/randomList.size());
        
    }

}

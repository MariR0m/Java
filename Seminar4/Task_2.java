package Seminar4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Task_2 {
    Integer a;
    Integer b;
    Deque<Integer> deque1;
    Deque<Integer> deque2;
    Deque<Integer> deque11;
    Deque<Integer> deque22;


    public Task_2() { 
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a для умножения: ");
        a = in.nextInt();
        System.out.println("Введите число b для умножения: ");
        b = in.nextInt();
        in.close();
        deque1 = spl(a);
        deque2 = spl(b);
        deque11 = deque1;
        deque22 = deque2;
    }

    public Deque<Integer> spl(int a) {
        Deque<Integer> dequeTemp = new ArrayDeque<>();
        Integer a1 = a;
        if (a1<0) {
            a1*=-1;
        }

        while (a1 !=0 ) {
            dequeTemp.addLast(a1%10);
            a1 /= 10;
        }
        System.out.println(dequeTemp);
        return dequeTemp;
    }


    public Deque<Integer> add(Deque<Integer> deque11, Deque<Integer> deque22) {
    Deque<Integer> result = new LinkedList<>();
    int carry = 0;

    for (int digit1 : deque11) {

        for (int digit2 : deque22) {
            int product = digit1 * digit2 + carry;
            result.addFirst(product % 10);
            carry = product / 10;
        }

        while (carry > 0) {
            result.addFirst(carry % 10);
            carry /= 10;
        }
    }

        while (!result.isEmpty() && result.peek() == 0) {
            result.remove();
    }

        return result;
    }


    public void res() {
        Deque<Integer> result = add(deque11, deque22);
        if ( a>=0 && b<0 && (b*-1)>a || a<0 && b>=0 && (a*-1)>b ) {
            System.out.println("Произведение двух чисел: -" + result);
        }
        else {
            System.out.println("Произведение двух чисел: " + result);
        }

    }
} 

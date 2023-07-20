package Seminar4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.
// Например: число 1 = 123 = хранится как 3,2,1
//           число 2 = 31 = хранится как 1,3
//           Вывод. Умножение: 3813 Сумма: 154

public class Task_1 {
    Integer a;
    Integer b;
    Deque<Integer> deque11;
    Deque<Integer> deque22;


    public Task_1() { 
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        a = in.nextInt();
        System.out.println("Введите число b: ");
        b = in.nextInt();
        in.close();
        deque11 = spl(a);
        deque22 = spl(b);

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

        if ((a>0 && b>0) || (a<0 && b<0)) {
            while (!deque11.isEmpty() || !deque22.isEmpty() || carry != 0) {
                int digit1 = deque11.isEmpty() ? 0 : deque11.removeFirst();
                int digit2 = deque22.isEmpty() ? 0 : deque22.removeFirst();

                int sum = digit1 + digit2 + carry;
                result.addFirst(sum % 10);
                carry = sum / 10;
            }

        }
        else if (a<0 && b>0 && (a*-1)>b) {
            while (!deque11.isEmpty() || !deque22.isEmpty() || carry != 0) {
                int digit1 = deque11.isEmpty() ? 0 : deque11.removeFirst();
                int digit2 = deque22.isEmpty() ? 0 : deque22.removeFirst();
                if (digit1<digit2) {
                    int sum = (digit1 + 10) - digit2 - carry;
                    result.addFirst(sum);
                    carry = 1;
                }
                else {
                int sum = digit1 - digit2 - carry;
                result.addFirst(sum);
                carry = 0;
                }
            }

        }
        
        else if (a<0 && b>0 && (a*-1)<b) {
            while (!deque11.isEmpty() || !deque22.isEmpty() || carry != 0) {
                int digit1 = deque11.isEmpty() ? 0 : deque11.removeFirst();
                int digit2 = deque22.isEmpty() ? 0 : deque22.removeFirst();
                if (digit2<digit1) {
                    int sum = (digit2+10) - digit1 - carry;
                    result.addFirst(sum);
                    carry = 1;
                }
                else {
                int sum = digit2 - digit1 - carry;
                result.addFirst(sum);
                carry = 0;
                }
            }

        }

        else if (a>0 && b<0 && a>(b*-1)) {
            while (!deque11.isEmpty() || !deque22.isEmpty() || carry != 0) {
                int digit1 = deque11.isEmpty() ? 0 : deque11.removeFirst();
                int digit2 = deque22.isEmpty() ? 0 : deque22.removeFirst();
                if (digit1<digit2) {
                    int sum = (digit1 + 10) - digit2 - carry;
                    result.addFirst(sum);
                    carry = 1;
                }
                else {
                int sum = digit1 - digit2 - carry;
                result.addFirst(sum);
                carry = 0;
                }
            }

        }
        
        else if (a>0 && b<0 && a<(b*-1)) {
            while (!deque11.isEmpty() || !deque22.isEmpty() || carry != 0) {
                int digit1 = deque11.isEmpty() ? 0 : deque11.removeFirst();
                int digit2 = deque22.isEmpty() ? 0 : deque22.removeFirst();
                if (digit2<digit1) {
                    int sum = (digit2+10) - digit1 - carry;
                    result.addFirst(sum);
                    carry = 1;
                }

                else {
                int sum = digit2 - digit1 - carry;
                result.addFirst(sum);
                carry = 0;
                }
            }

        }

        else if (a==0 && b==0) { 
            result.addFirst(0);
        }  
        else if (a==0 && b!=0) { 
            while (!deque22.isEmpty()) {
                int digit2 = deque22.isEmpty() ? 0 : deque22.removeFirst();
                int sum = digit2;
                result.addFirst(sum);
                }
            }
        else if (a!=0 && b==0) { 
            while (!deque11.isEmpty()) {
                int digit1 = deque11.isEmpty() ? 0 : deque11.removeFirst();
                int sum = digit1;
                result.addFirst(sum);
                }
        } 
        
        if (result.element() == 0) {
            result.remove();
        }

        if (result.isEmpty()) {
            result.addFirst(0);
        }

        return result;
    }

    public void res() {
        Deque<Integer> result = add(deque11, deque22);
        if ((a<0 && b<0) || a>=0 && b<0 && (b*-1)>a || a<0 && b>=0 && (a*-1)>b ) {
            System.out.println("Сумма двух чисел: -" + result);
        }
        else {
            System.out.println("Сумма двух чисел: " + result);
        }

    }
}    

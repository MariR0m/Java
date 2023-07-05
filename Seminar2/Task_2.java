package Seminar2;

import java.util.Scanner;

    
    /*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd. выход: abcd
 */

public class Task_2 {
    String myString;
    boolean repeated = false;

    Task_2() {
        Scanner in = new Scanner(System.in);
        myString = in.next();
        in.close();
    }

    public StringBuilder getUniqSequence() {
        StringBuilder result = new StringBuilder();
        char[] chars = myString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            repeated = false;
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                result.append(chars[i]);
            }
        }
        return result;
    }
}


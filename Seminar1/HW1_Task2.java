package Seminar1;

// Вывести все простые числа от 1 до 1000

public class HW1_Task2 {

    int n = 100;

    public void simpleNumber() {
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != 2) break;
                else if (j == (i - 1) && i % j != 0 || i == 2) {
                    System.out.print( i + ", ");
                }
            }
        }
    }
}

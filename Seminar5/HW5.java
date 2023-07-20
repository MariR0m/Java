package Seminar5;

public class HW5 {
    public static void main(String[] args) {
        Task_1 task1 = new Task_1();

        task1.addContact("Петя", "9118748267");
        task1.addContact("Вася", "9118538292");
        task1.addContact("Даша", "9118928267");
        task1.addContact("Вася", "9118537067");
        task1.addContact("Вася", "9117138267");
        task1.addContact("Даша", "9118530067");

        task1.printTelephoneBook();


    }
}

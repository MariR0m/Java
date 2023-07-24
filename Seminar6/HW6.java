package Seminar6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class HW6 {
   
    public static void main(String[] args) {
      Laptop firstLaptop = new Laptop("Самсунг", "Wind", "серый", 16 );
      Laptop anotherLaptop = new Laptop("Самсунг", "Wind", "серый", 32 );
      HashSet<Laptop> set = new HashSet();
      set.add(firstLaptop);
      set.add(anotherLaptop);
      System.out.println(set);

      Map<Integer, Object> meanings = new HashMap<>();

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите искомое значение:");
      String mean = scanner.nextLine();
      meanings.put(mean);

      Laptop.filterLaptops(set, meanings);
   }
   


}

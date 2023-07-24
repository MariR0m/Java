package Seminar6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HW6 {
   
    public static void main(String[] args) throws Exception {
      Laptop firstLaptop = new Laptop("Samsung", "Wind", "grey", 16 );
      Laptop secondLaptop = new Laptop("Samsung", "Wind", "grey", 32 );
      Laptop thirdLaptop = new Laptop("HP", "Wind", "grey", 32 );
      HashSet<Laptop> set = new HashSet();
      set.add(firstLaptop);
      set.add(secondLaptop);
      set.add(thirdLaptop);
      System.out.println(set);

      Scanner scanner = new Scanner(System.in);
      String criteria = scanner.nextLine();
      // scanner.nextLine();

      String value = scanner.nextLine();
      // scanner.nextLine();
      scanner.close();

      System.out.println(filter(set, criteria, value));
   }
   
   private static List<Laptop> filter(HashSet<Laptop> set, String criteria, String value) throws Exception {
      switch (criteria) {
         case "model" :
            return set.stream().filter(x -> value.equals(x.getModel())).collect(Collectors.toList());
         case "oc" :
            return set.stream().filter(x -> value.equals(x.getOC())).collect(Collectors.toList());
         case "colour" :
            return set.stream().filter(x -> value.equals(x.getColour())).collect(Collectors.toList());
         case "ram" :
            return set.stream().filter(x -> Integer.parseInt(value) == x.getRam()).collect(Collectors.toList());
         default :
            throw new Exception("Такого параметра нет");
      }
   }

}

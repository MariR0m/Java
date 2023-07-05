package Seminar2;

import java.util.ArrayList;
import java.util.List;

/*
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/

public class HW2_task1 {
    
     String filter = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
     String request = "select * from students where ";

     public void divide () {
          filter = filter.replaceAll("\"", "");
          String [] words = filter.split(", ");
          List<String> validWords = new ArrayList<>();
          for (String word : words) {
              String word2 [] = word.split(":");
               if (!word2[1].equals("null")) {
                 validWords.add(word2[0] + " = " + word2[1]);
               }
          }
          request = request + String.join(" AND ", validWords);
          System.out.println(request);
          }

}

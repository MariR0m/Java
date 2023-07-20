package Seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Программа также должна учитывать, что во входной структуре будут повторяющиеся
// имена с разными телефонами, их необходимо считать, как одного человека с разными
// телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

public class Task_1 {

    private Map<String, Set<String>> phoneBook = new HashMap<>();

    public void printTelephoneBook() {
        List<Map.Entry<String, Set<String>>> sortEntries = new ArrayList<>(phoneBook.entrySet());
        sortEntries.sort((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));

        for (Map.Entry<String, Set<String>> entry : sortEntries) {
            String name = entry.getKey();
            Set<String> phoneNumbers = entry.getValue();

            System.out.println(name + ": " + phoneNumbers);
        }
    }

    public void addContact(String name, String phoneNumber) {

        if (phoneBook.containsKey(name)) {
            Set<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            Set<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }
}

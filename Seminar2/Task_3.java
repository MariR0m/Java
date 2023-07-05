package Seminar2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/*
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

public class Task_3 {
    private static Logger logger = Logger.getLogger(Task_3.class.getName());

    public String stringGenerator() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEST");
        }
        return stringBuilder.toString();
    }

    public void writer() {
        try {
            FileWriter fileWriter = new FileWriter("Sem2.txt");
            fileWriter.write(stringGenerator());
            fileWriter.close();
        } catch (IOException e) {
            logger.log(Level.WARNING,"ВСЕ ОЧЕНЬ ПЛОХО", e);
        }
    }

//    public void writer() throws IOException {
//        FileOutputStream fileOutputStream = new
//                FileOutputStream("C:\\Users\\toshqaaa\\Desktop\\test.txt");
//
//        fileOutputStream.write(stringGenerator().getBytes());
//
//        fileOutputStream.close();
//    }
}


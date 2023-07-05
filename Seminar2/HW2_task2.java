package Seminar2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class HW2_task2 {


    int[] array = new int[5];
    FileWriter writer;

    public HW2_task2() throws IOException {
        writer = new FileWriter("output.txt");
    } 

    public void arr () throws IOException {
    for (int i = 0; i < array.length; i++) {
        array[i] = ((int)(Math.random()*10));
        // System.out.print(array[i] + " ");
        writer.write(array[i] + " ");
    }
    // System.out.print("\n");
    writer.write("\n");

    }

    public void print () throws IOException {
    for (int i = 0; i < array.length; i++) {
        writer.write(array[i] + " ");
    }
    writer.write("\n");
    }

    public void sort () throws IOException {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = swap;
                }
            print();
            }
        }
        writer.close();
    }
    

    
}

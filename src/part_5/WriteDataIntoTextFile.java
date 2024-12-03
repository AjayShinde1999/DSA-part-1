package part_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Read-Data\\secondfile.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello!!");
        bufferedWriter.write("My name is ajay");

        System.out.println("Finished!!");
    }
}

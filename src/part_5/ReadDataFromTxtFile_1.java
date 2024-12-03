package part_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTxtFile_1 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Read-Data\\firstfile.txt");
        BufferedReader bf = new BufferedReader(file);

        String str;
        while ((str = bf.readLine()) != null) {
            System.out.println(str);
        }
    }
}

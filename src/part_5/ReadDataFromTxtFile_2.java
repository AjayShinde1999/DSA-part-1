package part_5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadDataFromTxtFile_2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Read-Data\\firstfile.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}

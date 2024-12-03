package part_1;

import java.util.*;

public class AnagramNumber{
    public static void main(String[] args){
        System.out.println(anagramNumber(123,321));
    }

    public static boolean anagramNumber(int num1, int num2){

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        if(str1.length() != str2.length()){
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        return Arrays.equals(ch1, ch2);
    }
}

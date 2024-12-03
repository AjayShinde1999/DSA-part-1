package patterns;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String str = "abfk";
        String result = difference(str);
        System.out.println(result);
    }

    public static String difference(String str){
        char[] ch = str.toCharArray();
        String temp = "";

        for(int i=0; i<ch.length-1; i++){
            int d = ch[i+1]-ch[i];
            System.out.println(d);
            temp = temp+ch[i];
            temp = temp+d;
        }

        return temp;
    }
}

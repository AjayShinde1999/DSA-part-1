package dsa_found_patterns;

//*
//**
//***
//****
//*****
public class Pattern_3 {
    public static void main(String[] args) {

        int nstr = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*");
            }
            nstr++;
            System.out.println();
        }
    }
}

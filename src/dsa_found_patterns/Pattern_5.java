package dsa_found_patterns;

// N=5
//  *
// ***
//*****
// ***
//  *
public class Pattern_5 {
    public static void main(String[] args) {
        int n = 5;
        int nspc = n / 2;
        int nstr = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=nspc; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=nstr; k++){
                System.out.print("*");
            }

            if(i<=n/2){ // up to half row (i is for row)
                nspc--;
                nstr = nstr+2;
            } else {
                nspc++;
                nstr = nstr-2;
            }
            System.out.println();
        }

    }
}

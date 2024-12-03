package dsa_found_patterns;

//N=5
//***_***
//**___**
//*_____*
//**___**
//***_***
public class Pattern_6 {
    public static void main(String[] args) {
        int n = 5;
        int nstr = n / 2 + 1;
        int nspc = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= nspc; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                nstr--;
                nspc = nspc + 2;
            } else {
                nstr++;
                nspc = nspc - 2;
            }
            System.out.println();
        }
    }
}

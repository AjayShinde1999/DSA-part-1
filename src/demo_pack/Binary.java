package demo_pack;

public class Binary {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<=n; i++){
            System.out.println(fib(i));
        }
    }

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        int temp1 = fib(n-1);
        int temp2 = fib(n-2);
        return temp1+temp2;
    }
}

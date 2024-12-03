package dsa_found_patterns;
//1
//2 3
//4 5 6
//7 8 9 10
public class Pattern_4 {
    public static void main(String[] args) {

        int nums = 1;
        int count = 1;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=nums; j++){
                System.out.print(count);
                count++;
            }
        }
        nums++;
        System.out.println();
    }
}

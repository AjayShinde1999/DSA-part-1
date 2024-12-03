package Levelup_Arrays_1;

public class SumOfQuery {
    public static void main(String[] args) {
        int[] arr = {-2, 5, 1, 3, 4, 1, 7, -8, 2, 0};
        int[][] query = new int[5][2];
        query[0][0] = 3;
        query[0][1] = 8;
        query[1][0] = 2;
        query[1][1] = 4;
        query[2][0] = 0;
        query[2][1] = 3;
        query[3][0] = 5;
        query[3][1] = 9;
        query[4][0] = 6;
        query[4][1] = 6;

        sumQuery(arr,query);
    }

//      TC = O(Q*N) and SC = O(1)
//    public static void sumQuery(int[] arr, int[][] query) {
//
//        for (int i = 0; i < query.length; i++) {
//            int left = query[i][0];
//            int right = query[i][1];
//
//            int sum = 0;
//            for (int j = left; j <= right; j++) {
//                sum = sum + arr[j];
//            }
//            System.out.println(sum);
//        }
//    }

//    TC = O(N) and SC = O(N)
    public static void sumQuery(int[] arr, int[][] query){

        int[] pf = sumPrefix(arr);

        for(int i=0; i<query.length; i++){
            int left = query[i][0];
            int right = query[i][1];

            int sum = 0;
            if(left > 0){
                sum = pf[right] - pf[left -1];
            } else { // left == 0
                sum = pf[right];
            }
            System.out.println(sum);
        }
    }

    private static int[] sumPrefix(int[] arr) {

        int[] pf = new int[arr.length];
        pf[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            pf[i] = pf[i-1] + arr[i];
        }
        return pf;
    }


}

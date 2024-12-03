package algoprep_video_11;

// Count total elements number having at least 1 element greater than itself.
public class SecondProblem {
    public static void main(String[] args) {
        int[] arr = {-4, -3, 7, 9, 3, 9, 4};
        int count = count(arr);
        System.out.println(count);
    }

    public static int count(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                count++;
            }
        }
        int result = arr.length - count;
        return result;
    }
}

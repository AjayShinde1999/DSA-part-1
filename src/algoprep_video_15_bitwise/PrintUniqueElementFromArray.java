package algoprep_video_15_bitwise;

// Given arr[N], every element appears twice except for one element which appears once, find that unique element.
// Eg: {2,2,1,9,9} ans = 1;
public class PrintUniqueElementFromArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 9, 9}; // duplicate should not exceed more than twice.
        int ans = printUniqueElement(arr);
        System.out.println(ans);
    }

    public static int printUniqueElement(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}

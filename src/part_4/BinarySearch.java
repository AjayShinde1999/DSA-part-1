package part_4;

// Binary search
// rule 1 : it should be sorted array
// key == mid than that is the answer.
// key > mid than L = mid + 1
// key < mid than H = mid - 1
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 45, 67, 87, 90, 98, 100};

        int key = 98;
        int l = 0;
        int h = arr.length - 1;

        boolean result = false;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == arr[mid]) {
                System.out.println("Element Found....");
                result = true;
                break;
            }
            if (key > arr[mid]) {
                l = mid + 1;
            }
            if (key < arr[mid]) {
                h = mid - 1;
            }
        }

        if (!result) {
            System.out.println("Element not found ");
        }
    }
}

package part_4;

public class LinerSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 5, 15};
        int searchEle = 30;
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (searchEle == arr[i]) {
                System.out.println("Element found at : " + i);
                result = true;
                break;
            }
        }

        if (result == false) {
            System.out.println("Element not found");
        }
    }
}

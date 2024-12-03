package algoprep_video_13;

public class ToggleCharacter {
    public static void main(String[] args) {
        char[] c = {'A', 'j', 'a', 'y', 'S', 'h', 'i', 'n', 'd', 'e'};
        toggleCharacter(c);
    }

    public static void toggleCharacter(char[] c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 65 && c[i] <= 90) {
                c[i] = (char) (c[i] + 32);
            } else {                            // or (c[i] >= 97 && c[i] <= 122)
                c[i] = (char) (c[i] - 32);
            }
        }

        for (char i : c) {
            System.out.print(i + " ");
        }
    }
}

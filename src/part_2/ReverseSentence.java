package part_2;

public class ReverseSentence {
    public static void main(String[] args) {
        String intro = "my name is ajay";
        String[] s = intro.split(" ");

//        StringBuilder builder = new StringBuilder();
//        for (int i = s.length - 1; i >= 0; i--) {
//            builder.append(s[i]+" ");
//        }
//        System.out.println(builder);

        String rev = "";
        for (int i = s.length - 1; i >= 0; i--) {
            rev = rev + s[i] + " ";
        }

        System.out.println(rev);
    }
}

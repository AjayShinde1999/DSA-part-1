package part_2;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String intro = "my name   is    ajay";
//      String s = intro.replaceAll(" ", "");
        String s = intro.replaceAll("\\s","");
        System.out.println(s);
    }
}

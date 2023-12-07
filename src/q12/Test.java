package q12;

public class Test {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(subtext(str, 3, 8)); //Line n1
    }

    /* private static int[] subtext(String text, int start, int end) {
        return null; // text.substring(start, end);
    } */

    /* private static String[] subtext(String text, int start, int end) {
        return null; // text.substring(start, end);
    } */

    private static String subtext(String text, int start, int end) {
        return text.substring(start, end);
    }
}

package q41;

public class Test {
    private static <T extends Number> void print(T t) {
        System.out.println(t.intValue());
    }

    public static void main(String[] args) {
        print(Double.valueOf(5.5));
    }
}

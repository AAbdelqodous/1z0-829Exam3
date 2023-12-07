package q18;

public class Test {
    public static void main(String[] args) {
        System.out.println("I\sam\sthat\sI\sam.");
//        System.out.println("""I\sam\sthat\sI\sam.""");
        //compilation error as there must be a newline after the opening delimiter (""")

        System.out.println("""
            I\
             am\
             that\
             I\
             am.\
            """);
        System.out.println("""
            I\sam\sthat\sI\sam.""");
    }
}

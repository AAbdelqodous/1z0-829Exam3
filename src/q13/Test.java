package q13;

public class Test {
    public static void main(String[] args) {
        int score = 60;
        switch (score) {
            default:
                System.out.println("Not a valid score");
            case 60: // case < 70:
                System.out.println("Failed");
                break;
            case 80: // case > 70:
                System.out.println("Passed");
                break;
        }
    }
}

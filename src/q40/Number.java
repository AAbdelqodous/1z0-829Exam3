package q40;

public class Number {
    public void find(){
        final int x = 10;

        record Calculator(int num){
            // A local record is implicitly static,
            // which means its body cannot refer to variables in the enclosing method.
            int calc(){
                return Calculator.this.num * 2; // x;
            }
        }

        System.out.println(new Calculator(10).calc());
    }
}

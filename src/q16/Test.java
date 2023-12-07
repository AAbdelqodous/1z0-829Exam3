package q16;

public class Test {
    public static void main(String[] args) {
        Creator<String, Log> obj = Log::new; //Log::new is same as s -> new Log(s);
        // as create method accepts first type parameter T,
        // which is String and returns 2nd type parameter R, which is Log.
        // lambda expression s -> new Log(s); calls the parameterized constructor of Log class and returns the Log instance.
        // But to create an instance of Log class, you need to invoke the create method: obj.create("some string");
    }
}

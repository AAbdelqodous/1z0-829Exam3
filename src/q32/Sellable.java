package q32;

public interface Sellable {
    double getPrice();
    default String symbol() {
        return "$";
    }
}

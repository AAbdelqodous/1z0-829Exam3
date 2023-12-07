package q43;

public record Rope(int length, String color) {
    @Override
    public String toString() {
        return "q43.Rope [" + color + ", " + length + "]";
    }

    record RedRopeFilter() { //RedRopeFilter is a local record and a local record is implicitly static.
        boolean filter(Rope rope) {
            return rope.color.equalsIgnoreCase("Red");
        }
    }
}

package generics;

public class Pair<First extends Number, Second> {
    First first;
    Second second;

    static <T> T doSomething(T t) {
        System.out.println("Printing t " + t);
        return null;
    }

    public First getFirst() {
        System.out.println(first.intValue());
        return first;
    }

    public Second getSecond() {
        return second;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    public void setSecond(Second second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

import java.util.function.Function;

public class HigherOrderFunction {

    public Function<Integer, Integer> combineFunctions(Function<Integer, Integer> a, Function<Integer, Integer> b){
        return a.andThen(b);
    }

    public static void main(String[] args) {
        final Function<Integer, Integer> addTwo = x -> x + 2;
        final Function<Integer, Integer> addFive = x -> x + 5;
        final Function<Integer, Integer> combinedFunction = new HigherOrderFunction().combineFunctions(addTwo, addFive);
        System.out.println(combinedFunction.apply(3));
    }
}

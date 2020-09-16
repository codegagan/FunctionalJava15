import java.util.Collections;
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.*;

public record Experiments(Long appId, Map fields) {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Experiments x = new Experiments(5L, Collections.singletonMap("name", "gagan"));
        System.out.println(x.appId());
        System.out.println(x.fields());

        Consumer print = System.out::println;
        Consumer printWithCompose = print.andThen(val -> System.out.println(val + "Composed"));


        Consumer willPrint = y -> System.out.println("Will print");
        Consumer wrapAround = willPrint.andThen(z -> System.out.println("actual value " + z))
                .andThen(z -> System.out.println("Finished printing"));


        wrapAround.accept("myValue");

        final IntUnaryOperator doubleToIntFunction = integer -> integer + 1;
        Callable<String> call = () -> "FP";

        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        System.out.println(executorService.submit(call).get());
//        executorService.shutdownNow();
    }


}

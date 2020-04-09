package it.intersistemi.corsojava.lambdaexpressions.examples;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExpressionExample {

    public static void main(String[] args) {
        Random value = new Random(System.nanoTime());
        value.ints().boxed()
                .filter(i -> i >= 65 && i <= 122)
                .map(i -> Character.valueOf((char)((Integer) i).intValue()))
                .forEach(r -> System.out.println(r));
    }

    public static <T, R> void supplyChain(Supplier<T> supplier, Function<T, R> function, Consumer<R> consumer){
        T value = null;
        while((value = supplier.get()) != null){
            R result = function.apply(value);
            consumer.accept(result);
        }
    }

}

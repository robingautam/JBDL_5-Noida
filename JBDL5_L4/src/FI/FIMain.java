package FI;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FIMain {


    public static void main(String[] args) {

        // 1. Predicate
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };

        System.out.println(predicate.test(35));

        // 2. Function
        Function<Integer,Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };


        System.out.println(function.apply(2));

        // 3. Supplier

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 3;
            }
        };

        System.out.println(supplier.get());
    }

    // 4. Consumer
    Consumer<Integer> cn = new Consumer<Integer>() {
        @Override
        public void accept(Integer integer) {
            System.out.println(integer);
        }
    };


}

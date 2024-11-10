package Lambda;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // 1.
        Inter inter = new InterImpl();
        inter.someTask();

        // 2.
        Inter inter1 = new Inter() {
            @Override
            public void someTask() {
                System.out.println("some another implementation");
            }
        };

        inter1.someTask();

        //3.
        Inter intrObjLmb = ()-> System.out.println("Lamnda Implementation");

        intrObjLmb.someTask();


        Function<Integer,Integer> function =( i)-> {return i*i;};

        System.out.println(function.apply(23));





    }
}

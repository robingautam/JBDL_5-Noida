package streams;

import Lambda.Inter;
import Lambda.InterImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streamsMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2); list.add(5); list.add(23);
        list.add(33); list.add(49); list.add(4);

        List<Integer> ans = new ArrayList<>();

        for (int num: list){
            if (num%2==0){
                ans.add(num);
            }
        }

        System.out.println(ans);

        Function<Integer,Integer> function = (i)->i*i;

       List<Integer> ans2 = list.stream().skip(1).filter((i)-> i%2==0).map(i->i*i).collect(Collectors.toList());

        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        System.out.println(ans2);
    }
}

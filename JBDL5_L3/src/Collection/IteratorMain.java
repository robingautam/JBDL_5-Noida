package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5,6,78,8);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.iterator();

        for (int i:list){

        }


        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            itr.remove();
            System.out.println(itr.next());
          //  list.remove(3);
        }
    }
}

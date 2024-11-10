package Collection;

import java.util.*;

public class CollectionMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(34);

        System.out.println(list.remove(0));
        System.out.println(list.size());

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(23);

        System.out.println(linkedList);

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(0);

        System.out.println(set.remove(34));

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        // linkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(0);

        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(23);
        treeSet.add(2);

        System.out.println(treeSet);

        // Queue
        Queue<Integer> queue = new LinkedList<>();

        queue.add(23);
        queue.add(12);

        System.out.println(queue.poll());

        


    }
}

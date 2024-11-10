package Collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Robin",23);
        map.put("Preeti",56);

        System.out.println(map.get("Robin"));


        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        for (String k: map.keySet()){
            System.out.println(k+": "+map.get(k));
        }


    }
}

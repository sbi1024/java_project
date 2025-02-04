package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("aaa", 50);
        map.put("aaa", 50);
        map.put("aaa", 50);
        map.put("aaa", 50);
        map.put("aaa", 50);
        map.put("aaa", 50);

        System.out.println(map.size());
        System.out.println(map.get("aaa"));
        System.out.println(map.containsKey("aaa"));


        Set<String> keySet = map.keySet();
        Iterator<String> itr = keySet.iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            Integer v = map.get(key);
            System.out.println("v = " + v);
        }
    }
}

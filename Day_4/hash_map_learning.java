package Day_4;

import java.util.Hashtable;
import java.util.Map;

public class hash_map_learning {
    public static void main(String[] args) {
        System.out.println("---------------Let's learn hashmap---------------");
        //defining hashmap
        Hashtable<Character, Integer> hm = new Hashtable<Character, Integer>();
        hm.put('e',1);
        hm.put('t',3);
        hm.put('r',4);
        for (Character key : hm.keySet()) {
            if(key == 'e'){
                int value = hm.get(key);
                hm.put(key, ++value);
            }
            int val = hm.get(key);
            System.out.println("Key: " + key + ", Value: " + val);
        }
        System.out.println(hm);
    }
}

package S12_Java_Collection.Thuc_hanh.Su_dung_HashMap_LinkedHashMap_TreeMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class demo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(30,"Smith");
        hashMap.put(31,"Anderson");
        hashMap.put(29,"Lewis");
        hashMap.put(32,"Cook");
        hashMap.put(32,"Cooks");
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap);
    }
}

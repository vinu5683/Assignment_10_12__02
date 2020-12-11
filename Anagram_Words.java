import java.util.HashMap;
import java.util.Map;

public class Anagram_Words {
    public static void main(String[] args) {
        String str1 = "den";
        String str2 = "end";
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        //TODO adding str1 to Hashmap1
        for (int i = 0; i < str1.length(); i++) {
            if (hashMap1.containsKey(str1.charAt(i))) {
                int count = hashMap1.get(str1.charAt(i));
                hashMap1.put(str1.charAt(i), count + 1);
            } else
                hashMap1.put(str1.charAt(i), 1);
        }

        //TODO adding str2 to Hashmap2
        for (int i = 0; i < str2.length(); i++) {
            if (hashMap2.containsKey(str2.charAt(i))) {
                int count = hashMap2.get(str2.charAt(i));
                hashMap2.put(str2.charAt(i), count + 1);
            } else
                hashMap2.put(str2.charAt(i), 1);
        }

        //TODO checking length of both hashes
        if (hashMap1.size() != hashMap2.size()) {
            System.out.println("FALSE");
        }

        //TODO checking does all characters key's have same value
        else {
            for (Map.Entry<Character, Integer> map : hashMap1.entrySet()) {
                if (hashMap2.containsKey(map.getKey())) {
                    if (!map.getValue().equals(hashMap2.get(map.getKey()))) {
                        System.out.println("FALSE");
                        return;
                    }
                } else {
                    System.out.println("FALSE");
                    return;
                }
            }
            System.out.println("TRUE");
        }
    }
}

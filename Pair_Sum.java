import java.util.HashMap;
import java.util.Map;

public class Pair_Sum {
    public static void main(String[] args) {
        int[] array = {1, 3 , 5 , 2 , 7};
        int pair_Sum = 8;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                //TODO checking pair_sum and array[j] not there in key set of hashes
                if ((array[i] + array[j]) == pair_Sum && !(hashMap.containsKey(array[j]))) {
                    hashMap.put(array[i], array[j]);
                }
            }
        }

        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            System.out.println("(" + map.getKey() + "," + map.getValue() + ")");
        }
    }
}

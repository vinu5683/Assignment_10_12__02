import java.util.LinkedHashMap;
import java.util.Map;

public class Users_Age_Filter {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("Nrupul", 32);
        hashMap.put("Prateek", 30);
        hashMap.put("Aman", 26);
        hashMap.put("Ankur", 34);
        hashMap.put("Albert", 28);
        hashMap.put("Yogesh", 44);
        hashMap.put("Sidharth", 22);
        for(Map.Entry<String , Integer> map:hashMap.entrySet()){
            if(map.getValue()>30)
                System.out.println(map.getKey());
        }
    }
}

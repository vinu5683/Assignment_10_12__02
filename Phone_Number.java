import java.util.HashMap;
import java.util.Map;

public class Phone_Number {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Ajay", "21345");
        hashMap.put("RamDas", "32146");
        hashMap.put("Rohith", "23522");
        hashMap.put("Nihal", "98743");

        String user="Nihal";

        //TODO Searching PhoneNumber
        for (Map.Entry<String,String> map:hashMap.entrySet()){
            if(map.getKey().equals(user)){
                System.out.println(map.getValue());
                return;
            }
        }
        System.out.println("No user found");
    }
}

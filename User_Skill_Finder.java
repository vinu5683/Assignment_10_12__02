import java.util.LinkedHashMap;
import java.util.Map;

public class User_Skill_Finder {
    public static void main(String[] args) {

        //array of Skills individual.
        String[] Nrupul = {"cmd", "python", "sql"};
        String[] Prateek = {"js", "html"};
        String[] Aman = {"ds", "algo"};
        String[] Albert = {"js", "react"};

        //skill to find.
        String skill = "ds";

        //TODO putting data into hashmap.
        LinkedHashMap<String, String[]> hashMap = new LinkedHashMap<>();
        hashMap.put("Nrupul", Nrupul);
        hashMap.put("Prateek", Prateek);
        hashMap.put("Aman", Aman);
        hashMap.put("Albert", Albert);

        //TODO searching for the Skill in hash values and printing the hash key
        for(Map.Entry<String ,String[]> map:hashMap.entrySet()){
            for(int i=0;i<map.getValue().length;i++){
                if(map.getValue()[i].equals(skill)){
                    System.out.println(map.getKey());  //printing the hash key
                }
            }
        }
    }
}

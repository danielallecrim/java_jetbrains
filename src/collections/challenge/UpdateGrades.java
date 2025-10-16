package collections.challenge;

import java.util.Map;
public class UpdateGrades {

    public static Map<String, Integer> updateGrades(Map<String, Integer> gradebook, Map<String, Integer> makeupGrades) {

        for(Map.Entry<String,Integer> entry : gradebook.entrySet()){
            String key = entry.getKey();
            Integer valueGradeBook = entry.getValue();
            Integer valueMakeupGrades = makeupGrades.get(key);
            if(valueGradeBook >= valueMakeupGrades){
                gradebook.put(key, valueGradeBook);
            }else{
                gradebook.put(key,valueMakeupGrades);
            }
        }
        return gradebook;
    }
}

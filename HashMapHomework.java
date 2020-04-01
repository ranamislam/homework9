import java.util.HashMap;
import java.util.Map;
public class HashMapHomework
{
    public static void main(String[] args)
    {
        Map<String, Integer> studentData = new HashMap<>();

        studentData.put("Student-1", 12345);
        studentData.put("Student-2", 67890);

        for(Map.Entry retrieveStudentData : studentData.entrySet())
        {
            System.out.println(retrieveStudentData.getKey() + "\t" + retrieveStudentData.getValue());
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class duplicatesInoutput {

    static  void Count (String str)
    {
        HashMap<Character,String> map= new HashMap<>();

        for(int i=0; i<str.length(); i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),1);
            }
            else
            map.put(str.charAt(i), map.get(str.charAt(i))+1);
        }

        for(Map.Entry mapElement : map.entrySet())
        {
            char key= (char)mapElement.getKey();
            int value= (char)mapElement.getValue();

            if(value>1)
            {
                System.out.println(key + ", count = "+ value);
            }
        }
    }
    public static void main(String args[])
    {
        String str="AABBCCedfg";
        Count(str);
    }
    
}

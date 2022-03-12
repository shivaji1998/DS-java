package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> student = new Hashtable<String,Integer>();

        student.put("priya",3);
        student.put("shivaji",2);
        student.put("akash",4);

        Set<String> data = student.keySet();
        for (String i:data) {
            System.out.println(i.hashCode()%10);

        }
        Set<Map.Entry<String,Integer>> data1=student.entrySet();
        for (Map.Entry<String,Integer>i:data1)
        {
            System.out.println(i.getKey() + " " + i.getValue());
        }


    }
}

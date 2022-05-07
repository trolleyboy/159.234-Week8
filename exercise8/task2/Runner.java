package exercise8.task2;

import java.util.*;

public class Runner {
    
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();

        al.add("String 1");
        al.add("String 2");
        al.add("String 3");

        Iterator<String> iter = al.iterator();

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        int hmCount = 1;
        while (iter.hasNext()) {
            hm.put(hmCount, iter.next());
            hmCount++;
        }

        System.out.println(hm);
    }

}

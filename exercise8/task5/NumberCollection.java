package exercise8.task5;

import java.util.*;

public class NumberCollection {
    
    // attributes
    
    // constructors

    // methods
    public static void printNumbers(Collection<? extends Number> numbers) {

        for (Number n : numbers) {
            System.out.println("Number: " + n);
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Number> al = new ArrayList<Number>();
        al.add(1);
        al.add(2);
        al.add(3.1);
        al.add(4.1);
        al.add(5);


        printNumbers(al);
    }
}

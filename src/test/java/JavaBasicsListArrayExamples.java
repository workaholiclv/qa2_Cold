import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//Class work Nr.4.

//Creating main class
public class JavaBasicsListArrayExamples {
    //Adding Junit test component
    @Test
    public void ListArrayExamples(){

        //Creating new empty array list "klase"
        List<String> klase = new ArrayList<String>();

        //Adding names to our new array list "klase"
        klase.add("Laura");
        klase.add("Dmitrijs");
        klase.add("Ieva");
        klase.add("Sergejs");

// Print out every name from list array "klase"
//        for (String name : klase) {
//        System.out.println(name);
//         }
// Print out every 2nd name from list array "klase"
//        for (int i = 0; i < klase.size(); i += 2) {
//            System.out.println(klase.get(i));
//        }

        //Checking size of the list "klase", printing out result
        System.out.println("Size of List is:" +  klase.size());

        //Checking if the list "klase" is empty or not "true/false"(working just like boolean), printing out result
        System.out.println("Is list empty:" + klase.isEmpty());

        //Getting every 2nd name from the array list "klase", printing out result
        System.out.println("3rd one is:" + klase.get(2));

    }
}

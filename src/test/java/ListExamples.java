import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    @Test
    public void listExample (){
        List<String> klase = new ArrayList<String>();
        klase.add("Laura");
        klase.add("Dmitrijs");
        klase.add("Ieva");
        klase.add("Sergejs");
        klase.add("Kads runajosais calis");

        for (int i = 0; i < klase.size(); i++) {
            System.out.println(klase.get(i));
        }

//        System.out.println("Size of list is:" + klase.size());
//        System.out.println("Is list empty:" + klase.isEmpty());
//        System.out.println("3d one is:" + klase.get(2));

    }
}

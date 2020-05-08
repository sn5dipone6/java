package onclass.nine;

import java.util.HashSet;
import java.util.Set;

public class FindDups {
    public static void main(String[] args) {
        Set s = new HashSet();
        for (int i = 0; i < args.length; i++) {
            if (!s.add(args[i]))
                System.out.println("Duplicate detected:" + args[i]);

        }
        System.out.println(s.size() + " distinct words detexted:" + s);
    }
}

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;

import Homework6.Unicornshop;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);

        Unicornshop unicorn1 = new Unicornshop(500000, "Егорка", 245, formatter.parse("Sat, April 4, 2019"), true, 1);
        Unicornshop unicorn2 = new Unicornshop(350000, "Агата", 240, formatter.parse("Sat, April 1, 2022"), false, 2);

        HashSet<Unicornshop> unicornSet = new HashSet<Unicornshop>();
        unicornSet.add(unicorn1);
        unicornSet.add(unicorn2);

        System.out.println(unicorn1);
        System.out.println(unicorn2);

        System.out.println(unicorn1.equals(unicorn2));
        System.out.println(unicornSet.contains(unicorn2));

    }
}

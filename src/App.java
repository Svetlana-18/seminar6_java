
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;

import Homework6.Unicornshop;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);

        Unicornshop unicorn1 = new Unicornshop(500000, "Егорка", 245, formatter.parse("Sat, April 4, 2019"), true, 1, 150000);
        Unicornshop unicorn2 = new Unicornshop(350000, "Агата", 240, formatter.parse("Sat, April 1, 2022"), false, 2, 200000);
        Unicornshop unicorn3 = new Unicornshop(420000, "Регат", 140, formatter.parse("Sat, May 23, 2021"), true, 3, 300000 );
        Unicornshop unicorn4 = new Unicornshop(290000, "Афродита", 220, formatter.parse("Sat, December 13, 2020"), false, 4, 150000);
        Unicornshop unicorn5 = new Unicornshop(340000, "Карат", 60, formatter.parse("Sat, May 1, 2023"), true, 5, 200000);
        Unicornshop unicorn6 = new Unicornshop(300000, "Лана", 40, formatter.parse("Sat, April 1, 2018"), false, 6,300000);

        HashSet<Unicornshop> unicornSet = new HashSet<Unicornshop>();
        unicornSet.add(unicorn1);
        unicornSet.add(unicorn2);
        unicornSet.add(unicorn3);
        unicornSet.add(unicorn4);
        unicornSet.add(unicorn5);
        unicornSet.add(unicorn6);

        System.out.println(unicorn1);
        System.out.println(unicorn2);
        System.out.println(unicorn3);
        System.out.println(unicorn4);
        System.out.println(unicorn5);
        System.out.println(unicorn6);

        System.out.println(unicorn1.equals(unicorn2));
        System.out.println(unicornSet.contains(unicorn2));

    }
}

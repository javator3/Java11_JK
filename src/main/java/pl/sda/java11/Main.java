package pl.sda.java11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code her

        var zmienna = "Zmienna";

        System.out.println(zmienna);

        var list = new ArrayList<String>();
        list.add("yow");

        System.out.println(list);

        var l = List.of("A", "B", "c");
        var copy = List.copyOf(l);

        var map = Map.of("A", 1, "B", 2);
        System.out.println(map);

    }
}

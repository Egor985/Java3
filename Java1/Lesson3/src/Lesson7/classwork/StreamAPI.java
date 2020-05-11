package Lesson7.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    interface A{
        void foo(String a);
    }

    public static void main(String[] args) {
       // Stream<String> stream = List.of("ca", "aa", "b", "cc", "ad").stream();
        A a = System.out::println;
        a.foo("asfasf");
        System.out.println(List.of("ca", "aa", "aa" ,"b", "b" ,"cc", "ad")
                .stream()
                .map(listElement -> listElement + "a")
                .filter(listElement -> listElement.startsWith("a"))
                .distinct()
                .collect(Collectors.joining(", ")));
    }
}

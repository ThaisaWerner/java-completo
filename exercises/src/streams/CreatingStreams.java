package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {

        Consumer<Object> print = System.out::println;

        Stream<String> languages = Stream.of("Java", "Python", "JavaScript\n");
        languages.forEach(print);

        String[] moreLanguages = {"C", "C++", "C#", "Go", "Ruby", "PHP\n"};

        Stream.of(moreLanguages).forEach(print);
        Arrays.stream(moreLanguages).forEach(print);
        //Choosing the range of elements to be printed
        Arrays.stream(moreLanguages, 2, 5).forEach(print);

        List<String> anotherLangs = Arrays.asList("Kotlin", "Swift", "Dart", "Rust", "Scala\n");
        anotherLangs.stream().forEach(print);
        anotherLangs.parallelStream().forEach(System.out::println);

        //Creating an infinite stream
        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0, n -> n + 1).forEach(System.out::println);
    }
}

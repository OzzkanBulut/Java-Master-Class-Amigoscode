import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {

    @Test
    void streams(){
        List<String> names = List.of("amigoscode","alex","özkan");
        Stream<String> stream = names.stream();
        Stream<String> namesStream = Stream.of("amigoscode","alex","özkan");

        List<Object> collect = stream
                .limit(2).map(null).sorted(null).dropWhile(null) // intermediate operators
                .collect(Collectors.toList()); // Terminal operator

        long count = stream
                .limit(2).map(null).sorted(null).dropWhile(null) // intermediate operators
                .count(); // Terminal operator

        String[] namesArray = {};
        // namesArray.stream() DOES NOT WORK. DO THIS:
        Arrays.stream(namesArray);



    }
}

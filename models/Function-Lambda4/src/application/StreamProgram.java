package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgram {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> stream1 = list.stream();
        System.out.println(Arrays.toString(stream1.toArray()));

        Stream<Integer> stream2 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream2.toArray()));

        Stream<String> stream3 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(stream3.toArray()));

        Stream<Integer> stream4 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream4.limit(10).toArray()));

        // Fibonacci Sequence:
        Stream<Long> stream5 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(stream5.limit(10).toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum " + sum);

        List<Integer> integerList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
        System.out.println(Arrays.toString(integerList.toArray()));
    }
}
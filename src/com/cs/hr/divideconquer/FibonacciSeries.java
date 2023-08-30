package com.cs.hr.divideconquer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSeries {


    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(findNFibo(i));
        }

        List<Integer> collect = Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]}).limit(10).map(x -> x[0]).collect(Collectors.toList());
        collect.forEach(System.out::println);

//        Stream.iterate(0,x->x+1).limit(10).forEach(System.out::println);
//        IntStream.rangeClosed(1,100).forEach(System.out::println);

    }


    private static int findNFibo(int n) {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return findNFibo(n-1) + findNFibo(n-2);
    }
}

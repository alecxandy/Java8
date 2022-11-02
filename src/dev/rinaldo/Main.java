package dev.rinaldo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]){

        String arr[] = {"a","b","c","c"};
        List<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Arrays.stream(arr).distinct().limit(2).forEach( e -> System.out.println(arr.toString()));
        list.stream().forEach(e -> System.out.println(e));
    }
}

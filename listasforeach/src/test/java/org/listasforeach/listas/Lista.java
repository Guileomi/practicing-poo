package org.listasforeach.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Mario");
        list.add("Amari");
        list.add("Omari");
        list.add(2, "A Mari");

        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }


        System.out.println("_______________");
        //list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("_______________");
        System.out.println("Index of Omari: " + list.indexOf("Omari"));
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("_______________");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("_______________");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}

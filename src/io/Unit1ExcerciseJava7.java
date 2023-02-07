package io;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Revanasidda", "g", 25),
                new Person("Sangita", "patl", 25),
                new Person("anil", "sarapanch", 50),
                new Person("Dharma", "g", 48),
                new Person("Guru", "c", 48));


//        1. sort list of elements by lastname
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

//        2.print all elements create a method

        System.out.println("print all persons ");
        printAll(people);


        System.out.println("lastname startsWith with c");
        //3. printlastnamewithbeginning with c
        printConditionally( people, new condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("c");
            }
        });

    }

    public static void printConditionally(List<Person> person, condition c){
        for(Person p:person) {
            if (c.test(p))
                System.out.println(p);
        }
    }

    private static void printAll(List<Person> people) {
        for(Person p:people){
            System.out.println(p);
        }



    }
    interface condition{
        boolean test(Person p);
    }
}

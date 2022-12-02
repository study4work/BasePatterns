package com.lysenko.pattenrsOOP.behavioral.Iterator;
import java.util.Arrays;

public class DeveloperRunner {
    public static void main(String[] args) {
        JavaDeveloper developer = new JavaDeveloper("Bob",Arrays.asList("maven","gradle","postgree") );

        Iterator iterator = developer.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

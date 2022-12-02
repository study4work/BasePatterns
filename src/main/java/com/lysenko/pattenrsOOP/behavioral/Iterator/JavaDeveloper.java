package com.lysenko.pattenrsOOP.behavioral.Iterator;

import java.util.List;

public class JavaDeveloper implements Collection{
    private String name;
    private List<String> skills;

    public JavaDeveloper(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new DeveloperIterator();
    }

     class DeveloperIterator implements Iterator{
         int index;
         @Override
         public boolean hasNext() {
             if (index<skills.size()) {
                 return true;
             }
             return false;
         }

         @Override
         public Object next() {
             return skills.get(index++);
         }
     }
}

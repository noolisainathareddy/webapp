package org.example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    public static void main(String args[]){
        ArrayList<Student> list =new ArrayList<>();
        list.add(new org.example.comparator.Student("sai", 26, 105));
        list.add(new org.example.comparator.Student("Hema", 25, 102));
        list.add(new org.example.comparator.Student("siav", 30, 103));
        list.add(new org.example.comparator.Student("Raja", 21, 104));
        list.add(new org.example.comparator.Student("ramu", 60, 101));

        for(org.example.comparator.Student s:list){
            System.out.println(s);
        }

        Collections.sort(list, new CompId());
        System.out.println("comparator after sorting-----");
        for(org.example.comparator.Student s:list){
            System.out.println(s);
        }
    }
}

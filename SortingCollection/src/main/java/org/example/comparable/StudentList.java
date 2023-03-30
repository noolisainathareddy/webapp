package org.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
/* to sort user defined objects we have to oprions
    1)Comparable
    2)Comparator

    compareble: to sort the object based on only one field.
 */
public class StudentList {
    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("sai", 26, 105));
        list.add(new Student("Hema", 25, 102));
        list.add(new Student("siav", 30, 103));
        list.add(new Student("Raja", 21, 104));
        list.add(new Student("ramu", 60, 101));

        for(Student s:list){
            System.out.println(s);
        }

        Collections.sort(list);
        System.out.println("after sorting-----");
        for(Student s:list){
            System.out.println(s);
        }
    }
}

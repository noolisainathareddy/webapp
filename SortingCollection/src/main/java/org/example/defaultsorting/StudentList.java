package org.example.defaultsorting;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();

        list.add(20);
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(30);

        System.out.println(list);
        Collections.sort(list);
        System.out.println("after sorting.....");
        System.out.println(list);
    }
}

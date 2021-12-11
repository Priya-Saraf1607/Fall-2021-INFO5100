package edu.northeastern.priya.Question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(5 ,"Bethany",  2.7, new Date(93,4,20)));
        list.add(new Student(3 ,"Whitney  ",3.9, new Date(69,07,18)));
        list.add(new Student(2 ,"Leighton",  3.0, new Date(95,07,03)));
        list.add(new Student(1 ,"Kimberly",   3.9, new Date(87,9,30)));
        list.add(new Student(4 ,"Nico",  3.2, new Date(98,02,23)));
        System.out.println("Sort by ascending order of 'name'");
        Collections.sort(list, new NameComparator());
        for(Student s : list)
            System.out.println(s);

        System.out.println("Sort by descending order of 'gpa'");
        Collections.sort(list, new gpaComparator());
        for(Student s : list)
            System.out.println(s);

        System.out.println("Sort by ascending order of 'dateOfBirth'");
        Collections.sort(list, new DateOfBirthComparator());
        for(Student s : list)
            System.out.println(s);
    }
}

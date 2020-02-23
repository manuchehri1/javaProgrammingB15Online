package day51.my_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {



        Person p1 = new Person("Arafat",34);


        Person p2 = new Person("Zhibekchach",18);

        Person p3 = new Person("Asena", 10);

        System.out.println(p1);
        System.out.println(p2);

        // compare p1 and p2 by age
        // if p1 has older age print 1
        // if they are same age print 0
        // if p2 is older age print -1


//        if (p1.age>p2.age){
//            System.out.println(1);
//        }else if (p1.age==p2.age){
//            System.out.println(0);
//        }else if (p1.age<p2.age){
//            System.out.println(-1);
//        }

        System.out.println(p1.compareTo(p2));

        System.out.println(p1.compareTo(new Person("hasan", 43)));


        List<Person> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(p1,p2,p3));
        lst.add( new Person("John Snow", 27));

        System.out.println("lst = " + lst);

        Collections.sort(lst);

        System.out.println("lst = " + lst);
        
        

    }




}

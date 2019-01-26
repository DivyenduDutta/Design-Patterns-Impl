package com.divyendu.designPatterns;

import com.divyendu.designPatterns.Singleton.Singleton;
import com.divyendu.designPatterns.models.Person;

public class App 
{
    public static void main( String[] args )
    {
        Singleton instance1 = Singleton.getSingleInstance(Person.class);
        Person p1 = (Person)instance1.getInnerInstance();
        p1.setId(1);
        p1.setName("Kevin");
        
        Singleton instance2 = Singleton.getSingleInstance(Person.class);
        Person p2 = (Person)instance2.getInnerInstance();
        p2.setId(2);
        p2.setName("Jumba");
        
        System.out.println("Using Singleton pattern to get instance of "+Person.class.getName());
        System.out.println("Instance1: "+instance1.getInnerInstance().toString());
        System.out.println("Instance2: "+instance2.getInnerInstance().toString());
    }
}

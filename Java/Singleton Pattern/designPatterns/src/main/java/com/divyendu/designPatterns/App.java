package com.divyendu.designPatterns;

import com.divyendu.designPatterns.Singleton.Singleton;
import com.divyendu.designPatterns.models.Car;
import com.divyendu.designPatterns.models.Person;

public class App 
{
    public static void main( String[] args )
    {
        Singleton instance1 = Singleton.getSingleInstance(Person.class, null);
        Person p1 = (Person)instance1.getInnerInstance();
        p1.setId(1);
        p1.setName("Kevin");
        
        Singleton instance2 = Singleton.getSingleInstance(Person.class, null);
        Person p2 = (Person)instance2.getInnerInstance();
        p2.setId(2);
        p2.setName("Jumba");
        
        System.out.println("Using Singleton pattern to get instance of "+Person.class.getName());
        System.out.println("Instance1: "+instance1.getInnerInstance().toString());
        System.out.println("Instance2: "+instance2.getInnerInstance().toString());
        
        Singleton.freeInstance(); //need to compulsorily call freeInstance() if we want to use another type
        
        //try out Singleton with a type which has a 2 argument constructor
        Object[] constructorArgs = {1,"Hyundai"};
        Singleton carInstance1 = Singleton.getSingleInstance(Car.class, constructorArgs);
        Car c1 = (Car)carInstance1.getInnerInstance();
        
        Object[] constructorArgs2 = {2,"Volvo"};
        Singleton carInstance2 = Singleton.getSingleInstance(Car.class, constructorArgs2);
        Car c2 = (Car)carInstance2.getInnerInstance();
        
        System.out.println("Using Singleton pattern to get instance of "+Car.class.getName());
        System.out.println("Instance1: "+carInstance1.getInnerInstance().toString());
        System.out.println("Instance2: "+carInstance2.getInnerInstance().toString());
        
    }
}

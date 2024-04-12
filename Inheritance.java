


package com.mycompany.inheritance;


public class Inheritance {

    public static void main(String[] args) {
        Derived dc = new Derived();
        dc.BaseClassMethod();       
        dc.derivedclass();
        
        System.out.println("singleInheritnce");
        Plot plot = new Plot();
        System.out.println(plot.getRectangleArea());
        
        Plot plot1 = new Plot(2);
        System.out.println(plot.getRectangleArea());
        
        
        System.out.println("Multilevel Inheritance");
        NewDerivedClass ndc = new NewDerivedClass();
        ndc.NewDerivedClassmethod();
        ndc.BaseClassMethod();
        
        
        System.out.println("Hierarchial Inheritance");
        NewDerivedClass ndc1 = new NewDerivedClass();
        ndc1.BaseClassMethod();
        ndc1.NewDerivedClassmethod();
        
        
        
    }

    }

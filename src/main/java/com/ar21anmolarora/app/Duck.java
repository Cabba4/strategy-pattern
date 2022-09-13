package com.ar21anmolarora.app;

public class Duck {

    public void quack(){
        System.out.println("Ducks Quack");
    }
    
    public void swim(){
        System.out.println("Ducks Swim");
    }

    public void display(){
        System.out.println("Show ducks");
    }

    // Since all ducks cant fly we create an attribute which is an interface (like an abstract class )
    public FlyBehaviour flyBehaviour;
    // Add actual action method:
    public void performFly(){
        flyBehaviour.fly();
    }

    public QuackBehaviour quackBehaviour;
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void fly(){
        System.out.println("Flying ducks");
    }
}

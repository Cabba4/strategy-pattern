package com.ar21anmolarora.app;

public abstract class Duck {


    // Since all ducks cant fly we create an attribute which is an interface (like an abstract class )
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public void quack(){
        System.out.println("Ducks Quack");
    }
    
    public void swim(){
        System.out.println("Ducks Swim");
    }

    public abstract void display();

    
    // Add actual action method:
    public void performFly(){
        flyBehaviour.fly();
    }


    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
    public void fly(){
        System.out.println("Flying ducks");
    }
}

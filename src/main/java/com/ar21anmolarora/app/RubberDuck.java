package com.ar21anmolarora.app;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display(){
        System.out.println("This is a Red Head Duck");
    }

    @Override
    public void quack(){
        System.out.println("RubberDuck Quack");
    }
}

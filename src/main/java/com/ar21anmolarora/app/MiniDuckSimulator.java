package com.ar21anmolarora.app;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new Mallard();
        mallard.performQuack();
        mallard.performQuack();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
    
}

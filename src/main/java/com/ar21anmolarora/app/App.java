package com.ar21anmolarora.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Ducks!" );

        Duck mallard = new Mallard();
        //mallard.display();
        Duck redHead = new RedHeadDuck();
        //redHead.display();
        Duck rubber = new RubberDuck();
        testDuck(redHead);
        testDuck(mallard);
        testDuck(rubber);
        System.out.println("This is Mallard info");
        interfaceTest(mallard);
        System.out.println("This is Rubber duck info");
        interfaceTest(rubber);

        // INTERFACE VS ABSTRACT CLASS!!!!
    }

    private static void interfaceTest(Duck duck){
        duck.performFly();
        duck.performQuack();
    }
    private static void testDuck (Duck duck){
         //duck.display();
         //duck.swim();
         //duck.quack();
         //duck.fly();
    }
}

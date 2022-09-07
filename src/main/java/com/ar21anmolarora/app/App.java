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
        mallard.display();
        Duck redHead = new RedHeadDuck();
        redHead.display();
    }
}

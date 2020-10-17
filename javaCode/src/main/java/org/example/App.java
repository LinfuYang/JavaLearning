package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i = 9;
        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(j + "*" + k +"="+ j * k + " ");
            }
            System.out.println();
        }
        System.out.println( "Hello World!" );
    }
}

/*
 Write a java program which generates a random number
such that 0 <= Random Number <= N-1 * where N is a given input
number.

 */
package acadglid;

//Problem 3
public class Session_3_Assignment_3 {
     public static void main(String args[])
    {
        /*This is the given input number N
         * This program generates a random number such that 0 <= Random Number <= N-1
         */
        int N = 100;
 
        //Generates a random number
        double randomNumber = Math.random();
        int randomInt = (int)(N * randomNumber);
 
        //Displays the random number
        System.out.println(randomInt);
 
    }
}

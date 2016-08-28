/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acadglid;

/**
 *
 * @author My
 */
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

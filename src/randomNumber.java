//mini project random number Guess Game????

import java.util.Scanner;
public class randomNumber {

    public static void main(String args[]) {
        int n;
        int k;
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Guess Our random  Number-- beetween 1 to 100?--:!!! OR PRESS -1 TO EXIT ");

            k = s.nextInt();
            n = (int)(Math.random() * 100);
            if (k == n){
                System.out.println("You guessed the number Right Congratulations");
                break;
            }

            else if(n==-1){
                break;
            }
            else
                System.out.println("Guess The number gain");

            System.out.println("Sorry the Number is "+n);
        }
    }

}
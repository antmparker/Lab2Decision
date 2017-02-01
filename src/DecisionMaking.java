/**
 * Created by anthonymparker on 1/31/17.
 */

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum;

        while (true) {
            System.out.print("Enter a whole number between 1 and 100: ");
            userNum = scan.nextInt();
            if ((userNum >= 1) && (userNum <= 100)) {
                if ((userNum >= 1) && (userNum <= 60) && (userNum % 2 != 0)) {
                    System.out.println("Odd.");
                } else if ((userNum >= 2) && (userNum < 25) && (userNum % 2 == 0)) {
                    System.out.println("Even and less than 25. ");
                } else if ((userNum >= 26) && (userNum <= 60) && (userNum % 2 == 0)) {
                    System.out.println("Even. ");
                } else if ((userNum > 60) && (userNum % 2 == 0)) {
                    System.out.println(userNum + " and Even. ");
                } else if ((userNum > 60) && (userNum % 2 != 0)) {
                    System.out.println(userNum + " and Odd. ");
                }
            }
        }


    }
}

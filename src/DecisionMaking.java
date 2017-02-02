/**
 * Created by anthonymparker on 1/31/17.
 */

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 1;
        String userName;


        System.out.print("What is your name?: ");
        userName = scan.next();

        while (userNum != 0) {


            System.out.print("Hello, " + userName + "! Enter a whole number between 1 and 100: ('0' to quit)");

            userNum = scan.nextInt();

            if ((userNum >= 1) && (userNum <= 100)) {
                if ((userNum >= 1) && (userNum <= 60) && (userNum % 2 != 0)) {
                    System.out.println("It's odd, " + userName);
                } else if ((userNum >= 2) && (userNum < 25) && (userNum % 2 == 0)) {
                    System.out.println("It's even and less than 25. " + userName);
                } else if ((userNum >= 26) && (userNum <= 60) && (userNum % 2 == 0)) {
                    System.out.println("It's even. " + userName);
                } else if ((userNum > 60) && (userNum % 2 == 0)) {
                    System.out.println(userNum + " and even, " + userName);
                } else if ((userNum > 60) && (userNum % 2 != 0)) {
                    System.out.println(userNum + " and odd, " + userName);

                }
            }

        }


    }
}



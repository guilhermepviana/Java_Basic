package studyingjava;

import java.util.Scanner;

public class leitura_dados {
    public static void main(String[] args){

        Scanner scan01 = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scan01.nextLine();
        System.out.println("Your full name is " + fullName);

        System.out.print("Enter your first name: ");
        String firstName = scan01.next();
        System.out.println("Your first name is " + firstName);

        System.out.print("Enter your age: ");
        String age = scan01.next();

    }
}

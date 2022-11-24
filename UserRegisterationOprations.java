package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegisterationOprations {
	public static final Scanner sc = new Scanner(System.in);
	 //UC1:-As a User need to enter a valid First Name
    //First name starts with Cap and has minimum 3 characters
    public void validFirstName() {
        System.out.print("Enter First Name: ");
        String fname = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        boolean checkValid = fname.matches(regex);
        if (checkValid) {
            System.out.println("Your First name is Valid.");
        } else {
            System.out.println("Your First name is Invalid.");
        }
    }
    //UC2:-As a User need to enter a valid Last Name
    //Last name starts with Cap and has minimum 3 characters
    public void validLastName() {
        System.out.print("Enter Last Name: ");
        String lname = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        boolean checkValid = lname.matches(regex);
        if (checkValid) {
            System.out.println("Your Last name is Valid.");
        } else {
            System.out.println("Your Last name is Invalid.");
        }
    }
    //UC3:-As a User need to enter a valid emailId
    //enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
    public void validEmail_Id() {
        System.out.print("Enter Email_ID: ");
        String emailId = sc.next();
        String regex = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
        boolean checkValid = emailId.matches(regex);
        if (checkValid) {
            System.out.println("Your Email_ID is Valid.");
        } else {
            System.out.println("Your Email_ID is Invalid.");
        }
    }
    //UC4:-As a User need to follow pre-defined Mobile Format
    //Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10digit number
    public void validMobileFormat() {
        System.out.print("Enter Mobile Number: ");
        String mobNo = sc.nextLine();
        String regex = "(91|0)?\\s?[6-9][0-9]{9}$";
        boolean checkValid = mobNo.matches(regex);
        if (checkValid) {
            System.out.println("Your Mobile Number is Valid.");
        } else {
            System.out.println("Your Mobile Number is Invalid.");
        }
    }

    //UC5= As a User need to follow pre -defined Password rules.
    //Rule1= min 8 Characters
    //
    public void validPassword() {
        System.out.print("Enter the Password Having Minimum 8 Character: ");
        String pass = sc.nextLine();
        String regex = "^[a-zA-Z]{8,}$";
        boolean checkValid = pass.matches(regex);

        if (checkValid) {
            System.out.println("Entered Password is Valid.");
        } else {
            System.out.println("Entered Password is Invalid.");
        }
    }
}


	





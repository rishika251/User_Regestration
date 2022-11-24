package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegisterationOprations {
	 public static final Scanner sc = new Scanner(System.in);

	    //UC1:-As a User need to enter a valid First Name
	    //First name starts with Cap and has minimum 3 characters
	    public void validFirstName() {
	        System.out.print("Enter First Name: ");
	        String name = sc.next();
	        String regex = "^[A-Z]{1}[a-z]{2,}$";
	        boolean checkValid = name.matches(regex);

	        if (checkValid) {
	            System.out.println("First name is Valid.");
	        } else {
	            System.out.println("First name is Invalid.");
	        } 
	    }


	
//UC2:-As a User need to enter a valid Last Name
//Last name starts with Cap and has minimum 3 characters
public void validLastName() {
    System.out.print("Enter Last Name: ");
    String name = sc.next();
    String regex = "^[A-Z]{1}[a-z]{2,}$";
    boolean checkValid = name.matches(regex);

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


}






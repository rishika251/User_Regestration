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
}
	    


	





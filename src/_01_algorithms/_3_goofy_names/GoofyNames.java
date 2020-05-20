package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String N = JOptionPane.showInputDialog(null, "What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
N=N.toUpperCase();
JOptionPane.showMessageDialog(null, N);
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.

for (int i = 0; i < N.length(); i++) {
	

			// 4. Create a String variable to store the next character of the name
		   //    using .substring(start, end)
		  //    HINT: replace 'start' and 'end' to get String with character at i 
		String G=N.substring(i,i+1);
		
		// 5. Use MODULO to set this variable to upper case for EVEN characters
       //    and lower case for ODD characters.
		if(i%2==0) {
		G=G.toUpperCase();
		}else {
			
		G=G.toLowerCase();
		}
			// 6. ADD this String  (containing 1 char) to the goofyName String
goofyName=goofyName+G;
	}	
		// 7. Use pop-up to show user their Goofy name
JOptionPane.showMessageDialog(null, goofyName);
	}
}


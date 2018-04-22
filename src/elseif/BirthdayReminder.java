
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String sistersBirthday = "July 30";
		String dadsBirthday = "March 18";
		String momsBirthday = "November 4";

		// 2. Find out which birthday the user wants and and store their response in a variable
String question = JOptionPane.showInputDialog("Who's birthday do you want to know");
		// 3. Print out what the user typed
		if(question.equals("mom's")) { 
			System.out.println(momsBirthday);}
		// 4. if user asked for "mom"
		
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(question.equals("dad's")) { 
			System.out.println(dadsBirthday);}
		// 6. if user asked for your name
		else if(question.equals("sister's")) { 
			System.out.println(sistersBirthday);}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
	} 
	
}

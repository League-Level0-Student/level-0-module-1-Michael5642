package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String student1="Maria is a cool name";
String student2="Michael is a weird name";
String student3="Dylan is kind of a jerk name";

		// 2. Ask the user to enter a name. Store their answer in a variable.
String name=JOptionPane.showInputDialog("what is your name?");
if(name.equalsIgnoreCase("Maria")) {
JOptionPane.showMessageDialog(null, student1);
}
else if(name.equalsIgnoreCase("Michael")) {
JOptionPane.showMessageDialog(null, student2);	
}
else if(name.equalsIgnoreCase("Dylan")) {
JOptionPane.showMessageDialog(null, student3);	
}
else {
JOptionPane.showMessageDialog(null, "go away...");	
}
		}
	}
// 3. In a pop-up, tell the user what is remarkable about that person.


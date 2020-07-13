package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
//riddle#1
String riddle1  = JOptionPane.showInputDialog("what is the square root of 81?");
if(riddle1.equalsIgnoreCase("9")) {
	score = score+1;
	JOptionPane.showMessageDialog(null, "correct");
}
else {
	JOptionPane.showMessageDialog(null, "incorrect");
	
}		
JOptionPane.showMessageDialog(null, score);
//riddle#2
String riddle2  = JOptionPane.showInputDialog("who were the first people to discover America?");
if(riddle2.equalsIgnoreCase("the vikings")) {
	score = score+1;
	JOptionPane.showMessageDialog(null, "correct");
}
else {
	JOptionPane.showMessageDialog(null, "incorrect");
	
}		
JOptionPane.showMessageDialog(null, score);
//riddle#3
String riddle3  = JOptionPane.showInputDialog("what is the chemical composition of bleach?");
if(riddle3.contentEquals("NaCIO")) {
	score = score+1;
	JOptionPane.showMessageDialog(null, "correct");
}
else {
	JOptionPane.showMessageDialog(null, "incorrect");
	
}		
JOptionPane.showMessageDialog(null, score);
// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
if(score>1) {
	JOptionPane.showMessageDialog(null, "WINNER");
}
else {
	JOptionPane.showMessageDialog(null, "loser");
}
	}
}


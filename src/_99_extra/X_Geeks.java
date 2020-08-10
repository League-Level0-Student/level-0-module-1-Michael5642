package _99_extra;
import javax.swing.JOptionPane;
public class X_Geeks {
	public static void main(String[] args) {
	String student1 = "you're superpower is flight";
	String student2 = "you're superpower is superstrength";
	String student3 = "you're superpower is heat vision";
	String student4 = "you're superpower is super intelligence";
	String input = JOptionPane.showInputDialog("what is your name?");
	if(input.equalsIgnoreCase("bentlee")){
		JOptionPane.showMessageDialog(null, student1);
	}
	else if(input.equalsIgnoreCase("atlas")) {
		JOptionPane.showMessageDialog(null, student2);
	}
	else if(input.equalsIgnoreCase("gryffin")) {
		JOptionPane.showMessageDialog(null, student3);
	}
	else if(input.equalsIgnoreCase("heston")) {
		JOptionPane.showMessageDialog(null, student4);
	}
	else{
		JOptionPane.showMessageDialog(null, "shut up boomer");
	}
	}
}

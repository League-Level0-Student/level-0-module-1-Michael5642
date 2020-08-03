package _05_for_loops._1_my_ages;

import javax.swing.JOptionPane;

public class my_age {
	
	public static void main(String[] args) {
		
		int age = 0;
for(int i = 0; i < 15; i = i+1) {
	age = age+1;
	System.out.println(age);
}
JOptionPane.showMessageDialog(null, "you are " + age);	
	
	
	}

}
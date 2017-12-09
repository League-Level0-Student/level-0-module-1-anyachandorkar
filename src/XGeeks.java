//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String sarah = "invisibility";
String john = "flying";
String kevin = "dissapearing";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Enter a name");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equals("sarah")|| name.equals("Sarah")) {
	JOptionPane.showMessageDialog(null, "Sarah's superpower is " + sarah);
}
if (name.equals("john")|| name.equals("John")) {
	JOptionPane.showMessageDialog(null, "John's superpower is " + john);
}
if (name.equals("kevin")|| name.equals("Kevin")) {
	JOptionPane.showMessageDialog(null, "Kevin's superpower is " + kevin);
}
else {
	JOptionPane.showMessageDialog(null, name + " has no superpowers");
}
}}


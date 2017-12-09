import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("What type of key can open any door?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("a monkey")|| riddle.equals("monkey")) {
	score = score +1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong, the answer is a monkey!");
}
		// 6. Add some more riddles
String riddle2 = JOptionPane.showInputDialog("What has hands but cannot clap?");
if (riddle2.equals("a clock")) {
	score = score +1;
}
else if (riddle2.equals("clock")) {
	score = score +1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong, the answer is a clock!");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}


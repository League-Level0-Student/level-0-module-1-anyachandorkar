import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birth = JOptionPane.showInputDialog("Enter your birthday");
	if(birth.equals("December 2")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Merry UnBirthday!");}
	}
}


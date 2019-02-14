import javax.swing.*;

public class Exercise1 extends JFrame{
	public Exercise1(){  
 		super ("Tutorial 6: Question 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,100);

		JPanel panel= new JPanel();
		JLabel lblJava= new JLabel ("Welcome to Java Swing");
		
		add(panel);
		panel.add(lblJava);
		
		

		setVisible (true);
	}


	public static void main (String[]args){
 		Exercise1 sc=new Exercise1();
	}
}

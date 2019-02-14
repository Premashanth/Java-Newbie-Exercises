import javax.swing.*;
public class Exercise5 extends JFrame{
	public Exercise5(){
		super("Tutorial 6: Question 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,100);

		JPanel panel=new JPanel();
		JLabel lblSport=new JLabel("Select the Sports you like:");
		JCheckBox chkFootball=new JCheckBox ("Football");
		JCheckBox chkCricket=new JCheckBox ("Cricket");
		JCheckBox chkSwimming=new JCheckBox ("Swimming");
		JCheckBox chkBasketball=new JCheckBox ("Basketball");	
	
		add(panel);
		panel.add(lblSport);
		panel.add(chkFootball);
		panel.add(chkCricket);
		panel.add(chkSwimming);
		panel.add(chkBasketball);
		
		setVisible(true);
	}
	public static void main (String []args){
		Exercise5 sc=new Exercise5();

	}
}
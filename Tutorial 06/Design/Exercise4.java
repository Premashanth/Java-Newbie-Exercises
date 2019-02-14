import javax.swing.*;
public class Exercise4 extends JFrame{
	public Exercise4(){
		super("Tutorial 6: Question 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1500,250);
	
		JPanel panel=new JPanel();
		ImageIcon Canada = new ImageIcon("canada.jpg");
    		JButton btnCanada= new JButton(Canada);

		ImageIcon USA = new ImageIcon("usa.jpg");
    		JButton btnUsa= new JButton(USA);

		ImageIcon France = new ImageIcon("france.jpg");
    		JButton btnFrance= new JButton(France);

		ImageIcon India = new ImageIcon("india.jpg");
    		JButton btnIndia= new JButton(India);

		add(panel);
		panel.add(btnCanada);
		panel.add(btnUsa);
    		panel.add(btnFrance);
		panel.add(btnIndia);

		setVisible(true);
	}	
	
	public static void main(String []args){
		Exercise4 sc=new Exercise4();
	}
}

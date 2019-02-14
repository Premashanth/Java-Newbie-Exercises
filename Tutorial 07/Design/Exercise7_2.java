import javax.swing.*;
import java.awt.*;
public class Exercise7_2 extends JFrame{
	public Exercise7_2(){
		super ("Login in");
		setSize (350, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLayout(new BorderLayout());	

		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		
			ImageIcon key=new ImageIcon("key.jpg");
			JLabel lblImage=new JLabel(key);
			JLabel lblName=new JLabel("Username:");
			JTextField txtName=new JTextField ("kamal.dias",10);
	
			JLabel lblPassowrd=new JLabel("Password:");
			JPasswordField txtPassword=new JPasswordField (10);
	
			JButton btnOk=new JButton("OK");
	
			JButton btnCancel=new JButton ("CANCEL");

			
		add(lblImage,BorderLayout.WEST);
		add(panel1,BorderLayout.CENTER);
			panel1.add (lblName);
			panel1.add (txtName);
			panel1.add (lblPassowrd);
			panel1.add (txtPassword);
	
	
		add(panel2, BorderLayout.SOUTH);
			panel2.add (btnOk);
			panel2.add (btnCancel);	
	
		setVisible(true);
	}

	public static void main (String []args){
		Exercise7_2 sc=new Exercise7_2();
	}
}
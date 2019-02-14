import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise7_2 extends JFrame{
	JTextField txtName,txtPassword;
	JButton btnOk;
	JLabel lblAns;

	public Exercise7_2(){
		super ("Login in");
		setSize (330, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLayout(new BorderLayout());	

		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		
			ImageIcon key=new ImageIcon("key.jpg");
			JLabel lblImage=new JLabel(key);
			
			JLabel lblName=new JLabel("Username:");
			txtName=new JTextField ("kamal.dias",10);
	
			JLabel lblPassowrd=new JLabel("Password:");
			txtPassword=new JPasswordField (10);
			
			lblAns=new JLabel();
	
			btnOk=new JButton("OK");
			JButton btnCancel=new JButton ("CANCEL");
		   
		
			AL a = new AL();
			btnOk.addActionListener(a);
			//lblAns.addActionListener(this);
			
		add(lblImage,BorderLayout.WEST);
		add(panel1,BorderLayout.CENTER);
			panel1.add (lblName);
			panel1.add (txtName);
			panel1.add (lblPassowrd);
			panel1.add (txtPassword);
	panel1.add (lblAns);
	
		add(panel2, BorderLayout.SOUTH);
			panel2.add (btnOk);
			panel2.add (btnCancel);	
			
	
		setVisible(true);
	}

	public static void main (String []args){
		Exercise7_2 sc=new Exercise7_2();
	}
		class AL implements ActionListener {
		      public void actionPerformed(ActionEvent arg0) {
		    	  String user = txtName.getText();
		    	  String password =txtPassword.getText();
		    	  
		    	  if (user.equals("admin") && password.equals("admin123"))
		            	lblAns.setText("Successful Login");
		    	  else 
		    	  		lblAns.setText("Login doesnt match");
		      }
			
		
	}
}
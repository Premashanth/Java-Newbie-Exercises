import javax.swing.*;
import java.awt.*;
public class \ extends JFrame{
	public Exercise7_3(){
		super ("Loan Calculator");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(7,2));
		
		
		JLabel lblInterest=new JLabel();
		JTextField txtInterest=new JTextField();
		
		JLabel lblYear=new JLabel();
		JTextField txtYear=new JTextField();
		
		JLabel lblLoan=new JLabel();
		JTextField txtLoan=new JTextField();
		
		JLabel lblMonthly=new JLabel();
		JTextField txtMonthly=new JTextField();
		
		JLabel lblTotal=new JLabel();
		JTextField txtTotal=new JTextField();
		
		JButton btnOk=new JButton("OK");

		
		

		add(panel);
		panel.add(lblInterest);
		panel.add(txtInterest);
		panel.add(lblYear);
		panel.add(txtYear);
		panel.add(lblLoan);
		panel.add(txtLoan);
		panel.add(lblMonthly);
		panel.add(txtMonthly);
		panel.add(lblTotal);
		panel.add(txtTotal);
		panel.add(new JLabel());
		panel.add(btnOk);

		setVisible(true);
	}

	public static void main (String []args){
		Exercise7_3 sc=new Exercise7_3();
	}
}
import javax.swing.*;
	public class Exercise2 extends JFrame{
	public Exercise2(){
		super ("Tutorial 6:Question 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,150);

		JPanel panel=new JPanel();
		JLabel lblID=new JLabel ("Student ID:");	
		JTextField txtID=new JTextField("Enter Student ID",15);
		
		JLabel lblCourse=new JLabel ("Course:");
		JTextField txtCourse=new JTextField(15);
		
		JLabel lblCredit=new JLabel ("Credits:");
		JTextField txtCredit=new JTextField (15);
		
		add(panel);
		panel.add(lblID);
		panel.add(txtID);
		panel.add(lblCourse);
		panel.add(txtCourse);
		panel.add(lblCredit);
		panel.add(txtCredit);

		setVisible(true);	
}	
	public static void main(String []args){
		Exercise2 sc=new Exercise2();
}
}
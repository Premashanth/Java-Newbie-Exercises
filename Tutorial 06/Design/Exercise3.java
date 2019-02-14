import javax.swing.*;
public class Exercise3 extends JFrame{
	
	public Exercise3(){
		super("Tutorial 6: Question 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);

		JPanel panel=new JPanel();
		JButton btnLeft=new JButton("<<");		
		JButton btnOk=new JButton("OK");
		JButton btnRight=new JButton (">>");
		
		add(panel);
		panel.add(btnLeft);
		panel.add(btnOk);
		panel.add(btnRight);
		
		setVisible(true);
	}	

	public static void main(String []args){
		Exercise3 sc=new Exercise3();
	}
}
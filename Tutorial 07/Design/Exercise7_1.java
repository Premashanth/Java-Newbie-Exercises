import javax.swing.*;
import java.awt.*;
public class Exercise7_1 extends JFrame{
	public Exercise7_1(){
		super ("Calculator");
		setSize (250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new GridLayout(4, 3, 4, 4));

		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.CENTER);

		JTextField txtDisplay= new JTextField("0",15);
		panel1.add(txtDisplay);

		JButton btnOne=new JButton("1");
		JButton btnTwo=new JButton("2");
		JButton btnThree=new JButton("3");
		JButton btnFour=new JButton("4");
		JButton btnFive=new JButton("5");
		JButton btnSix=new JButton("6");
		JButton btnSeven=new JButton("7");
		JButton btnEight=new JButton("8");
		JButton btnNine=new JButton("9");
		JButton btnStar=new JButton("*");
		JButton btnZero=new JButton("0");
		JButton btnHash=new JButton("#");

		panel2.add(btnOne);
		panel2.add(btnTwo);
		panel2.add(btnThree);
		panel2.add(btnFour);
		panel2.add(btnFive);
		panel2.add(btnSix);
		panel2.add(btnSeven);
		panel2.add(btnEight);
		panel2.add(btnNine);
		panel2.add(btnStar);
		panel2.add(btnZero);
		panel2.add(btnHash);
		
		setVisible(true);
}

public static void main (String []args){
		Exercise7_1 sc=new Exercise7_1();
	}
}
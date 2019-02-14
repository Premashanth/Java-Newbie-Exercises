import java.awt.*;
import javax.swing.*;


public class Exercise7_4 extends JFrame {
    public Exercise7_4(){
        
        super("Demo:Color,Font Classes");        
        setSize(550,100);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        JPanel panel = new JPanel();        
        JButton btnOne = new JButton("One");
	btnOne.setBackground(Color.YELLOW);
        
	JButton btnTwo = new JButton("Two");
	btnTwo.setBackground(Color.GRAY);
        btnTwo.setForeground(Color.WHITE);
	
	JButton btnThree = new JButton("Three");
	
        
	JButton btnFour = new JButton("Four");
	btnFour.setFont(new Font("Monospaced",Font.PLAIN,12));
        
	JButton btnFive = new JButton("Five");
	btnFive.setBackground(Color.RED);
        
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(panel);
        panel.add(btnOne);
        panel.add(btnTwo);
        panel.add(btnThree);
        panel.add(btnFour);
        panel.add(btnFive);                
        setVisible(true);
    }
            
    public static void main(String[] args) {
     Exercise7_4 sc = new Exercise7_4();
        
        
    }
}
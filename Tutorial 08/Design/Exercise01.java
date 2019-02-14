import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise01 extends JFrame{
    JTextField txtDisplay1,txtDisplay2;
    JLabel lblAns;
    JPanel panel1,panel2;
    JRadioButton btnAdd,btnSub,btnMul,btnDiv;
    JButton btnAns; 


    public Exercise01(){
        super ("Calculator");
        setSize (250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        ButtonGroup bg=new ButtonGroup();
        
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(4, 3, 4, 4));

        add(panel1,BorderLayout.NORTH);
        add(panel2,BorderLayout.CENTER);
       
        
        txtDisplay1= new JTextField("0",15);
        txtDisplay2= new JTextField("0",15);
        lblAns=new JLabel();

        
        btnAdd=new JRadioButton("+");
        btnSub=new JRadioButton("-");
        btnMul=new JRadioButton("*");
        btnDiv=new JRadioButton("/");
   
        btnAns = new JButton("=");
       
        AL a1 = new AL();



        bg.add(btnSub);
        bg.add(btnAdd);
        bg.add(btnMul);
        bg.add(btnDiv);
        
        
        panel1.add(txtDisplay1);
        panel1.add(txtDisplay2);
        panel1.add(lblAns);

        panel2.add(btnAdd);
        panel2.add(btnSub);
        panel2.add(btnMul);
        panel2.add(btnDiv);
        panel2.add(btnAns);
   
       
        
        setVisible(true);
    }

    public static void main (String []args){
        Exercise01 sc=new Exercise01();
    }


    class AL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            int n1 = Integer.parseInt(txtDisplay1.getText());
            int n2 = Integer.parseInt(txtDisplay2.getText());
            
            if (btnAdd.isSelected())
            	lblAns.setText(Integer.toString(n1+n2));
            if (btnSub.isSelected())
            	lblAns.setText(Integer.toString(n1-n2));
            if (btnMul.isSelected())
            	lblAns.setText(Integer.toString(n1*n2));
            if (btnDiv.isSelected())
            	lblAns.setText(Integer.toString(n1/n2));
        }

    }
}
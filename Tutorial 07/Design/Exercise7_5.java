import java.awt.*;
import javax.swing.*;


public class Exercise7_5 extends JFrame {
    public Exercise7_5(){
        
        super("Number Grid");        
        setSize(500,500);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JPanel panel=new JPanel();
	panel.setLayout(new GridLayout(7, 7));

	JButton lblone=new JButton("#1");
	lblone.setBackground(Color.WHITE);	
	
	JButton lbltwo=new JButton("#2");
	lbltwo.setBackground(Color.BLACK);
	lbltwo.setForeground(Color.WHITE);
	
	JButton lblthree=new JButton("#3");
	lblthree.setBackground(Color.WHITE);	
	
	JButton lblfour=new JButton("#4");
	lblfour.setBackground(Color.BLACK);
	lblfour.setForeground(Color.WHITE);
	
	 JButton lblfive=new JButton("#5");
	lblfive.setBackground(Color.WHITE);	
	
	JButton lblsix=new JButton("#6");
	lblsix.setBackground(Color.BLACK);
	lblsix.setForeground(Color.WHITE);
	
	 JButton lblseven=new JButton("#7");
	lblseven.setBackground(Color.WHITE);	
	
	JButton lbleight=new JButton("#8");	
	lbleight.setBackground(Color.BLACK);
	lbleight.setForeground(Color.WHITE);
	
	JButton lblnine=new JButton("#9");
	lblnine.setBackground(Color.WHITE);	
	
	JButton lblten=new JButton("#10");
	lblten.setBackground(Color.BLACK);
	lblten.setForeground(Color.WHITE);
	
	JButton lbleleven=new JButton("#11");
	lbleleven.setBackground(Color.WHITE);	
	
	JButton lbltwelve=new JButton("#12");
	lbltwelve.setBackground(Color.BLACK);
	lbltwelve.setForeground(Color.WHITE);
	
	JButton lblthir=new JButton("#13");	
	lblthir.setBackground(Color.WHITE);	
	
	JButton lblfourteen=new JButton("#14");
	lblfourteen.setBackground(Color.BLACK);
	lblfourteen.setForeground(Color.WHITE);
	
	JButton lblfifteen=new JButton("#15");
	lblfifteen.setBackground(Color.WHITE);	
	
	JButton lblsixteen=new JButton("#16");
	lblsixteen.setBackground(Color.BLACK);
	lblsixteen.setForeground(Color.WHITE);
	
	JButton lblseventeen=new JButton("#17");
	lblseventeen.setBackground(Color.WHITE);	
	
	JButton lbleighteen=new JButton("#18");
	lbleighteen.setBackground(Color.BLACK);
	lbleighteen.setForeground(Color.WHITE);
	
	JButton lblnineteen=new JButton("#19");
	lblnineteen.setBackground(Color.WHITE);	
	
	JButton lbltwenty=new JButton("#20");
	lbltwenty.setBackground(Color.BLACK);
	lbltwenty.setForeground(Color.WHITE);
	
	JButton lbltwentyone=new JButton("#21");
	lbltwentyone.setBackground(Color.WHITE);	
	
	JButton lbl22=new JButton("#22");
	lbl22.setBackground(Color.BLACK);
	lbl22.setForeground(Color.WHITE);
	
	JButton lbl23=new JButton("#23");
	lbl23.setBackground(Color.WHITE);
	
	JButton lbl24=new JButton("#24");
	lbl24.setBackground(Color.BLACK);
	lbl24.setForeground(Color.WHITE);
	
	JButton lbl25=new JButton("#25");
	lbl25.setBackground(Color.WHITE);
	
	JButton lbl26=new JButton("#26");
	lbl26.setBackground(Color.BLACK);
	lbl26.setForeground(Color.WHITE);
	
	JButton lbl27=new JButton("#27");
	lbl27.setBackground(Color.WHITE);
	
	JButton lbl28=new JButton("#28");
	lbl28.setBackground(Color.BLACK);
	lbl28.setForeground(Color.WHITE);
	
	JButton lbl29=new JButton("#29");
	lbl29.setBackground(Color.WHITE);
	
	JButton lbl30=new JButton("#30");
	lbl30.setBackground(Color.BLACK);
	lbl30.setForeground(Color.WHITE);
	
	JButton lbl31=new JButton("#31");
	lbl31.setBackground(Color.WHITE);
	
	JButton lbl32=new JButton("#32");
	lbl32.setBackground(Color.BLACK);
	lbl32.setForeground(Color.WHITE);
	
	JButton lbl33=new JButton("#33");
	lbl33.setBackground(Color.WHITE);
	
	JButton lbl34=new JButton("#34");
	lbl34.setBackground(Color.BLACK);
	lbl34.setForeground(Color.WHITE);
	
	JButton lbl35=new JButton("#35");
	lbl35.setBackground(Color.WHITE);
	
	JButton lbl36=new JButton("#36");
	lbl36.setBackground(Color.BLACK);
	lbl36.setForeground(Color.WHITE);
	
	JButton lbl37=new JButton("#37");
	lbl37.setBackground(Color.WHITE);
	
	JButton lbl38=new JButton("#38");
	lbl38.setBackground(Color.BLACK);
	lbl38.setForeground(Color.WHITE);
	
	JButton lbl39=new JButton("#39");
	lbl39.setBackground(Color.WHITE);
	
	JButton lbl40=new JButton("#40");
	lbl40.setBackground(Color.BLACK);
	lbl40.setForeground(Color.WHITE);
	
	JButton lbl41=new JButton("#41");
	lbl41.setBackground(Color.WHITE);
	
	JButton lbl42=new JButton("#42");
	lbl42.setBackground(Color.BLACK);
	lbl42.setForeground(Color.WHITE);
	
	JButton lbl43=new JButton("#43");
	lbl43.setBackground(Color.WHITE);
	
	JButton lbl44=new JButton("#44");
	lbl44.setBackground(Color.BLACK);
	lbl44.setForeground(Color.WHITE);
	
	JButton lbl45=new JButton("#45");
	lbl45.setBackground(Color.WHITE);
	
	JButton lbl46=new JButton("#46");
	lbl46.setBackground(Color.BLACK);
	lbl46.setForeground(Color.WHITE);
	
	JButton lbl47=new JButton("#47");
	lbl47.setBackground(Color.WHITE);
	
	JButton lbl48=new JButton("#48");
	lbl48.setBackground(Color.BLACK);
	lbl48.setForeground(Color.WHITE);
	
	JButton lbl49=new JButton("#49");
	lbl49.setBackground(Color.WHITE);
	
	
	
	add(panel);
	panel.add(lblone);
	panel.add(lbltwo);
panel.add(lblthree);
panel.add(lblfour);
panel.add(lblfive);
panel.add(lblsix);
panel.add(lblseven);
	
panel.add(lbleight);
panel.add(lblnine);
panel.add(lblten);
panel.add(lbleleven);
panel.add(lbltwelve);
panel.add(lblthir);
panel.add(lblfourteen);

panel.add(lblfifteen);
panel.add(lblsixteen);
panel.add(lblseventeen);
panel.add(lbleighteen);
panel.add(lblnineteen);
panel.add(lbltwenty);
panel.add(lbltwentyone);

panel.add(lbl22);
panel.add(lbl23);
panel.add(lbl24);
panel.add(lbl25);
panel.add(lbl26);
panel.add(lbl27);
panel.add(lbl28);

panel.add(lbl29);
panel.add(lbl30);
panel.add(lbl31);
panel.add(lbl32);
panel.add(lbl33);
panel.add(lbl34);
panel.add(lbl35);

panel.add(lbl36);
panel.add(lbl37);
panel.add(lbl38);
panel.add(lbl39);
panel.add(lbl40);
panel.add(lbl41);
panel.add(lbl42);

panel.add(lbl43);
panel.add(lbl44);
panel.add(lbl45);
panel.add(lbl46);
panel.add(lbl47);
panel.add(lbl48);
panel.add(lbl49);


	setVisible(true);

}

	public static void main (String []args){
		Exercise7_5 sc=new Exercise7_5();
}
}
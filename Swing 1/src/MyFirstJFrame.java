import javax.swing.*;
import java.awt.*;


public class MyFirstJFrame extends JFrame{
	JLabel _label;
	 
	 public MyFirstJFrame (String strTitel){
		 super(strTitel);
		 
		 _label=new JLabel("Say hello!");
		 add (_label, java.awt.BorderLayout.NORTH);
		 add  (new JButton("Hier druecken"), java.awt.BorderLayout.CENTER);
		 
		 setSize(350,100);
		 this.setVisible(true);
	 }

	public static void main(String [] args){
	    new MyFirstJFrame("Meine Erste Anwendung mit Swing");
	}
}

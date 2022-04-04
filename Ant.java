import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

class Addsub extends JFrame implements ActionListener
{
	JTextField t1, t2;
	JButton b1, b2;
	JLabel l;
	public Addsub(){

		t1 = new JTextField(15);
		t2 = new JTextField(15);
		b1 = new JButton("add");
		b2 = new JButton("sub");
		l = new JLabel("result");
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(l);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionListener ae){
		int num1 =Integer.parseInt( t1.getText());
		int num2 = Integer.parseInt( t2.getText());;
		int value = num1 + num2;
		
		l.setText(value + "");
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class Ant {
public static void main(String[] args){
		
		Addsub ad = new Addsub();
}
}

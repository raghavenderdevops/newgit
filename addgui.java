import java.awt.Component;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

class addition extends JFrame implements ActionListener
{
	JTextField t1, t2;
	JButton b;
	JLabel l;
	
	public addition(){
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b = new JButton("ok");
		l = new JLabel("Result");
		
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
	}
	public void actionPerformed(ActionEvent e){
		
		int num1 =Integer.parseInt( t1.getText());
		int num2 = Integer.parseInt( t2.getText());;
		int value = num1 + num2;
		
		l.setText(value + "");
	}
}

public class addgui {
	
	public static void main(String[] args){
		
		addition ad = new addition();
	}

}

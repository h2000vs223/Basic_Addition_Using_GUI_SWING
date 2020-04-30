///////////////////////////////////////////////////////////////
//  Title:[ PROGRAM TO 	GET ADDITION OF TWO NUMBERS          //
//		  USING SWING FOR Graphical User Interface ] //
//	author: h2000vs223 (harshvs.official223@gmail.com)   //
//	Time_stamp: 30 April 2020 14:04:08		     //
///////////////////////////////////////////////////////////////
package SwingD;//Note: SwingD this is the package name ,it may vary:)
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Addgui {	//Name of Main class here is Addgui:)
	public static void main(String[] args)
	{
		Addition obj=new Addition();
	}
}
class Addition extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JButton b;
	JLabel l,l0,l1,l2;
	public Addition()
	{
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b=new JButton("OK");
		l=new JLabel("Result");
		l1=new JLabel("Enter First Number");
		l2=new JLabel("Enter Second Number");
		add(l1); add(t1); add(l2); add(t2); add(b); add(l);
		b.addActionListener(this);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try
		{
			int num1=Integer.parseInt(t1.getText())	, num2=Integer.parseInt(t2.getText());
			int value=num1 + num2;
			l.setText( "Addition= " + value );
		}
		catch(NumberFormatException e) { 
			System.out.println("You entered either long number or invalid number\n\t\tPlease re-enter a valid Number");
			}
	}
}
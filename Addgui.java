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
import java.util.Scanner;
public class Addgui {	//Name of Main class here is Addgui:)
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("WELCOME TO MY CALCULATOR APPLICATION");
		System.out.print("Press a for addition\n\ts for subtraction\n\t\tm for multiplication\n\t\t\td for division: ");
		String re=in.next().toLowerCase();
		if(re.equals("a"))
		{
			Calculator.operation="+";
			new Calculator();
		}
		else if(re.equals("s")) 
			{
			Calculator.operation="-";
			new Calculator();
			}
		else if(re.equals("m")) 
			{
			Calculator.operation="*";
			new Calculator();
			}
		else if(re.equals("d"))
		{
			Calculator.operation="/";
			new Calculator();
			}
		else System.out.println("Invalid Input entered:(");
		in.close();
	}
}
class Calculator extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JButton b;
	JLabel l,l0,l1,l2;
	static String operation="";
	public Calculator()
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
			int num1=Integer.parseInt(t1.getText())	, num2=Integer.parseInt(t2.getText()) ;
			if( operation.equals("+")) { operation="Addition= "; l.setText( operation + ( num1 + num2 ) ); }
			else if( operation.equals("-")) { operation="Subtraction= "; l.setText( operation + ( num1 - num2 ) ); }
			else if( operation.equals("*")) { operation="Multiplication= "; l.setText( operation + ( num1 * num2 ) ); }
			else if( operation.equals("/")) { operation="Division= "; l.setText( operation + ( (float)num1 / num2 ) ); }
		}
		catch(NumberFormatException e) { 
			System.out.println("You entered either long number or invalid number\n\t\tPlease re-enter a valid Number");
			}
	}
}

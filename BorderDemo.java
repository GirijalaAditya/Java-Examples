import javax.swing.*;
import java.awt.*;
public class BorderDemo extends JFrame
{
	public BorderDemo()
	{
		Container c=getContentPane();
		BorderLayout bl=new BorderLayout();
		c.setLayout(bl);
		JButton b1=new JButton("North");
		JButton b2=new JButton("South");
		JButton b3=new JButton("East");
		JButton b4=new JButton("West");
		JButton b5=new JButton("Center");
		c.add(b1,bl.NORTH);
		c.add(b2,bl.SOUTH);
		c.add(b3,bl.EAST);
		c.add(b4,bl.WEST);
		c.add(b5,bl.CENTER);
		setTitle("BorderLayout Manager");
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new BorderDemo();
	}
}

import javax.swing.*;
import java.awt.*;
public class GridDemo extends JFrame
{
	public GridDemo()
	{
		Container c=getContentPane();
		GridLayout g=new GridLayout(3,4);
		c.setLayout(g);
		for(int i=0;i<12;i++)
		c.add(new JButton("Button"+i));
		setTitle("Grid Layout Managet");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new GridDemo();
	}
} 

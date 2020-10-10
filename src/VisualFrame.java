import java.awt.event.*;

import javax.swing.*;

public class VisualFrame extends JFrame
{
	public VisualFrame(int x, int y, int width, int height)
	{
		setBounds(x, y, width, height);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void resize(int width, int height)
	{
		setBounds(getX(), getY(), width, height);
	}
	public void checkC(int count, int max) 
	{
		if (count >= 20)
		{
			panel.setVisible(false);
			remove(panel);
			FinalPanel panel = new FinalPanel(this, "td"+max, "f"+max);
			add(panel);
		}
	}
	public VisualPanel panel = null;
}

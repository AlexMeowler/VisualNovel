import java.io.*;
public class VisualStart
{
	public static final void main(String[] args) throws IOException
	{
		VisualFrame mFrame = new VisualFrame(100, 50, 1000, 500);
		mFrame.setTitle("VisualNovel");
		VisualPanel panel = new VisualPanel(mFrame);
		mFrame.panel = panel;
		mFrame.add(panel);
	}
}

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
public class FinalPanel extends JPanel
{
	public FinalPanel(VisualFrame owner, String nameT, String nameI)
	{
		setBackground(new Color(255, 255, 255));
		this.nameI = nameI;
		BufferedReader rdr = null;
		setLayout(null);
		Image x = null;
		try {
			x = ImageIO.read(new File("resources/imgs/"+nameI+".jpg"));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		iw = x.getWidth(null);
		ih = x.getHeight(null);
		setBounds(owner.getX(), owner.getY(), owner.getWidth() , ih+iy+360);
		owner.resize(owner.getWidth() , ih+iy+360);
		try {
			rdr = new BufferedReader(new InputStreamReader(new FileInputStream("resources/ln/"+nameT+".txt")));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JTextArea lab = new JTextArea();
		String line, fline;
		line = "";
		fline = "";
		for(int i =0; i<5; i++)
		{
			try {
				line = rdr.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fline += line+"\n";
		}
		lab.setBounds(ix+iw+10, iy, 400, 150);
		lab.setLineWrap(true);
		lab.setText(fline);
		lab.setVisible(true);
		add(lab);
		JTextArea lab2 = new JTextArea();
		JScrollPane pa = new JScrollPane(lab2);
		fline = "";
		try {
			while((line = rdr.readLine()) != null)
			{
				fline += line + "\n";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lab2.setText(fline);
		pa.setBounds(ix, iy+ih, 800, 322);
		lab2.setLineWrap(true);
		lab2.setCaretPosition(0);
		add(pa);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D) g;
		Image img = null;
		Image bck = null;
		try {
			bck = ImageIO.read(new File("resources/imgs/bck.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g2d.drawImage(bck, ix, iy, null);
		try {
			img = ImageIO.read(new File("resources/imgs/"+nameI+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g2d.drawImage(img, ix, iy, null);
	}
	private String f2;
	private String nameI;
	private int ix = 0;
	private int iy = 0;
	private int iw;
	private int ih;
}

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Point2D;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class VisualPanel extends JPanel implements MouseListener
{
	public VisualPanel(VisualFrame owner) throws IOException
	{
		setBounds(owner.getX(), owner.getY(), owner.getWidth() , owner.getHeight());
		this.owner = owner;
		addMouseListener(this);
		setVisible(true);
		f = true;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		if(count<20)
		{
		Graphics2D g2d = (Graphics2D)g;
		Image img = null;
		
		try {
			img = ImageIO.read(new File("resources/imgs/t"+count+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		iw = img.getWidth(null);
		ih = img.getHeight(null);
		resize(owner);
		int[] px1 = getXp1(count);
		int[] py1 = getYp1(count);
		int[] px2 = getXp2(count);
		int[] py2 = getYp2(count);
		g2d.drawImage(img, 0, 0, null);
		p1 = new Polygon(px1, py1, getPoints1(count));
		p2 = new Polygon(px2, py2, getPoints2(count));
		g2d.setColor(new Color(0, 0, 0, 0));
		g2d.drawPolygon(p1);
		g2d.drawPolygon(p2);
		}
		else if(f)
		{
			owner.checkC(count, co.getMax());
			f = !f;
			
		}
	}
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = 0;
		switch(count)
		{
		  case 1:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x = 1;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 0;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 2:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =0;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 1;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 3:
		  {
			  count++;
			  repaint();
			  break;
		  }
		  case 4:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =0;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 1;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 5:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =0;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 1;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 6:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =1;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 0;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 7:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =0;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 1;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 8:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =1;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 0;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 9:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =1;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 0;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 10:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =0;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 1;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 11:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =0;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 1;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 13:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =0;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 1;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 12:
		  {
			  count++;
			  repaint();
			  break;
		  }
		  case 14:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =0;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 1;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 15:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =0;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 1;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 16:
		  {
			  count++;
			  repaint();
			  break;
		  }
		  case 17:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =1;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 0;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		  case 18:
		  {
			  count++;
			  repaint();
			  break;
		  }
		  case 19:
		  {
			  if(p1.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
			  {
				  x =1;
				  co.calcSequence(count, x);
				  count++;
				  repaint();
				  
			  }
			  else
			  {
				  if(p2.contains(e.getXOnScreen()-getLocationOnScreen().getX(), e.getYOnScreen()-getLocationOnScreen().getY()))
				  {
					  x = 0;
					  co.calcSequence(count, x);
					  count++;
					  repaint();
				  }
			  }
			  break;
		  }
		}
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public class MyActionListener 
	{

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			/*
			 if (e.getSource() == p1)
			{
				x = 0;
				co.calcSequence(count, x);
				count++;
			}
			else
			{
				if (e.getSource() == p2)
				{
					x = 1;
					co.calcSequence(count, x);
					count++;
				}
			}
			 */
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
	public void resize(VisualFrame owner)
	{
		owner.resize(iw, ih+40);
		setBounds(0, 0, iw, ih+40);
	}
	private int[] getXp1(int x)
	{
		int[] a = null;
		switch(x)
		{
			case 1:
			{
				a = new int[17];
				a[0]=7;
				a[1]=36;
				a[2]=69;
				a[3]=104;
				a[4]=148;
				a[5] = 178;
				a[6] = 214;
				a[7]= 317;
				a[8]=286;
				a[9]=256;
				a[10]=220;
				a[11]=181;
				a[12]=149;
				a[13]=104;
				a[14]=57;
				a[15]=15;
				a[16] = 0;
				break;
			}
			case 2:
			{
				a = new int[12];
				a[0]=0;
				a[1] = 91;
				a[2] = 136;
				a[3] = 206;
				a[4] = 234;
				a[5] = 280;
				a[6]= 281;
				a[7] = 348;
				a[8] = 337;
				a[9] = 375;
				a[10] = 371;
				a[11] = 0;
				break;
			}
			case 3:
			{
				a = new int[0];
				break;
			}
			case 4:
			{
				a = new int[3];
				a[0] = 117;
				a[1] = 783;
				a[2] = 104;
				break;
			}
			case 5:
			{
				a = new int[14];
				a[0] = 345;
				a[1] = 370;
				a[2] = 409;
				a[3] = 448;
				a[4] = 488;
				a[5] = 511;
				a[6] = 525;
				a[7] = 513;
				a[8] = 484;
				a[9] = 447;
				a[10] = 400;
				a[11] = 355;
				a[12] = 327;
				a[13] = 330;
				break;
			}
			case 6:
			{
				a = new int[18];
				a[0] = 132;
				a[1] = 182;
				a[2] = 238;
				a[3] = 300;
				a[4] = 352;
				a[5] = 385;
				a[6] = 396;
				a[7] = 393;
				a[8] = 379;
				a[9] = 343;
				a[10] = 300;
				a[11] = 253;
				a[12] = 208;
				a[13] = 162;
				a[14] = 95;
				a[15] = 62;
				a[16] =48;
				a[17] = 84;
				break;
			}
			case 7:
			{
				a = new int[4];
				a[0] = 102;
				a[1] = 309;
				a[2] = 321;
				a[3] = 104;
				break;
			}
			case 8:
			{
				a = new int[4];
				a[0] = 33;
				a[1] = 367;
				a[2] = 357;
				a[3] = 35;
				break;
			}
			case 9:
			{
				a = new int[13];
				a[0] = 492;
				a[1] = 526;
				a[2] = 565;
				a[3] = 601;
				a[4] = 620;
				a[5] = 617;
				a[6] = 592;
				a[7] = 557;
				a[8] = 515;
				a[9] = 477;
				a[10] = 455;
				a[11] = 447;
				a[12] = 456;
				break;
			}
			case 10:
			{
				a = new int[10];
				a[0] = 1;
				a[1] = 0;
				a[2] = 391;
				a[3] = 356;
				a[4] = 324;
				a[5] = 283;
				a[6] = 230;
				a[7] = 172;
				a[8] = 108;
				a[9] = 50;
				break;
			}
			case 11:
			{
				a = new int[8];
				a[0] = 479;
				a[1] = 507;
				a[2] = 533;
				a[3] = 539;
				a[4] = 513;
				a[5] = 478;
				a[6] = 454;
				a[7] = 460;
				break;
			}
			case 13:
			{
				a = new int[10];
				a[0] = 77;
				a[1] = 122;
				a[2] = 182;
				a[3] = 244;
				a[4] = 251;
				a[5] = 207;
				a[6] = 139;
				a[7] = 64;
				a[8] = 35;
				a[9] = 41;
				break;
			}
			case 12:
			{
				a = new int[0];
				break;
			}
			case 14:
			{
				a = new int[4];
				a[0] = 321;
				a[1] = 483;
				a[2] = 489;
				a[3] = 326;
				break;
			}
			case 15:
			{
				a = new int[11];
				a[0] = 409;
				a[1] = 426;
				a[2] = 523;
				a[3] = 608;
				a[4] = 702; 
				a[5] = 778;
				a[6] = 834;
				a[7] = 833;
				a[8] = 790; 
				a[9] = 738;
				a[10] = 688;
				break;
			}
			case 16:
			{
				a = new int[0];
				break;
			}
			case 17:
			{
				a = new int[10];
				a[0] = 62;
				a[1] = 101;
				a[2] = 137;
				a[3] = 170;
				a[4] = 186;
				a[5] = 163;
				a[6] = 122;
				a[7] = 68;
				a[8] = 39;
				a[9] = 34;
				break;
			}
			case 18:
			{
				a = new int[0];
				break;
			}
			case 19:
			{
				a = new int[11];
				a[0] = 534;
				a[1] = 583;
				a[2] = 642;
				a[3] = 684;
				a[4] = 753;
				a[5] = 785;
				a[6] = 763;
				a[7] = 718;
				a[8] = 633;
				a[9] = 567;
				a[10] = 532;
				break;
			}
			default: 
			{
				a = new int[0];
			}
		}
		return a;
	}
	private int[] getYp1(int x)
	{
		int[] a = null;
		switch(x)
		{
			case 1:
			{
				a = new int[17]; //{150, 138, 131, 127, 128, 134, 144, 277, 310, 327, 338, 341, 342, 328, 320, 301, 287};
				a[0]=150;
				a[1]=138;
				a[2]=131;
				a[3]=127;
				a[4]=128;
				a[5] = 134;
				a[6] = 144;
				a[7]= 277;
				a[8]=310;
				a[9]=327;
				a[10]=338;
				a[11]=341;
				a[12]=342;
				a[13]=328;
				a[14]=320;
				a[15]=301;
				a[16] = 287;
				break;
			}
			case 2:
			{
				a = new int[12];
				a[0]=465;
				a[1] = 434;
				a[2] = 361;
				a[3] = 318;
				a[4] =268;
				a[5] = 223;
				a[6]=201;
				a[7] = 149;
				a[8] = 71;
				a[9] = 48;
				a[10] = 0;
				a[11] = 0;
				break;
			}
			case 3:
			{
				a = new int[0];
				break;
			}
			case 4:
			{
				a = new int[3];
				a[0] = 535;
				a[1] = 55;
				a[2] = 53;
				break;
			}
			case 5:
			{
				a = new int[14];
				a[0] = 437;
				a[1] = 412;
				a[2] = 400;
				a[3] = 398;
				a[4] = 410;
				a[5] = 435;
				a[6] = 475;
				a[7] = 509;
				a[8] = 535;
				a[9] = 553;
				a[10] = 557;
				a[11] = 542;
				a[12] = 513;
				a[13] = 474;
				break;
			}
			case 6:
			{
				a = new int[18];
				a[0] = 410;
				a[1] = 395;
				a[2] = 385;
				a[3] = 373;
				a[4] = 377;
				a[5] = 413;
				a[6] = 445;
				a[7] = 476;
				a[8] = 510;
				a[9] = 530;
				a[10] = 541;
				a[11] = 544;
				a[12] = 541;
				a[13] = 536;
				a[14] = 538;
				a[15] = 511;
				a[16] = 477;
				a[17] = 446;
				break;
			}
			case 7:
			{
				a = new int[4];
				a[0] = 430;
				a[1] = 427;
				a[2] = 570;
				a[3] = 569;
				break;
			}
			case 8:
			{
				a = new int[4];
				a[0] = 336;
				a[1] = 344;
				a[2] = 513;
				a[3] = 509;
				break;
			}
			case 9:
			{
				a = new int[13];
				a[0] = 102;
				a[1] = 101;
				a[2] = 98;
				a[3] = 108;
				a[4] = 133;
				a[5] = 161;
				a[6] = 191;
				a[7] = 210;
				a[8] = 214;
				a[9] = 206;
				a[10] = 189;
				a[11] = 163;
				a[12] = 132;
				break;
			}
			case 10:
			{
				a = new int[10];
				a[0] = 165;
				a[1] = 1;
				a[2] = 3;
				a[3] = 62;
				a[4] = 97;
				a[5] = 124;
				a[6] = 148;
				a[7] = 165;
				a[8] = 176;
				a[9] = 177;
				break;
			}
			case 11:
			{
				a = new int [8];
				a[0] = 255;
				a[1] = 253;
				a[2] = 263;
				a[3] = 279;
				a[4] = 291;
				a[5] = 292;
				a[6] = 281;
				a[7] = 263;
				break;
			}
			case 13:
			{
				a = new int[10];
				a[0] = 85;
				a[1] = 67;
				a[2] = 72;
				a[3] = 101;
				a[4] = 170;
				a[5] = 220;
				a[6] = 238;
				a[7] = 220;
				a[8] = 171;
				a[9] = 122;
				break;
			}
			case 12:
			{
				a = new int[0];
				break;
			}
			case 14:
			{
				a = new int[4];
				a[0] = 109;
				a[1] = 104;
				a[2] = 193;
				a[3] = 197;
				break;
			}
			case 15:
			{
				a = new int[11];
				a[0] = 281;
				a[1] = 327;
				a[2] = 361;
				a[3] = 354;
				a[4] = 338;
				a[5] = 311;
				a[6] = 271;
				a[7] = 143;
				a[8] = 108;
				a[9] = 92;
				a[10] = 87;
				break;
			}
			case 16:
			{
				a = new int[0];
				break;
			}
			case 17:
			{
				a = new int[10];
				a[0] = 128;
				a[1] = 114;
				a[2] = 119;
				a[3] = 143;
				a[4] = 181;
				a[5] = 220;
				a[6] = 241;
				a[7] = 239;
				a[8] = 209;
				a[9] = 164;
				break;
			}
			case 18:
			{
				a = new int[0];
				break;
			}
			case 19:
			{
				a = new int[11];
				a[0] = 83;
				a[1] = 43;
				a[2] = 23;
				a[3] = 23;
				a[4] = 52;
				a[5] = 103;
				a[6] = 157;
				a[7] = 184;
				a[8] = 186;
				a[9] = 165;
				a[10] = 134;
				break;
			}
			default: 
			{
				a = new int[0];
			}
		}
		return a;
	}
	private int[] getXp2(int x)
	{
		int[] a = null;
		switch(x)
		{
			case 1:
			{
				a = new int[14]; //{380, 418, 446, 456, 837, 837, 758, 674, 614, 606, 582, 525, 459, 417};
				a[0]=380;
				a[1]=418;
				a[2]=446;
				a[3]=456;
				a[4]=837;
				a[5] = 837;
				a[6] = 758;
				a[7]= 674;
				a[8]=614;
				a[9]=606;
				a[10]=582;
				a[11]=525;
				a[12]=459;
				a[13]=417;
				break;
			}
			case 2:
			{
				a = new int[11];
				a[0]=837;
				a[1]=772;
				a[2]= 721;
				a[3]=667;
				a[4]=606;
				a[5]=572;
				a[6]=552;
				a[7]=505;
				a[8]=460;
				a[9]=460;
				a[10]=837;
				break;
			}
			case 3:
			{
				a = new int[0];
				break;
			}
			case 4:
			{
				a = new int[3];
				a[0] = 117;
				a[1] = 783;
				a[2] = 767;
				break;
			}
			case 5:
			{
				a = new int[11];
				a[0] = 712;
				a[1] = 733;
				a[2] = 779;
				a[3] = 813;
				a[4] = 821;
				a[5] = 812;
				a[6] = 790;
				a[7] = 769;
				a[8] = 731;
				a[9] = 707;
				a[10] = 701;
				break;
			}
			case 6:
			{
				a = new int[15];
				a[0] = 539;
				a[1] = 567;
				a[2] = 597;
				a[3] = 630;
				a[4] = 741;
				a[5] = 763;
				a[6] = 774;
				a[7] = 764;
				a[8] = 747;
				a[9] = 710;
				a[10] = 665;
				a[11] = 509;
				a[12] = 481;
				a[13] = 480;
				a[14] = 501;
				break;
			}
			case 7:
			{
				a = new int[4];
				a[0] = 486;
				a[1] = 732;
				a[3] = 485;
				a[2] = 732;
				break;
			}
			case 8:
			{
				a = new int[4];
				a[0] = 463;
				a[1] = 790;
				a[2] = 782;
				a[3] = 456;
				break;
			}
			case 9:
			{
				a = new int[13];
				a[0] = 465;
				a[1] = 496;
				a[2] = 527;
				a[3] = 549;
				a[4] = 554;
				a[5] = 546;
				a[6] = 520;
				a[7] = 476;
				a[8] = 443;
				a[9] = 407;
				a[10] = 389;
				a[11] = 399;
				a[12] = 427;
				break;
			}
			case 10:
			{
				a = new int[12];
				a[0] = 468;
				a[1] = 600;
				a[2] = 688;
				a[3] = 731;
				a[4] = 784;
				a[5] = 834;
				a[6] = 836;
				a[7] = 788;
				a[8] = 692;
				a[9] = 607;
				a[10] = 543;
				a[11] = 488;
				break;
			}
			case 11:
			{
				a = new int[8];
				a[0] = 443;
				a[1] = 474;
				a[2] = 504;
				a[3] = 517;
				a[4] = 509;
				a[5] = 483;
				a[6] = 448;
				a[7] = 429;
				break;
			}
			case 13:
			{
				a= new int[11];
				a[0] = 618;
				a[1] = 703;
				a[2] = 752;
				a[3] = 787;
				a[4] = 777;
				a[5] = 706;
				a[6] = 636;
				a[7] = 576;
				a[8] = 538;
				a[9] = 544;
				a[10] = 572;
				break;
			}
			case 12:
			{
				a = new int[0];
				break;
			}
			case 14:
			{
				a = new int[4];
				a[0] = 552;
				a[1] = 739;
				a[2] = 738;
				a[3] = 554;
				break;
			}
			case 15:
			{
				a = new int[12];
				a[0] = 1;
				a[1] = 55;
				a[2] = 142;
				a[3] = 241;
				a[4] = 289;
				a[5] = 361;
				a[6] = 361;
				a[7] = 325;
				a[8] = 240;
				a[9] = 165;
				a[10] = 100;
				a[11] = 1;
				break;
			}
			case 16:
			{
				a = new int[0];
				break;
			}
			case 17:
			{
				a = new int[10];
				a[0] = 499;
				a[1] = 554;
				a[2] = 600;
				a[3] = 627;
				a[4] = 626;
				a[5] = 594;
				a[6] = 523;
				a[7] = 458;
				a[8] = 430;
				a[9] = 440;
				break;
			}
			case 18:
			{
				a = new int[0];
				break;
			}
			case 19:
			{
				a = new int[10];
				a[0] = 659;
				a[1] = 705;
				a[2] = 758;
				a[3] = 785;
				a[4] = 779;
				a[5] = 749;
				a[6] = 684;
				a[7] = 628;
				a[8] = 613;
				a[9] = 627;
				break;
			}
			default: 
			{
				a = new int[0];
			}
		}
		return a;
	}
	private int[] getYp2(int x)
	{
		int[] a = null;
		switch(x)
		{
			case 1:
			{
				a = new int[14]; //{108, 80, 64, 0, 0, 110, 156, 183, 194, 215, 200, 196, 174, 150};
				a[0]=108;
				a[1]=80;
				a[2]=64;
				a[3]=0;
				a[4]=0;
				a[5] = 110;
				a[6] = 156;
				a[7]= 183;
				a[8]=194;
				a[9]=215;
				a[10]=200;
				a[11]=196;
				a[12]=174;
				a[13]=150;
				break;
			}
			case 2:
			{
				a = new int[11];
				a[0] = 221;
				a[1]=224;
				a[2]=197;
				a[3]=287;
				a[4]=314;
				a[5]=364;
				a[6]=434;
				a[7]=471;
				a[8]=529;
				a[9]=580;
				a[10]=580;
				break;
			}
			case 3:
			{
				a = new int[0];
				break;
			}
			case 4:
			{
				a = new int[3];
				a[0] = 535;
				a[1] = 55;
				a[2] = 529;
				break;
			}
			case 5:
			{
				a = new int[11];
				a[0] = 79;
				a[1] = 59;
				a[2] = 54;
				a[3] = 73;
				a[4] = 110;
				a[5] = 149;
				a[6] = 178;
				a[7] = 191;
				a[8] = 185;
				a[9] = 154;
				a[10] = 118;
				break;
			}
			case 6:
			{
				a = new int[15];
				a[0] = 395;
				a[1] = 399;
				a[2] = 399;
				a[3] = 390;
				a[4] = 363;
				a[5] = 386;
				a[6] = 410;
				a[7] = 482;
				a[8] = 509;
				a[9] = 525;
				a[10] = 548;
				a[11] = 537;
				a[12] = 501;
				a[13] = 460;
				a[14] = 418;
				break;
			}
			case 7:
			{
				a = new int[4];
				a[0] = 441;
				a[1] = 436;
				a[3] = 564;
				a[2] = 569;
				break;
			}
			case 8:
			{
				a = new int[4];
				a[0] = 346;
				a[1] = 353;
				a[2] = 529;
				a[3] = 520;
				break;
			}
			case 9:
			{
				a = new int[13];
				a[0] = 321;
				a[1] = 315;
				a[2] = 302;
				a[3] = 288;
				a[4] = 261;
				a[5] = 236;
				a[6] = 221;
				a[7] = 216;
				a[8] = 219;
				a[9] = 234;
				a[10] = 260;
				a[11] = 295;
				a[12] = 318;
				break;
			}
			case 10:
			{
				a = new int[12];
				a[0] = 219;
				a[1] = 103;
				a[2] = 83;
				a[3] = 84;
				a[4] = 100;
				a[5] = 130;
				a[6] = 255;
				a[7] = 287;
				a[8] = 318;
				a[9] = 332;
				a[10] = 317;
				a[11] = 281;
				break;
			}
			case 11:
			{
				a = new int[8];
				a[0] = 336;
				a[1] = 344;
				a[2] = 336;
				a[3] = 321;
				a[4] = 304;
				a[5] = 296;
				a[6] = 302;
				a[7] = 320;
				break;
			}
			case 13:
			{
				a = new int[11];
				a[0] = 97;
				a[1] = 96;
				a[2] = 106;
				a[3] = 139;
				a[4] = 203;
				a[5] = 248;
				a[6] = 267;
				a[7] = 259;
				a[8] = 206;
				a[9] = 156;
				a[10] = 121;
				break;
			}
			case 12:
			{
				a = new int[0];
				break;
			}
			case 14:
			{
				a = new int[4];
				a[0] = 108;
				a[1] = 107;
				a[2] = 200;
				a[3] = 202;
				break;
			}
			case 15:
			{
				a = new int[12];
				a[0] = 139;
				a[1] = 167;
				a[2] = 197;
				a[3] = 214;
				a[4] = 203;
				a[5] = 182;
				a[6] = 132;
				a[7] = 85;
				a[8] = 35;
				a[9] = 19;
				a[10] = 17;
				a[11] = 57;
				break;
			}
			case 16:
			{
				a = new int[0];
				break;
			}
			case 17:
			{
				a = new int[10];
				a[0] = 99;
				a[1] = 97;
				a[2] = 118;
				a[3] = 151;
				a[4] = 194;
				a[5] = 241;
				a[6] = 261;
				a[7] = 248;
				a[8] = 212;
				a[9] = 149;
				break;
			}
			case 18:
			{
				a = new int[0];
				break;
			}
			case 19:
			{
				a = new int[10];
				a[0] = 244;
				a[1] = 229;
				a[2] = 242;
				a[3] = 280;
				a[4] = 340;
				a[5] = 383;
				a[6] = 398;
				a[7] = 374;
				a[8] = 324;
				a[9] = 281;
				break;
			}
			default: 
			{
				a = new int[0];
			}
		}
		return a;
	}
	private int getPoints1(int x)
	{
		int p = 0;
		switch(x)
		{
			case 1:
			{
				p = 17;
				break;
			}
			case 2:
			{
				p = 12;
				break;
			}
			case 3:
			{
				p = 0;
				break;
			}
			case 4:
			{
				p = 3;
				break;
			}
			case 5:
			{
				p = 14;
				break;
			}
			case 6:
			{
				p = 18;
				break;
			}
			case 7:
			{
				p = 4;
				break;
			}
			case 8:
			{
				p = 4;
				break;
			}
			case 9:
			{
				p = 13;
				break;
			}
			case 10:
			{
				p = 10;
				break;
			}
			case 11:
			{
				p = 8;
				break;
			}
			case 13:
			{
				p = 10;
				break;
			}
			case 12:
			{
				p = 0;
				break;
			}
			case 14:
			{
				p = 4;
				break;
			}
			case 15:
			{
				p = 11;
				break;
			}
			case 16:
			{
				p = 0;
				break;
			}
			case 17:
			{
				p = 10;
				break;
			}
			case 18:
			{
				p = 0;
				break;
			}
			case 19:
			{
				p = 11;
				break;
			}
			
		}
		return p;
	}
	private int getPoints2(int x)
	{
		int p = 0;
		switch(x)
		{
			case 1:
			{
				p = 14;
				break;
			}
			case 2:
			{
				p = 11;
				break;
			}
			case 3:
			{
				p = 0;
				break;
			}
			case 4:
			{
				p = 3;
				break;
			}
			case 5:
			{
				p = 11;
				break;
			}
			case 6:
			{
				p = 15;
				break;
			}
			case 7:
			{
				p = 4;
				break;
			}
			case 8:
			{
				p = 4;
				break;
			}
			case 9:
			{
				p = 13;
				break;
			}
			case 10:
			{
				p = 12;
				break;
			}
			case 11:
			{
				p = 8;
				break;
			}
			case 13:
			{
				p = 11;
				break;
			}
			case 12:
			{
				p = 0;
				break;
			}
			case 14:
			{
				p = 4;
				break;
			}
			case 15:
			{
				p = 12;
				break;
			}
			case 16:
			{
				p = 0;
				break;
			}
			case 17:
			{
				p = 10;
				break;
			}
			case 18:
			{
				p = 0;
				break;
			}
			case 19:
			{
				p = 10;
				break;
			}
		}
		return p;
	}
	private int count = 1;
	private int iw = 0;
	private int ih = 0;
	private VisualFrame owner;
	private Polygon p1, p2;
	private CountCl co = new CountCl();
	private boolean f;
}

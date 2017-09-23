package org.compsys704;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	BufferedImage Blind;
	BufferedImage Light;
	BufferedImage Heater;
	BufferedImage Fan;
	BufferedImage AC;
	BufferedImage Human;
	int R = 225, G=225, B=225, R1=255, G1=255, B1=255;
	final static float dash1[] = {10.0f};
	final static BasicStroke dashed = new BasicStroke(1.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,10.0f, dash1, 0.0f);
	
	public Canvas(){
		try {
			BufferedImage bi = ImageIO.read(new File("res/Human.png"));
			Human = bi.getSubimage(0, 0, 500,500);
			bi = ImageIO.read(new File("res/Blind.png"));
			Blind = bi.getSubimage(0, 0, 200, 200);
			bi = ImageIO.read(new File("res/Light.png"));
			Light = bi.getSubimage(0, 0, 250, 250);
			bi = ImageIO.read(new File("res/Heater.png"));
			Heater = bi.getSubimage(0, 0, 200, 200);
			bi = ImageIO.read(new File("res/Fan.png"));
			Fan = bi.getSubimage(0, 0, 500, 500);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g);
	
			//Zone1
			g.setColor(new Color(R,G,B));
			g.fillRect(100, 330, 300, 250);
				
			//Zone2
			g.setColor(new Color(R,G,B));
			g.fillRect(400, 330, 225, 250);
				
			//Zone3
			g.setColor(new Color(R,G,B));
			g.fillRect(625, 330, 225, 250);
				
			//Zone4
			g.setColor(new Color(R,G,B));
			g.fillRect(700, 80, 150, 250);
				
			//Zone5
			g.setColor(new Color(R,G,B));
			g.fillRect(550, 80, 150, 250);
				
			//Zone6
			g.setColor(new Color(R,G,B));
			g.fillRect(400, 80, 150, 250);
				
			//Zone7
			g.setColor(new Color(R,G,B));
			g.fillRect(100, 80, 300, 250);
				
			//Outside to Office DOOR
			g.setColor(Color.GRAY);
			g.fillRect(95, 500, 10, 50);
				
			//Office to Manufacturing DOOR
			g.fillRect(395, 500, 10, 50);
				
			//Zone2 to Zone6 DOOR
			g.fillRect(450, 325, 50, 10);
				
			//Zone3 to Zone4 DOOR
			g.fillRect(750, 325, 50, 10);
				
			//Wall1
			g.drawLine(400, 330, 850, 330);
				
			//Wall2
			g.drawLine(400, 80, 400, 580);
			
			//factory
			g.drawRect(100, 80, 750, 500);
			
			if(States.OCCUPIED1) 
			{
				g.drawImage(Human, 100, 340, 60, 60, null);
			}
			
			if(States.OCCUPIED7) 
			{
				g.drawImage(Human, 100, 100, 60, 60, null);
			}
			

			if(States.BLIND1) 
			{
				g.drawImage(Blind,160, 340, 60, 60, null);
			}
			
			if(States.BLIND7) 
			{
				g.drawImage(Blind,160, 100, 60, 60, null);
			}
			
			if(States.LIGHT1) 
			{
				g.drawImage(Light,220, 340, 60, 60, null);
			}
			
			if(States.LIGHT7) 
			{
				g.drawImage(Light,220, 100, 60, 60, null);
			}
			
			if(States.HEATER1) 
			{
				g.drawImage(Heater,280, 340, 60, 60, null);
			}
			
			if(States.HEATER7) 
			{
				g.drawImage(Heater,280, 100, 60, 60, null);
			}
			
			if(States.FAN1) 
			{
				g.drawImage(Fan,340, 340, 60, 60, null);
			}
			
			if(States.FAN7) 
			{
				g.drawImage(Fan,340, 100, 60, 60, null);
			}
			
			if(States.ALARM1)
			{
				g.setColor(new Color(R,0,0));
				g.fillRect(100, 330, 300, 250);
				g.fillRect(100, 80, 300, 250);
			}
				
			//Zone1 - Zone7
			g2.setStroke(dashed);
			g2.drawLine(100, 330, 850, 330);
				
			//Zone2 - Zone3
			g2.drawLine(625, 330, 625, 580);
			
			//Zone5 - Zone6
			g2.drawLine(550, 80, 550, 330);
			
			//Zone4 - Zone5
			g2.drawLine(700, 80, 700, 330);
				
		
		
	}
}

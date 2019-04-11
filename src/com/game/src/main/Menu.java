package com.game.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Menu {

	public Rectangle playButton = new Rectangle(Game.WIDTH/2 +120 , 250 , 100 , 50);
	public Rectangle quitButton = new Rectangle(Game.WIDTH/2 +120 , 350 , 100 , 50);
	
	
	public void render(Graphics g) {
		
		
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("arial",Font.BOLD, 40);
		g.setFont(fnt0);
		g.setColor(Color.RED);
		g.drawString("SPACE GAME", Game.WIDTH/3,50);
		Font fnt1 = new Font("arial",Font.ITALIC, 20);
		g.setFont(fnt1);
		g.setColor(Color.cyan);
		g.drawString("Prepared by:", Game.WIDTH/8,120);
		Font fnt2 = new Font("arial",Font.ITALIC, 20);
		g.setFont(fnt2);
		g.setColor(Color.ORANGE);
		g.drawString("Burak CANBAZ", Game.WIDTH/2,120);

		Font fnt3 = new Font("arial",Font.BOLD, 30);
		g.setFont(fnt3);
		g.setColor(Color.LIGHT_GRAY);
		g.drawString("PLAY", playButton.x+10, playButton.y+33);
		
		g2d.draw(playButton);
		

		Font fnt4 = new Font("arial",Font.BOLD, 30);
		g.setFont(fnt4);
		g.setColor(Color.LIGHT_GRAY);
		g.drawString("QUIT", quitButton.x+10, quitButton.y+33);
		g2d.draw(quitButton);
	}
	
	
}

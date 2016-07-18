package com.geogry.ui;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ActivatePane extends JPanel {

	private static final long serialVersionUID = 7412677781650314765L;
	
	private ImageIcon background = null;
	
	public ActivatePane(){
		background = new ImageIcon(System.getProperty("user.dir") + "/resources/image/bg.jpg");
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background.getImage(), 0, 0, 640, 480, null);
	}

}

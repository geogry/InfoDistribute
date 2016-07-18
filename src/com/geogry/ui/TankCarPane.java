package com.geogry.ui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 油罐车
 * @author geogry
 *
 */
public class TankCarPane extends MyPanel {
	
	private static final long serialVersionUID = 3376543398862750194L;

	private JLabel typeLbl;
	
	private JTextField typeTxt;
	
	private JLabel textureLbl;
	
	private JTextField textureTxt;
	
	private JLabel capacityLbl;
	
	private JTextField capacityTxt;
	
	public TankCarPane() {
		typeLbl = new JLabel("*类型:");
		typeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		typeLbl.setBounds(0, 0, 100, 20);
		typeTxt = new JTextField();
		typeTxt.setName("22");
		typeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		typeTxt.setBounds(100, 0, 150, 20);
		
		textureLbl = new JLabel("罐体材质:");
		textureLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		textureLbl.setBounds(0, 25, 100, 20);
		textureTxt = new JTextField();
		textureTxt.setName("61");
		textureTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		textureTxt.setBounds(100, 25, 150, 20);
		
		capacityLbl = new JLabel("罐体容积L:");
		capacityLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityLbl.setBounds(0, 50, 100, 20);
		capacityTxt = new JTextField();
		capacityTxt.setName("24");
		capacityTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityTxt.setBounds(100, 50, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(textureLbl);
		this.add(textureTxt);
		this.add(capacityLbl);
		this.add(capacityTxt);
	}
	
	public boolean isLegal(){
		if(typeTxt.getText() != null && !"".equals(typeTxt.getText()))
			return true;
		else
			return false;
	}

}

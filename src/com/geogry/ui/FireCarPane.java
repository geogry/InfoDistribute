package com.geogry.ui;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 消防车
 * @author geogry
 *
 */
public class FireCarPane extends MyPanel {

	private static final long serialVersionUID = -4257864962227921195L;

	private JLabel typeLbl;
	
	private JTextField typeTxt;
	
	private JLabel seatLbl;
	
	private JTextField seatTxt;
	
	public FireCarPane() {
		typeLbl = new JLabel("*类型:");
		typeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		typeLbl.setBounds(0, 0, 100, 20);
		typeTxt = new JTextField();
		typeTxt.setName("22");
		typeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		typeTxt.setBounds(100, 0, 150, 20);
		
		seatLbl = new JLabel("座位数:");
		seatLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		seatLbl.setBounds(0, 25, 100, 20);
		seatTxt = new JTextField();
		seatTxt.setName("38");
		seatTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		seatTxt.setBounds(100, 25, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(seatLbl);
		this.add(seatTxt);
	}

	public boolean isLegal(){
		if(typeTxt.getText() != null && !"".equals(typeTxt.getText()))
			return true;
		else
			return false;
	}
	
}

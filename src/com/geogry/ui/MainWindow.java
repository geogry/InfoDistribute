package com.geogry.ui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 98354544136294631L;
	
	private BufferedImage icon = null;
	
	private JMenuBar menu;
	
	private JMenu start;
	
	private JMenu excute;
	
	private JMenu about;
	
	private JMenuItem aboutOrange;
	
	private JMenuItem operateGuide;
	
	private JMenuItem addUser;
	
	private JMenuItem publish;
	
	private JMenuItem puasePublish;
	
	private JMenuItem stopPublish;
	
	private JMenuItem saveAsTemplate;
	
	private JMenuItem exit;
	
	private JMenuItem loadTemplate;
	
	public MainWindow(){
		start = new JMenu("开始");
		saveAsTemplate = new JMenuItem("保存为模版");
		loadTemplate = new JMenuItem("加载模版");
		exit = new JMenuItem("退出");
		start.add(saveAsTemplate);
		start.add(loadTemplate);
		start.addSeparator();
		start.add(exit);
		
		excute = new JMenu("执行");
		addUser = new JMenuItem("设置用户");
		publish = new JMenuItem("开始发布");
		puasePublish = new JMenuItem("暂停发布");
		stopPublish = new JMenuItem("停止发布");
		excute.add(addUser);
		excute.addSeparator();
		excute.add(publish);
		excute.add(puasePublish);
		excute.add(stopPublish);
		
		about = new JMenu("关于");
		operateGuide = new JMenuItem("操作说明");
		aboutOrange = new JMenuItem("关于Orange");
		about.add(operateGuide);
		about.addSeparator();
		about.add(aboutOrange);
		
		menu = new JMenuBar();
		menu.add(start);
		menu.add(excute);
		menu.add(about);
		this.setTitle("Orange");
		try {
			icon = ImageIO.read(new File(System.getProperty("user.dir") + "/resources/image/orange.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setIconImage(icon);
		this.pack();
		this.setContentPane(new MainWindowPane());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(1085, 900));
		int x = (this.getToolkit().getScreenSize().width - 1085)/2;
		int y = (this.getToolkit().getScreenSize().height - 900)/2;
		this.setLocation(x, y);
		this.setVisible(false);
		this.setBounds(x, y, 1085, 900);
		this.setResizable(false);
		
		this.setJMenuBar(menu);
		
		
		initGlobalFont(new Font("宋体", Font.PLAIN, 13));
	}
	
	public void initGlobalFont(Font f){
		FontUIResource fr = new FontUIResource(f);
		for(Enumeration<Object> keys = UIManager.getDefaults().keys(); keys.hasMoreElements();){
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if(value instanceof FontUIResource){
				UIManager.put(key, fr);
			}
		}
	}

}

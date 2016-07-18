package com.geogry.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.geogry.utils.LengthLimit;

/**
 * this class is a JFrame subclass, it shows the activate window and dell with the user's action.
 * @author geogry
 *
 */
public class ActivateWindow extends JFrame {

	private static final long serialVersionUID = 3625502924661567305L;
	//使用提示
	private JLabel userTip = null;
	//版权声明
	private JLabel copyright = null;
	//联系电话
	private JLabel phone = null;
	//地址
	private JLabel address = null;
	//激活提示
	private JLabel activateTip = null;
	//注册码第一部分
	private JTextField key1 = null;
	//1、2部分分隔符
	private JLabel separator1 = null;
	//注册码第二部分
	private JTextField key2 = null;
	//2、3部分分隔符
	private JLabel separator2 = null;
	//注册码第三部分
	private JTextField key3 = null;
	//3、4部分分隔符
	private JLabel separator3 = null;
	//注册码第四部分
	private JTextField key4 = null;
	//4、5部分分隔符
	private JLabel separator4 = null;
	//注册码第五部分
	private JTextField key5 = null;
	//激活按钮
	private JButton activate = null;
	//图标
	private BufferedImage ico = null;
	//根面板
	private ActivatePane contentPane = null;
	
	public ActivateWindow(){
		userTip = new JLabel("<html><body>你是首次使用本软件，请激活，本软件激活后永久使用.</body></html>");
		userTip.setBounds(20, 30, 640, 50);
		userTip.setFont(new Font("宋体", Font.PLAIN, 18));
		copyright = new JLabel("<html><body>Orange产品信息发布软件由Orange软件开发小组开发，Orange产品信息发布<br>软件版权归Orange软件开发小组所有.</body></html>");
		copyright.setFont(new Font("宋体", Font.PLAIN, 18));
		copyright.setBounds(20, 85, 640, 50);
		phone = new JLabel("联系电话:***********");
		phone.setBounds(20, 140, 640, 40);
		phone.setFont(new Font("宋体", Font.PLAIN, 18));
		address = new JLabel("地址:四川省成都市西南交通大学犀浦校区");
		address.setBounds(20, 185, 640, 40);
		address.setFont(new Font("宋体", Font.PLAIN, 18));
		activateTip = new JLabel("请输入激活码以激活本软件:");
		activateTip.setBounds(20, 230, 640, 40);
		activateTip.setFont(new Font("宋体", Font.PLAIN, 18));
		
		key1 = new JTextField();
		key1.setBounds(20, 275, 90, 40);
		key1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		key1.setDocument(new LengthLimit(5));
		separator1 = new JLabel("-");
		separator1.setBounds(112, 275, 5, 40);
		key2 = new JTextField();
		key2.setBounds(119, 275, 90, 40);
		key2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		key2.setDocument(new LengthLimit(5));
		separator2 = new JLabel("-");
		separator2.setBounds(211, 275, 5, 40);
		key3 = new JTextField();
		key3.setBounds(218, 275, 90, 40);
		key3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		key3.setDocument(new LengthLimit(5));
		separator3 = new JLabel("-");
		separator3.setBounds(310, 275, 5, 40);
		key4 = new JTextField();
		key4.setBounds(317, 275, 90, 40);
		key4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		key4.setDocument(new LengthLimit(5));
		separator4 = new JLabel("-");
		separator4.setBounds(409, 275, 5, 40);
		key5 = new JTextField();
		key5.setBounds(416, 275, 90, 40);
		key5.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		key5.setDocument(new LengthLimit(5));
		
		activate = new JButton("激 活");
		activate.setBounds(460, 370, 100, 30);
		activate.setFont(new Font("宋体", Font.BOLD, 18));
		activate.addActionListener(new ActivateBtnActionListener(new MainWindow(), this));
		
		contentPane = new ActivatePane();
		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 640, 480);
		
		contentPane.add(userTip);
		contentPane.add(copyright);
		contentPane.add(phone);
		contentPane.add(address);
		contentPane.add(activateTip);
		contentPane.add(key1);
		contentPane.add(separator1);
		contentPane.add(key2);
		contentPane.add(separator2);
		contentPane.add(key3);
		contentPane.add(separator3);
		contentPane.add(key4);
		contentPane.add(separator4);
		contentPane.add(key5);
		contentPane.add(activate);
		
		this.setTitle("激活");
		int x = (this.getToolkit().getScreenSize().width - 640) / 2;
		int y = (this.getToolkit().getScreenSize().height - 480) / 2;
		this.setLocation(x, y);
		this.pack();
		this.setBounds(x, y, 640, 480);
		this.setContentPane(contentPane);
		try {
			ico = ImageIO.read(new File(System.getProperty("user.dir") + "/resources/image/orange.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setIconImage(ico);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	class ActivateBtnActionListener implements ActionListener {

		private MainWindow mainWindow = null;
		
		private ActivateWindow activateWindow = null;
		
		public ActivateBtnActionListener(MainWindow mainWindow, ActivateWindow activateWindow){
			this.mainWindow = mainWindow;
			this.activateWindow = activateWindow;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String code1 = key1.getText();
			String code2 = key2.getText();
			String code3 = key3.getText();
			String code4 = key4.getText();
			String code5 = key5.getText();
			if(code1 != null && code2 != null && code3 != null && code4 != null && code5 != null
					&& !code1.equals("") && !code2.equals("") && !code3.equals("") && !code4.equals("") && !code5.equals("")){
				//从数据库查询激活码，如果为空，表明验证失败，重新验证，如果不为空，隐藏激活窗口显示主窗口并修改配置文件为激活码
				this.activateWindow.hide();
				this.mainWindow.show();
			} else {
				//弹出提示框，请输入正确的激活码
				JOptionPane.showMessageDialog(this.activateWindow, "请输入正确的激活码！", "提示", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}
}

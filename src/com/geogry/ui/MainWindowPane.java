package com.geogry.ui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.atlanticbb.tantlinger.shef.HTMLEditorPane;

import com.geogry.file.FileOperator;
import com.geogry.http.HttpClient;
import com.geogry.timer.PublishTimer;

/**
 * This class disign a panel that display the main window.
 * @author geogry
 *
 */
public class MainWindowPane extends JPanel {

	private static final long serialVersionUID = 105183309903841130L;
	//平台参数选择面板
	private JPanel platformChoosePane = null;
	//通用参数面板
	private MyPanel commonConfPane = null;
	//专用参数面板
	private JPanel specialConfPane = null;
	//发布参数面板
	private JPanel publishPane = null;
	//平台选择标签
	private JLabel platformChooseLbl = null;
	//平台选择下拉列表框
	private JComboBox<String> platformChooseCombo = null;
	//用户名标签
	private JLabel usernameLbl = null;
	//用户名输入框
	private JTextField usernameTxt = null;
	//密码标签
	private JLabel passwordLbl = null;
	//密码输入框
	private JTextField passwordTxt = null;
	//保存用户按钮
	private JButton saveUserBtn = null;
	//车型选择标签
	private JLabel carTypeLbl = null;
	//车型选择框
	private  JComboBox<String> carTypeCombo = null;
	//产品标题
	private JLabel productTitleLbl = null;
	//产品标题输入框
	private JTextField productTitleTxt = null;
	//联系电话
	private JLabel phoneLbl = null;
	//联系电话输入框
	private JTextField phoneTxt = null;
	//关键词
	private JLabel keywordLbl = null;
	//关键词输入框
	private JTextField keywordTxt = null;
	//价格
	private JLabel priceLbl = null;
	//价格输入框
	private JTextField priceTxt = null;
	//数量
	private JLabel countLbl = null;
	//数量输入框
	private JTextField countTxt = null;
	//错误刷新
	private JLabel refreshTimeLbl = null;
	//错误刷新选择框
	private JComboBox<String> refreshTimeCombo = null;
	//发布间隔
	private JLabel publishTimeLbl = null;
	//发布间隔选择框
	private JComboBox<String> publishTimeCombo = null;
	
	private JLabel brandLbl = null;
	
	private JTextField brandTxt = null;
	
	private JLabel modelLbl = null;
	
	private JTextField modelTxt = null;
	
	private JLabel fuelLbl = null;
	
	private JTextField fuelTxt = null;
	
	private JLabel motorLbl = null;
	
	private JTextField motorTxt = null;
	
	private JLabel outputLbl = null;
	
	private JTextField outputTxt = null;
	
	private JLabel chassisLbl = null;
	
	private JTextField chassisTxt = null;
	
	private JLabel letLbl = null;
	
	private JTextField letTxt = null;
	
	private JLabel powerLbl = null;
	
	private JTextField powerTxt = null;
	
	private JLabel loadLbl = null;
	
	private JTextField loadTxt = null;
	
	private JLabel axleLbl = null;
	
	private JTextField axleTxt = null;
	
	private JLabel maxSpeedLbl = null;
	
	private JTextField maxSpeedTxt = null;
	
	private JLabel averageOilLbl = null;
	
	private JTextField averageOilTxt = null;
	
	private JLabel weightLbl = null;
	
	private JTextField weightTxt = null;
	
	private JLabel sizeLbl = null;
	
	private JTextField sizeTxt = null;
	
	private JLabel addressLbl = null;
	
	private JTextField addressTxt = null;
	
	private ImageIcon background = null;
	
	private ClearCarPane clearCar;
	
	private AshCarPane ashCar;
	
	private ColdCarPane coldCar;
	
	private DeCarPane deCar;
	
	private FireCarPane fireCar;
	
	private HijackCarPane hijackCar;
	
	private MixCarPane mixCar;
	
	private OtherCarPane otherCar;
	
	private OverheadCarPane overheadCar;
	
	private SuctionSewerCarPane suctionSewerCar;
	
	private SweepCarPane sweepCar;
	
	private TankCarPane tankCar;
	
	private WaterCarPane waterCar;
	
	private WreckerCarPane wreckerCar;
	
	private AdCarPane adCar;
	
	private TruckCarPane truckCar;
	
	private Map<Integer, MyPanel> reverseCode;
	
	private JPanel smallPigPane;
	
	private JPanel contentPigPane;
	
	private JLabel smallPigTip;
	
	private JLabel contentPigTip;
	
	private JTextArea smallPig;
	
	private JTextArea contentPig;
	
	private JPanel detailsPane;
	
	private HTMLEditorPane htmlEditorPane;
	
	private JButton publish;
	
	private JButton pause;
	
	private JButton save;
	
	private FileOperator fileOperator;
	
	private HttpClient httpClient;
	
	private PublishTimer timer;
	
	public MainWindowPane(){
		fileOperator = new FileOperator();
		httpClient = new HttpClient();
		timer = new PublishTimer(httpClient, this);
		
		clearCar = new ClearCarPane();
		ashCar = new AshCarPane();
		coldCar = new ColdCarPane();
		deCar = new DeCarPane();
		fireCar = new FireCarPane();
		hijackCar = new HijackCarPane();
		mixCar = new MixCarPane();
		otherCar = new OtherCarPane();
		suctionSewerCar = new SuctionSewerCarPane();
		overheadCar = new OverheadCarPane();
		sweepCar= new SweepCarPane();
		tankCar = new TankCarPane();
		waterCar = new WaterCarPane();
		wreckerCar = new WreckerCarPane();
		adCar = new AdCarPane();
		truckCar = new TruckCarPane();
		
		reverseCode = new HashMap<Integer, MyPanel>();
		reverseCode.put(1, waterCar);
		reverseCode.put(2, sweepCar);
		reverseCode.put(3, suctionSewerCar);
		reverseCode.put(4, deCar);
		reverseCode.put(5, ashCar);
		reverseCode.put(6, coldCar);
		reverseCode.put(7, wreckerCar);
		reverseCode.put(8, truckCar);
		reverseCode.put(9, hijackCar);
		reverseCode.put(10, fireCar);
		reverseCode.put(11, tankCar);
		reverseCode.put(12, adCar);
		reverseCode.put(13, clearCar);
		reverseCode.put(14, overheadCar);
		reverseCode.put(15, mixCar);
		reverseCode.put(16, otherCar);
		
		initPlatformChoosePane();
		initPublishPane();
		initCommonConfPane();
		initSpecialConfPane();
		initSmallPigPane();
		initContentPigPane();
		initDetailsPane();
		
		background = new ImageIcon(System.getProperty("user.dir") + "/resources/image/bg.jpg");
		
		publish = new JButton("一键发布");
		publish.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int platformId = platformChooseCombo.getSelectedIndex();
				if(platformId == 0){
					JOptionPane.showMessageDialog(MainWindowPane.this, "请先选择平台");
					platformChooseCombo.requestFocus();
					platformChooseCombo.showPopup();
					return;
				}
				int carType = carTypeCombo.getSelectedIndex();
				if(carType == 0){
					JOptionPane.showMessageDialog(MainWindowPane.this, "请选择要发布的车型");
					carTypeCombo.requestFocus();
					carTypeCombo.showPopup();
					return;
				}
				//获取选择的专用参数面板
				if(!((reverseCode.get(carType)).isLegal() && MainWindowPane.this.isLegal())){
					JOptionPane.showMessageDialog(MainWindowPane.this, "<html><body>带*的参数为必填参数<br>请填写完整再发布</body></html>");
					return;
				}
				//获取参数列表
				fileOperator.readCarInfo(platformId + "_" + carType);
				Map<String, String> names = fileOperator.getNotReadyAttr();
				Map<String, String> allAttr = fileOperator.getReadyAttr();
				Map<String, String> values = reverseCode.get(carType).getNameAndValue();
				Map<String, String> commonValues = commonConfPane.getNameAndValue();
				Set<String> keys = values.keySet();
				for(String key : keys) {
					if(names.get(key) != null && !names.get(key).equals(""))
						allAttr.put(names.get(key), values.get(key));
				}
				keys = commonValues.keySet();
				for(String key : keys)
					if(names.get(key) != null && !names.get(key).equals(""))
						allAttr.put(names.get(key), commonValues.get(key));
				//整理图片
				String images = smallPig.getText();
				String[] image = images.split("\n");
				if(image.length <= 3) {
					for(int i = 0; i < image.length; i++)
						allAttr.put(names.get(1005 + i + ""), image[i]);
				}
				else {
					JOptionPane.showMessageDialog(MainWindowPane.this, "图片至少一张最多三张，每行一张");
					return;
				}
				allAttr.put(names.get("1001"), productTitleTxt.getText());
				allAttr.put(names.get("1002"), keywordTxt.getText());
				allAttr.put(names.get("1003"), priceTxt.getText());
				allAttr.put(names.get("1004"), htmlEditorPane.getText());
				//登录并获取corpid
				String username = usernameTxt.getText();
				String password = passwordTxt.getText();
				try {
					httpClient.login(username, password, platformId);
				} catch (IOException e2) {
					JOptionPane.showMessageDialog(MainWindowPane.this, "登录出错，请检查你的网络连接是否有效");
					return;
				}
				//传入所有参数，并设置网络参数
				int time = publishTimeCombo.getSelectedIndex() * 3;
				if(time == 0)
					try {
						httpClient.publish(allAttr, platformId);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(MainWindowPane.this, "发布信息出错，请检查你设置的参数及网络连接是否有效");
						return;
					}
				else {
					timer.setIndex(platformId);
					timer.setParams(allAttr);
					timer.setTime(time);
					timer.start();
				}
				pause.setEnabled(true);
				publish.setEnabled(false);
			}
			
		});
		pause = new JButton("暂停");
		pause.setEnabled(false);
		pause.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					timer.wait();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				pause.setEnabled(false);
				publish.setEnabled(true);
			}
			
		});
		
		save = new JButton("保存为模版");
		publish.setFont(new Font("宋体", Font.PLAIN, 13));
		save.setFont(new Font("宋体", Font.PLAIN, 13));
		publish.setBounds(940, 600, 120, 30);
		save.setBounds(940, 640, 120, 30);
		
		this.setSize(1085, 900);
		this.setLayout(null);
		this.add(platformChoosePane);
		this.add(publishPane);
		this.add(commonConfPane);
		this.add(specialConfPane);
		this.add(smallPigPane);
		this.add(contentPigPane);
		this.add(detailsPane);
		this.add(publish);
		this.add(save);
	}
	
	/**
	 * 初始化所有平台参数面板的内容
	 */
	private void initPlatformChoosePane(){
		platformChooseLbl = new JLabel("*平台选择:");
		platformChooseLbl.setBounds(20, 20, 70, 20);
		platformChooseLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		
		String[] platformName = {"-请选择-", "马可波罗", "世界工厂", "慧聪网", "51搜了", "企汇网", "一呼百应"};
		platformChooseCombo = new JComboBox<String>(platformName);
		platformChooseCombo.setSelectedIndex(0);
		platformChooseCombo.setFont(new Font("宋体", Font.PLAIN, 13));
		platformChooseCombo.setBounds(90, 20, 100, 20);
		platformChooseCombo.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(platformChooseCombo.getSelectedIndex() == 0){
					JOptionPane.showMessageDialog(MainWindowPane.this, "发布平台不能为空!");
					platformChooseCombo.requestFocus();
					platformChooseCombo.showPopup();
				}
			}
			
		});
		
		usernameLbl = new JLabel("*用户名:");
		usernameLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		usernameLbl.setBounds(200, 20, 60, 20);
		
		usernameTxt = new JTextField();
		usernameTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		usernameTxt.setBounds(260, 20, 150, 20);
		
		passwordLbl = new JLabel("*密码:");
		passwordLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		passwordLbl.setBounds(420, 20, 50, 20);
		
		passwordTxt = new JTextField();
		passwordTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		passwordTxt.setBounds(470, 20, 150, 20);
		
		saveUserBtn = new JButton("保存用户");
		saveUserBtn.setFont(new Font("宋体", Font.PLAIN, 13));
		saveUserBtn.setBounds(630, 20, 90, 20);
		
		platformChoosePane = new JPanel();
		platformChoosePane.setBorder(BorderFactory.createTitledBorder("平台参数"));
		platformChoosePane.setSize(870, 50);
		platformChoosePane.setBounds(10, 5, 870, 50);
		platformChoosePane.setLayout(null);
		platformChoosePane.setOpaque(false);
		
		platformChoosePane.add(platformChooseLbl);
		platformChoosePane.add(platformChooseCombo);
		platformChoosePane.add(usernameLbl);
		platformChoosePane.add(usernameTxt);
		platformChoosePane.add(passwordLbl);
		platformChoosePane.add(passwordTxt);
		platformChoosePane.add(saveUserBtn);
	}
	
	/**
	 * 初始化所有发布面板上的控件
	 */
	private void initPublishPane(){
		carTypeLbl = new JLabel("*车型选择:");
		carTypeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		carTypeLbl.setBounds(20, 20, 70, 20);
		
		String[] carType = {"-请选择-", "洒水车", "扫路车", "吸粪车", "垃圾车", "冷藏车", "清障车", "随车吊",
				"防暴车", "消防车", "油罐车", "广告车", "高压清洗车", "高空作业车", "混凝土搅拌车", "其它专用车"};
		carTypeCombo = new JComboBox<String>(carType);
		carTypeCombo.setFont(new Font("宋体", Font.PLAIN, 13));
		carTypeCombo.setBounds(90, 20, 110, 20);
		carTypeCombo.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(carTypeCombo.getSelectedIndex() == 0){
					JOptionPane.showMessageDialog(MainWindowPane.this, "车型不能为空!");
					carTypeCombo.requestFocus();
					carTypeCombo.showPopup();
				}
			}
			
		});
		carTypeCombo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				specialConfPane.removeAll();
				if(carTypeCombo.getSelectedIndex() != 0){
					specialConfPane.add(reverseCode.get(carTypeCombo.getSelectedIndex()));
				}
				specialConfPane.repaint();
			}
			
		});
		
		productTitleLbl = new JLabel("*标题:");
		productTitleLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		productTitleLbl.setBounds(210, 20, 50, 20);
		
		productTitleTxt = new JTextField();
		productTitleTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		productTitleTxt.setBounds(260, 20, 250, 20);
		productTitleTxt.setName("1001");
		
		phoneLbl = new JLabel("联系电话:");
		phoneLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		phoneLbl.setBounds(520, 20, 70, 20);
		
		phoneTxt = new JTextField();
		phoneTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		phoneTxt.setBounds(590, 20, 90, 20);
		
		keywordLbl = new JLabel("*关键词:");
		keywordLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		keywordLbl.setBounds(20, 50, 70, 20);
		
		keywordTxt = new JTextField();
		keywordTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		keywordTxt.setBounds(90, 50, 300, 20);
		keywordTxt.setName("1002");
		
		priceLbl = new JLabel("*单价:");
		priceLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		priceLbl.setBounds(400, 50, 60, 20);
		
		priceTxt = new JTextField();
		priceTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		priceTxt.setBounds(460, 50, 70, 20);
		priceTxt.setName("1003");
		
		countLbl = new JLabel("*产品库存:");
		countLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		countLbl.setBounds(540, 50, 70, 20);
		countTxt = new JTextField();
		countTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		countTxt.setBounds(610, 50, 70, 20);
		
		refreshTimeLbl = new JLabel("错误刷新时间:");
		refreshTimeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		refreshTimeLbl.setBounds(690, 50, 90, 20);
		
		String[] refreshTime = {"仅一次", "1分钟", "5分钟"};
		refreshTimeCombo = new JComboBox<String>(refreshTime);
		refreshTimeCombo.setFont(new Font("宋体", Font.PLAIN, 13));
		refreshTimeCombo.setSelectedIndex(0);
		refreshTimeCombo.setBounds(780, 50, 70, 20);
		
		publishTimeLbl = new JLabel("发布间隔时间:");
		publishTimeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		publishTimeLbl.setBounds(690, 20, 90, 20);
		
		String[] publishTime = {"仅一次", "3分钟", "6分钟", "9分钟"};
		publishTimeCombo = new JComboBox<String>(publishTime);
		publishTimeCombo.setFont(new Font("宋体", Font.PLAIN, 13));
		publishTimeCombo.setSelectedIndex(0);
		publishTimeCombo.setBounds(780, 20, 70, 20);
		
		publishPane = new JPanel();
		publishPane.setBorder(BorderFactory.createTitledBorder("发布参数"));
		publishPane.setSize(870, 80);
		publishPane.setBounds(10, 60, 870, 80);
		publishPane.setLayout(null);
		publishPane.setOpaque(false);
		
		publishPane.add(carTypeLbl);
		publishPane.add(carTypeCombo);
		publishPane.add(productTitleLbl);
		publishPane.add(productTitleTxt);
		publishPane.add(phoneLbl);
		publishPane.add(phoneTxt);
		publishPane.add(keywordLbl);
		publishPane.add(keywordTxt);
		publishPane.add(priceLbl);
		publishPane.add(priceTxt);
		publishPane.add(countLbl);
		publishPane.add(countTxt);
		publishPane.add(refreshTimeLbl);
		publishPane.add(refreshTimeCombo);
		publishPane.add(publishTimeLbl);
		publishPane.add(publishTimeCombo);
	}
	
	private void initCommonConfPane(){
		brandLbl = new JLabel("*品牌:");
		brandLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		brandLbl.setBounds(10, 20, 100, 20);
		brandTxt = new JTextField();
		brandTxt.setName("1");
		brandTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		brandTxt.setBounds(110, 20, 150, 20);
		
		modelLbl = new JLabel("*型号:");
		modelLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		modelLbl.setBounds(10, 45, 100, 20);
		modelTxt = new JTextField();
		modelTxt.setName("2");
		modelTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		modelTxt.setBounds(110, 45, 150, 20);
		
		fuelLbl = new JLabel("燃料类型:");
		fuelLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		fuelLbl.setBounds(10, 70, 100, 20);
		fuelTxt = new JTextField();
		fuelTxt.setName("3");
		fuelTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		fuelTxt.setBounds(110, 70, 150, 20);
		
		motorLbl = new JLabel("发动机型号:");
		motorLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		motorLbl.setBounds(10, 95, 100, 20);
		motorTxt = new JTextField();
		motorTxt.setName("4");
		motorTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		motorTxt.setBounds(110, 95, 150, 20);
		
		outputLbl = new JLabel("*排量L:");
		outputLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		outputLbl.setBounds(10, 120, 100, 20);
		outputTxt = new JTextField();
		outputTxt.setName("5");
		outputTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		outputTxt.setBounds(110, 120, 150, 20);
		
		chassisLbl = new JLabel("底盘型号:");
		chassisLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		chassisLbl.setBounds(10, 145, 100, 20);
		chassisTxt = new JTextField();
		chassisTxt.setName("6");
		chassisTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		chassisTxt.setBounds(110, 145, 150, 20);
		
		letLbl = new JLabel("排放标准:");
		letLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		letLbl.setBounds(10, 170, 100, 20);
		letTxt = new JTextField();
		letTxt.setName("7");
		letTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		letTxt.setBounds(110, 170, 150, 20);
		
		powerLbl = new JLabel("额定功率kw:");
		powerLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		powerLbl.setBounds(10, 195, 100, 20);
		powerTxt = new JTextField();
		powerTxt.setName("8");
		powerTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		powerTxt.setBounds(110, 195, 150, 20);
		
		loadLbl = new JLabel("额定载重量kg:");
		loadLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		loadLbl.setBounds(10, 220, 100, 20);
		loadTxt = new JTextField();
		loadTxt.setName("9");
		loadTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		loadTxt.setBounds(110, 220, 150, 20);
		
		axleLbl = new JLabel("轴距mm:");
		axleLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		axleLbl.setBounds(10, 245, 100, 20);
		axleTxt = new JTextField();
		axleTxt.setName("10");
		axleTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		axleTxt.setBounds(110, 245, 150, 20);
		
		maxSpeedLbl = new JLabel("最高车速km/h:");
		maxSpeedLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		maxSpeedLbl.setBounds(10, 270, 100, 20);
		maxSpeedTxt = new JTextField();
		maxSpeedTxt.setName("11");
		maxSpeedTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		maxSpeedTxt.setBounds(110, 270, 150, 20);
		
		sizeLbl = new JLabel("外形尺寸m*m*m:");
		sizeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		sizeLbl.setBounds(10, 295, 100, 20);
		sizeTxt = new JTextField();
		sizeTxt.setName("12");
		sizeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		sizeTxt.setBounds(110, 295, 150, 20);
		
		averageOilLbl = new JLabel("油耗L/100km:");
		averageOilLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		averageOilLbl.setBounds(10, 320, 100, 20);
		averageOilTxt = new JTextField();
		averageOilTxt.setName("13");
		averageOilTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		averageOilTxt.setBounds(110, 320, 150, 20);
		
		addressLbl = new JLabel("车辆所在地:");
		addressLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		addressLbl.setBounds(10, 345, 100, 20);
		addressTxt = new JTextField();
		addressTxt.setName("14");
		addressTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		addressTxt.setBounds(110, 345, 150, 20);
		
		weightLbl = new JLabel("总重量kg:");
		weightLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		weightLbl.setBounds(10, 370, 100, 20);
		weightTxt = new JTextField();
		weightTxt.setName("15");
		weightTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		weightTxt.setBounds(110, 370, 150, 20);
		
		commonConfPane = new MyPanel();
		commonConfPane.setLayout(null);
		commonConfPane.setBorder(BorderFactory.createTitledBorder("通用参数"));
		commonConfPane.setBounds(10, 145, 270, 400);
		commonConfPane.setOpaque(false);
		commonConfPane.setAutoscrolls(true);
		
		commonConfPane.add(brandLbl);
		commonConfPane.add(brandTxt);
		commonConfPane.add(modelLbl);
		commonConfPane.add(modelTxt);
		commonConfPane.add(fuelLbl);
		commonConfPane.add(fuelTxt);
		commonConfPane.add(motorLbl);
		commonConfPane.add(motorTxt);
		commonConfPane.add(outputLbl);
		commonConfPane.add(outputTxt);
		commonConfPane.add(chassisLbl);
		commonConfPane.add(chassisTxt);
		commonConfPane.add(letLbl);
		commonConfPane.add(letTxt);
		commonConfPane.add(powerLbl);
		commonConfPane.add(powerTxt);
		commonConfPane.add(loadLbl);
		commonConfPane.add(loadTxt);
		commonConfPane.add(axleLbl);
		commonConfPane.add(axleTxt);
		commonConfPane.add(maxSpeedLbl);
		commonConfPane.add(maxSpeedTxt);
		commonConfPane.add(sizeLbl);
		commonConfPane.add(sizeTxt);
		commonConfPane.add(averageOilLbl);
		commonConfPane.add(averageOilTxt);
		commonConfPane.add(addressLbl);
		commonConfPane.add(addressTxt);
		commonConfPane.add(weightLbl);
		commonConfPane.add(weightTxt);
	}
	
	private void initSpecialConfPane(){
		specialConfPane = new JPanel();
		specialConfPane.setBorder(BorderFactory.createTitledBorder("专用参数"));
		specialConfPane.setBounds(290, 145, 270, 400);
		specialConfPane.setOpaque(false);
		specialConfPane.setLayout(null);
	}
	
	private void initSmallPigPane(){
		smallPigTip = new JLabel("小图片最多三张(填写图片网络地址):");
		smallPigTip.setFont(new Font("宋体", Font.PLAIN, 12));
		smallPigTip.setBounds(10, 20, 200, 20);
		smallPig = new JTextArea();
		smallPig.setName("1005");
		smallPig.setLineWrap(true);
		smallPig.setFont(new Font("宋体", Font.PLAIN, 13));
		smallPig.setBounds(10, 45, 480, 140);
		
		smallPigPane = new JPanel();
		smallPigPane.setBorder(BorderFactory.createTitledBorder("小图片"));
		smallPigPane.setBounds(570, 145, 500, 195);
		smallPigPane.setLayout(null);
		smallPigPane.setOpaque(false);
		
		smallPigPane.add(smallPigTip);
		smallPigPane.add(smallPig);
	}
	
	private void initContentPigPane(){
		contentPigTip = new JLabel("内容图片数量不限(填写图片网络地址):");
		contentPigTip.setFont(new Font("宋体", Font.PLAIN, 12));
		contentPigTip.setBounds(10, 20, 300, 20);
		contentPig = new JTextArea();
		contentPig.setLineWrap(true);
		contentPig.setFont(new Font("宋体", Font.PLAIN, 13));
		contentPig.setBounds(10, 45, 480, 140);
		
		contentPigPane = new JPanel();
		contentPigPane.setBorder(BorderFactory.createTitledBorder("内容图片"));
		contentPigPane.setLayout(null);
		contentPigPane.setOpaque(false);
		contentPigPane.setBounds(570, 345, 500, 195);
		
		contentPigPane.add(contentPigTip);
		contentPigPane.add(contentPig);
	}
	
	private void initDetailsPane(){
		detailsPane = new JPanel();
		detailsPane.setBorder(BorderFactory.createTitledBorder("产品详情"));
		detailsPane.setLayout(null);
		detailsPane.setOpaque(false);
		detailsPane.setBounds(10, 545, 920, 300);
		
		htmlEditorPane = new HTMLEditorPane();
		htmlEditorPane.setBounds(10, 20, 900, 270);
		htmlEditorPane.setName("1004");
		
		detailsPane.add(htmlEditorPane);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background.getImage(), 0, 0, 1085, 900, null);
	}
	
	
	private boolean isLegal() {
		if(usernameTxt.getText() != null && !usernameTxt.getText().equals("")
				&& passwordTxt.getText() != null && !passwordTxt.getText().equals("")
				&& productTitleTxt.getText() != null && !productTitleTxt.getText().equals("")
				&& keywordTxt.getText() != null && !keywordTxt.getText().equals("")
				&& priceTxt.getText() != null && !priceTxt.getText().equals("")
				&& countTxt.getText() != null && !countTxt.getText().equals("")
				&& brandTxt.getText() != null && !brandTxt.getText().equals("")
				&& modelTxt.getText() != null && !modelTxt.getText().equals("")
				&& outputTxt.getText() != null && !outputTxt.getText().equals("")
				&& smallPig.getText() != null && !smallPig.getText().equals(""))
			return true;
		else
			return false;
	}
}

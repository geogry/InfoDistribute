package com.geogry.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;

import com.geogry.ui.ActivateWindow;
import com.geogry.ui.MainWindow;
import com.geogry.utils.MD5;


public class Start {

	private static final String defualtActivateCode = "0000000000000000000000001";
	
	public static void main(String[] args) {
//		String phpSessId = UUID.randomUUID().toString().replace("-", "");
//		String vid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
//		BasicClientCookie2 sessionId = new BasicClientCookie2("PHPSESSID", phpSessId);
//		BasicClientCookie2 _vid = new BasicClientCookie2("_vid", vid);
//		sessionId.setDomain("china.makepolo.com");
//		_vid.setDomain("china.makepolo.com");
//		sessionId.setPath("/");
//		_vid.setPath("/");
//		HttpUtils httpUtil = new HttpUtils();
//		httpUtil.addCookie(sessionId);
//		httpUtil.addCookie(_vid);
//		List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
//		params.add(new BasicNameValuePair("username", "576909590@qq.com"));
//		params.add(new BasicNameValuePair("passwd", "wy7082391.,"));
//		params.add(new BasicNameValuePair("remember_state", "0"));
//		params.add(new BasicNameValuePair("gotourl", "http://my.b2b.makepolo.com/ucenter"));
//		httpUtil.post("http://china.makepolo.com/ucenter/login/new_login_p.php", params);
//		httpUtil.printCookies();
		/**
		 * 根据激活码是否为默认码启动相应的窗口
		 */
		File config = new File(System.getProperty("user.dir") + "/bin/config/config.cfg");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(config));
			String activateCode = reader.readLine();
			if(activateCode != null && activateCode != "" && !activateCode.equals(MD5.md5(defualtActivateCode))){
				MainWindow mainWindow = new MainWindow();
				mainWindow.show();
			} else {
				new ActivateWindow();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

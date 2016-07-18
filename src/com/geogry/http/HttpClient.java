package com.geogry.http;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie2;
import org.apache.http.message.BasicNameValuePair;


public class HttpClient {

	private HttpUtils httpUtils;
	
	private String corp_id;
	
	public void login(String username, String password, int index) throws IOException {
		httpUtils = new HttpUtils();
		if(index == 1)
			loginMKBL(username, password);
		else if(index == 2)
			loginSJGC(username, password);
		else if(index == 3)
			loginHCW(username, password);
		else if(index == 4)
			login51SL(username, password);
		else if(index == 5)
			loginQHW(username, password);
		else
			loginYHBY(username, password);
	}
	
	private void loginMKBL(String username, String password) throws IOException {
		String sessId = UUID.randomUUID().toString().replace("-", "");
		String vid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
		BasicClientCookie2 phpSessId = new BasicClientCookie2("PHPSESSID", sessId);
		phpSessId.setDomain("china.makepolo.com");
		phpSessId.setPath("/");
		BasicClientCookie2 _vid = new BasicClientCookie2("_vid", vid);
		_vid.setDomain("china.makepolo.com");
		_vid.setPath("/");
		BasicClientCookie2 integrity = new BasicClientCookie2("integrity", "71");
		integrity.setDomain("china.makepolo.com");
		integrity.setPath("/");
		httpUtils.addCookie(phpSessId);
		httpUtils.addCookie(_vid);
		httpUtils.addCookie(integrity);
		List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
		params.add(new BasicNameValuePair("username", username));
		params.add(new BasicNameValuePair("passwd", password));
		params.add(new BasicNameValuePair("gotourl", "http://my.b2b.makepolo.com/ucenter"));
		params.add(new BasicNameValuePair("remember_state", "0"));
		httpUtils.post("http://china.makepolo.com/ucenter/login/new_login_p.php", params);
		corp_id = this.getCorpId4MKBL();
	}
	
	private void loginSJGC(String username, String password) throws IOException {
		
	}
	
	private void loginHCW(String username, String password) throws IOException {
		
	}
	
	private void login51SL(String username, String password) throws IOException {
		
	}
	
	private void loginQHW(String username, String password) throws IOException {
		
	}
	
	private void loginYHBY(String username, String password) throws IOException {
		
	}
	
	public void publish(Map<String, String> params, int index) throws IOException {
		List<BasicNameValuePair> tmp = mapToList(params);
		if(index == 1)
			this.publishToMKBL(tmp);
		else if(index == 2)
			this.publishToSJGC(tmp);
		else if(index == 3)
			this.publishToHCW(tmp);
		else if(index == 4)
			this.publishTo51SL(tmp);
		else if(index == 5)
			this.publishToQHW(tmp);
		else
			this.publishToYHBY(tmp);
	}
	
	private void publishToMKBL(List<BasicNameValuePair> params) throws IOException {
		params.add(new BasicNameValuePair("corp_id", corp_id));
		httpUtils.post("http://my.b2b.makepolo.com/ucenter/product/product_add_p_new.php", params);
	}
	
	private void publishToSJGC(List<BasicNameValuePair> params) throws IOException {
		
	}
	
	private void publishToHCW(List<BasicNameValuePair> params) throws IOException {
		
	}
	
	private void publishTo51SL(List<BasicNameValuePair> params) throws IOException {
		
	}
	
	private void publishToQHW(List<BasicNameValuePair> params) throws IOException {
		
	}
	
	private void publishToYHBY(List<BasicNameValuePair> params) throws IOException {
		
	}
	
	private List<BasicNameValuePair> mapToList(Map<String, String> params) {
		Set<String> keys = params.keySet();
		List<BasicNameValuePair> tmp = new ArrayList<BasicNameValuePair>();
		for(String key : keys)
			tmp.add(new BasicNameValuePair(key, params.get(key)));
		return tmp;
	}
	
	private String getCorpId4MKBL() {
		List<Cookie> cookies = httpUtils.getCookies();
		String value = "";
		for(Cookie cookie : cookies)
			if(cookie.getName().equals("sup"))
				value = cookie.getValue();
		value = URLDecoder.decode(value);
		String[] tmp = value.split("&");
		for(int i = 0; i < tmp.length; i++)
			if(tmp[i].startsWith("uid")) {
				value = tmp[i].split("=")[1];
				break;
			}
		return value;
	}
}

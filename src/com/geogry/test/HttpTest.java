package com.geogry.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpTest {

	private URL url = null;
	private HttpURLConnection huc = null;
	
	public void login(){
		try{
			url = new URL("http://www.baidu.com");
			huc = (HttpURLConnection) url.openConnection();
			huc.setRequestProperty("User-Agent", "Internet Explorer");
			huc.setRequestProperty("Host", "www.baidu.com");
			huc.connect();
			String cookie = huc.getHeaderField("Set-Cookie");
			System.out.println(cookie);
			huc.disconnect();
			url = new URL("http://my.b2b.makepolo.com/ucenter/login/new_login_p.php");
			String strPost = "username=576909590@qq.com&password=wy7082391.,&mem_pass=on";
			huc = (HttpURLConnection) url.openConnection();
			huc.setFollowRedirects(true);
			huc.setInstanceFollowRedirects(true);
			huc.setDoOutput(true);
			huc.setDoInput(true);
			huc.setUseCaches(false);
			huc.setAllowUserInteraction(false);
			huc.setRequestMethod("POST");
			huc.addRequestProperty("Accept", "image/gif, image/x-xbitmap, image/jpeg, image/pjpeg, application/x-shockwave-flash, application/msword, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/x-silverlight, */*");
			huc.setRequestProperty("Referer", "http://my.b2b.makepolo.com/ucenter/login/login.php?tpl=mn&u=http%3A//china.makepolo.com/");
			huc.setRequestProperty("Accept-Language", "en, zh-cn; q=0.5");
			huc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			huc.setRequestProperty("Accept-Encoding", "gzip, deflate");
			huc.setRequestProperty("User-Agent", "mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; foxy/1; .net clr 2.0.50727;megaupload 1.0)");
			huc.setRequestProperty("Host", "my.b2b.makepolo.com");
			huc.setRequestProperty("Content-Length", strPost.length() + "");
			huc.setRequestProperty("Connection", "Keep-Alive");
			huc.setRequestProperty("Cache-Control", "no-cache");
			huc.setRequestProperty("Cookie", cookie);
			huc.getOutputStream().write(strPost.getBytes());
			huc.getOutputStream().flush();
			huc.getOutputStream().close();
			huc.connect();
			int code = huc.getResponseCode();
			System.out.println("code : " + code);
			String cookie0 = huc.getHeaderField("Set-Cookie");
			System.out.println(cookie0);
			InputStream urlStream = huc.getInputStream();
			BufferedInputStream buff = new BufferedInputStream(urlStream);
			Reader r = new InputStreamReader(buff, "utf-8");
			BufferedReader br = new BufferedReader(r);
			StringBuffer strHtml = new StringBuffer("");
			String strLine = null;
			while((strLine = br.readLine()) != null){
				strHtml.append(strLine + "\r\n");
			}
			System.out.println(strHtml.toString());
			huc.disconnect();
			
			/*url = new URL("http://www.baidu.com");
			huc = (HttpURLConnection) url.openConnection();
			huc.setRequestProperty("User-Agent", "Internet Explorer");
			huc.setRequestProperty("Host", "www.baidu.com");
			huc.setRequestProperty("Cookie", cookie + ";" + cookie0);
			huc.connect();
			InputStream urlStream = huc.getInputStream();
			BufferedInputStream buff = new BufferedInputStream(urlStream);
			Reader r = new InputStreamReader(buff, "gbk");
			BufferedReader br = new BufferedReader(r);
			StringBuffer strHtml = new StringBuffer("");
			String strLine = null;
			while((strLine = br.readLine()) != null){
				strHtml.append(strLine + "\r\n");
			}
			System.out.println(strHtml.toString());*/
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if(huc != null){
				huc.disconnect();
			}
		}
	}
}

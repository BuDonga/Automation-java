package com.b5m.www.B5Capi;

import java.io.IOException;
import java.net.URI;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import netscape.javascript.JSObject;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.b5m.www.Testcase.Login;

public class HttpBasic {
	public StatusLine httpCode = null;
	public String content = null;
	public Long contentLength = null;
	public URI getURI = null;
	static Logger log = Logger.getLogger(HttpBasic.class);
	/**
	 * @param url
	 * ����get���󣬽��ܲ���Ϊget��ַ
	 */
	public void Get(String url){
		CloseableHttpClient httpclient = HttpClients.createDefault();  
        try {  
            // ����httpget.    
            HttpGet httpget = new HttpGet(url);  
            getURI = httpget.getURI();  
            log.info("��ǰ����ĵ�ַ��" + getURI);
            // ִ��get����.    
            CloseableHttpResponse response = httpclient.execute(httpget);  
            try {  
                // ��ȡ��Ӧʵ��    
                HttpEntity entity = response.getEntity();  
                // ��ӡ��Ӧ״̬    
                httpCode = response.getStatusLine();  
                if (entity != null) {  
                    // ��ӡ��Ӧ���ݳ���    
                	contentLength = entity.getContentLength();  
                    // ��ӡ��Ӧ����    
                    content =  EntityUtils.toString(entity);  
                }  
            } finally {  
                response.close();  
            }  
        } catch (ClientProtocolException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            // �ر�����,�ͷ���Դ    
            try {  
                httpclient.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }
	
		
	/**
	 * �õ����ص�value
	 * @param content �����δ�����json�ַ���
	 * @param key ���ص�value����Ӧ��keyֵ
	 * @return
	 */
	public  Object GetResponse(String content, String key){
		content = "[" +content+"]";
		JSONArray array = JSONArray.fromObject(content);
		JSONObject object = JSONObject.fromObject(array.get(0));
        return object.get(key);
	}	
	
	
	
	
}
	
	
	
	


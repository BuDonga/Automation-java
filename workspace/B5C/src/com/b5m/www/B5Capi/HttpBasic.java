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
	 * 发送get请求，接受参数为get地址
	 */
	public void Get(String url){
		CloseableHttpClient httpclient = HttpClients.createDefault();  
        try {  
            // 创建httpget.    
            HttpGet httpget = new HttpGet(url);  
            getURI = httpget.getURI();  
            log.info("当前请求的地址是" + getURI);
            // 执行get请求.    
            CloseableHttpResponse response = httpclient.execute(httpget);  
            try {  
                // 获取响应实体    
                HttpEntity entity = response.getEntity();  
                // 打印响应状态    
                httpCode = response.getStatusLine();  
                if (entity != null) {  
                    // 打印响应内容长度    
                	contentLength = entity.getContentLength();  
                    // 打印响应内容    
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
            // 关闭连接,释放资源    
            try {  
                httpclient.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }
	
		
	/**
	 * 得到返回的value
	 * @param content 传入的未处理的json字符串
	 * @param key 返回的value所对应的key值
	 * @return
	 */
	public  Object GetResponse(String content, String key){
		content = "[" +content+"]";
		JSONArray array = JSONArray.fromObject(content);
		JSONObject object = JSONObject.fromObject(array.get(0));
        return object.get(key);
	}	
	
	
	
	
}
	
	
	
	


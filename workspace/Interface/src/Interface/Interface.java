package Interface;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class Interface {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		HttpClient h = new DefaultHttpClient();
		HttpGet g = new HttpGet("http://www.baidu.com");
		HttpResponse r = h.execute(g);
		HttpEntity e = r.getEntity();
		if(e!=null){
			InputStream ins = e.getContent();
			int l;
			byte[] tmp = new byte[2048];
			while ((l = ins.read(tmp))!=-1){
				System.out.println(r.getAllHeaders());
				System.out.println(r.getStatusLine().getStatusCode());
			}
		}
		
	}

}

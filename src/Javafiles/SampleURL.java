package Javafiles;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class SampleURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://vitspace.netlify.app");
            URLConnection urc = url.openConnection();
            InputStream ip = urc.getInputStream();
            int i;
            while ((i = ip.read()) != -1) {
                System.out.println((char) i);
            }
            HttpURLConnection huc= (HttpURLConnection)urc;
            for (int j = 0; j <=8 ; j++) {
                System.out.println(huc.getHeaderField(j)+"="+huc.getHeaderField(j));
                huc.disconnect();

            }




                System.out.println("protocol:" + url.getProtocol());
                System.out.println("hostname:" + url.getHost());
                System.out.println("portnumber:" + url.getPort());
                System.out.println("filename:" + url.getFile());
                System.out.println("Refer:" + url.getRef());
                System.out.println("Query:" + url.getQuery());
                System.out.println("Authority:" + url.getAuthority());
                System.out.println("path:" + url.getPath());
                System.out.println("default:" + url.getDefaultPort());
                System.out.println("code:" + url.hashCode());
                System.out.println("contenttype:"+url.openConnection().getContentType());
                System.out.println("contentlength:"+urc.getContentLength());
                System.out.println("timeout:"+urc.getConnectTimeout());
                System.out.println("expi:"+urc.getExpiration());
                System.out.println("encoded:"+urc.getContentEncoding());
                System.out.println("date:"+urc.getDate());
                System.out.println("message:"+((HttpURLConnection) urc).getResponseMessage());
                System.out.println("code:"+((HttpURLConnection) urc).getResponseCode());





            } catch(MalformedURLException e){
                throw new RuntimeException(e);
            } catch(IOException uhe){
                uhe.printStackTrace();
            }

        }
    }


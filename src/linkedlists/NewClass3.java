package linkedlists;


import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class NewClass3
{
    public static void main(String[] args) throws MalformedURLException, UnknownHostException 
    {
        URL u=new URL("http://awseb-e-a-awsebloa-14cs7ofdwu0wz-168901934.us-west-2.elb.amazonaws.com");
        InetAddress address = InetAddress.getByName(u.getHost());
        System.out.println(address.getHostAddress());

    }
    
}

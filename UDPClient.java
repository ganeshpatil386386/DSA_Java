import java.io.*;
import java.net.*;
 public class UDPClient{
 	public static void main(String [] args) throws IOException {
 	DatagramSocket Client = new DatagramSocket();
 	InetAddress add = InetAdress.getByName("localhost");
 	String str = "hello World";
 	byte[] buf = str.getBytes();
 	DatagramPacket p = new DatagramPacket(buf,buf.length,add,4160);
 	client.send(p);
 	client.close();
 	}

 }
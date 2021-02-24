import java.io.*;
import java.net.*;
public class TwoMachineclient{
public static void main(String[] args){
try{
	Socket s=new Socket("192.168.43.142",8082);
	
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	dout.writeUTF("hello server");
	dout.flush();
	dout.close();
	s.close();
}catch(Exception e)
{System.out.println(e);}
}
}

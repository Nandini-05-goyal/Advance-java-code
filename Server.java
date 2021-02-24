import java.io.*;
import java.net.*;
public class Server{
public static void main(String[] args){
try{
	ServerSocket ss=new ServerSocket(8081);
	Socket s=ss.accept();

	DataInputStream dis=new DataInputStream(s.getInputStream());
	String str=(String)dis.readUTF();
	System.out.println("Message from the client= " +str);
	ss.close();
}catch(Exception e){System.out.println(e);}
}
}

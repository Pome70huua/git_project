package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		System.out.println("--------------服务端启动--------------");
		ServerSocket  serversocket  = new ServerSocket(9999);
		System.out.println("等待客户端连接：");
		Socket  server  ;
		server = serversocket.accept();
		System.out.println("远端主机连接："+server.getLocalSocketAddress());
		 InputStream  in     = server.getInputStream();
		 int s =  in.read();
		 System.out.println((char)s);
		byte[] buf = new byte [1024];
		char[] btf = null;
		int len = in.read(); 
		String s1 = new String (btf,0,len);
		System.out.println("读取到字符串："+s1);
		if(in!=null){in.close();}
		if(btf!=null){Object clone = btf.clone();}
		if(server!=null){server.close();}

		
		
	}

}
package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
        //1.创建客户端（ 创建一个流套接字并将其连接到指定 IP 地址的指定端口号）
		Socket client = new Socket("192.168.1.112",9999);
		//2.输出流（客户端向服务端发送数据）
		 OutputStream  in   =  client.getOutputStream();
		 in.write("aabb".getBytes());
		 //4.关闭流
			InputStream is = null;
			if(is!=null){is.close();}
			if(client!=null){client.close();}

		 
	}

}
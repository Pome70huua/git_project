package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
        //1.�����ͻ��ˣ� ����һ�����׽��ֲ��������ӵ�ָ�� IP ��ַ��ָ���˿ںţ�
		Socket client = new Socket("192.168.1.112",9999);
		//2.��������ͻ��������˷������ݣ�
		 OutputStream  in   =  client.getOutputStream();
		 in.write("aabb".getBytes());
		 //4.�ر���
			InputStream is = null;
			if(is!=null){is.close();}
			if(client!=null){client.close();}

		 
	}

}
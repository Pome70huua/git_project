package day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BytesIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:/java/Hello2.txt");
		if(!file.exists()) {
			file.createNewFile();
		}else {
			System.out.println("文件已经存在！");
		}
		
		FileInputStream in2 = new FileInputStream(file);
		StringBuffer str = new StringBuffer();
		int len;
		byte[] bytes1=new byte[1024];
		while((len=in2.read(bytes1))!=-1) {
			str.append(new String(bytes1, 0, len));
		}
		System.out.println(str.toString());
	in2.close();
	}
	
}

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client
{
	public static void main(String []args)
	{
		try
		{
		Socket client=new Socket("localhost",8080);
		DataInputStream dis=new DataInputStream(client.getInputStream());
		String s=dis.readUTF();
		String str[]=s.split(" ");	
		int tong=0;
		for(int i=0;i<str.length;i++)
		tong+=Integer.parseInt(str[i]);
		System.out.print("\n Tong la : "+tong);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
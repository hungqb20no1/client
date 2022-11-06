import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String []args)
	{
		try
		{
		ServerSocket sk=new ServerSocket(8080);
		Socket client=sk.accept();
		DataOutputStream dos=new DataOutputStream(client.getOutputStream());
		int []a={8,2,6,4,3};
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<a.length;i++)
		sb.append(a[i]+" ");
		dos.writeUTF(sb.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
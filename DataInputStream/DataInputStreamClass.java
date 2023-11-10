import java.io.DataInputStream;
import java.io.IOException;
class DataInputStreamClass 
{
	public static void main(String[] args) throws IOException
	{  DataInputStream dis= new DataInputStream(System.in);
	   
		System.out.println("Enter Fno.");
		int a=Integer.parseInt(dis.readLine());
		System.out.println("Enter Sno.");
		int b=Integer.parseInt(dis.readLine());
		int c= a+b;
		System.out.println("result :"+c);

	}
}

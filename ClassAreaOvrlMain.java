import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassAreaOvrlMain 
{
	public static void main(String[] args)
	{
		int h=0,b=0;
		String typ = new String();
		BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			System.out.println("Calculate Area for (S)quare or (R)ectangle : ");
			typ=ins.readLine();
			if (typ.equals("R"))
			{
				System.out.println("Enter Height : ");
				h = Integer.parseInt(ins.readLine());
				
			}
			System.out.println("Enter Base : ");
			b = Integer.parseInt(ins.readLine());
			ClassAreaOvrl Objcao;
			if (typ.equals("R"))
				Objcao = new ClassAreaOvrl(h,b);
			else
				Objcao = new ClassAreaOvrl(b);

		} catch (IOException e) 
		{
		}	
		
		

	}
}

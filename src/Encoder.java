import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;


public class Encoder 
{
	public Encoder(String filename)
	{
		try 
		{
			Scanner fin = new Scanner(new File(filename));
			
			while(fin.hasNextLine())
			{
				String[] s = fin.nextLine().split("\t");
				
				for (int i = 1; i < s.length; i++)
				{
					this.read();
				}
			}
			
			
			fin.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void write(String plaintext)
	{
		return;
	}
	
	public List<String> read()
	{
		return null;
		
	}

}

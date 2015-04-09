import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Encoder 
{
	private static File file;
	public Encoder(String filename)
	{
		file = new File(filename);
	}
	
	public void write(String plaintext)
	{
		try
		{
			PrintWriter pw = new PrintWriter(file);
			for(char x : plaintext.toCharArray())
			{
				pw.write((char)(x - 13));
			}
			pw.append("\n");
			pw.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> read()
	{
		try
		{
			Scanner end = new Scanner(file);
			ArrayList<String> key = new ArrayList<String>();
			while(end.hasNextLine())
			{
				String s = end.nextLine();
				String k = "";
				for(char x : s.toCharArray())
				{
					k += (char)(x + 13);
				}
				key.add(k);
			}
			end.close();
			return key;
		}
		catch (FileNotFoundException a)
		{
			a.printStackTrace();
		}
		
		return null;
	}

}

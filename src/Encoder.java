import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Encoder 
{
	private File file;
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
				pw.write((char)(x - 420));
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
			Scanner fin = new Scanner(file);
			ArrayList<String> temp = new ArrayList<String>();
			while(fin.hasNextLine())
			{
				String s = fin.nextLine();
				String k = "";
				for(char x : s.toCharArray())
				{
					k += (char)(x + 13);
				}
				temp.add(k);
			}
			fin.close();
			return temp;
		}
		catch (FileNotFoundException a)
		{
			a.printStackTrace();
		}
		
		return null;
	}

}

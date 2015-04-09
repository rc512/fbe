import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


public class BackEnd {
	static TreeMap<String,List<String>> usermap = new TreeMap<String,List<String>>();
	static Encoder E = new Encoder("super secret");
	
	public static List<String>getMessages(String username)

	{
	return E.read();
		
	}
	public static void addMessage(String username,String msg)
	{
		
		List<String> messagelist = new ArrayList<String>();
		messagelist.add(msg);
		E.write(msg);
		usermap.put(username, messagelist);

	}
	public List<String>getUsers()
	
	{
		List<String> ayy = new ArrayList<String>();
		for(String key : usermap.keySet())
		{
			ayy.add(key);
		}
		return ayy;
 
	}
}
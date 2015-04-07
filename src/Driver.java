

public class Driver {
<<<<<<< HEAD
public static void main (String[] args)
{

	
}
=======
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FrontEnd();
			}
		});
	}
>>>>>>> origin/master
}

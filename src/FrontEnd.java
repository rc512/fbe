import javax.swing.Box;
import javax.swing.JFrame;


public class FrontEnd {
	//fields
	private JFrame myFrame;
	private Box myBox;
	
	//constructor
	public FrontEnd(){
		myFrame = new JFrame("FrontEnd");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(400,400);
		
		myBox = new Box(6);
		
		myFrame.add(myBox);
	}
}

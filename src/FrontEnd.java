import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FrontEnd {
	//fields
	private JFrame myFrame;
	private Box myBox;
	
	//constructor
	public FrontEnd(){
		myFrame = new JFrame("FrontEnd");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(400,400);
		
		myBox = Box.createHorizontalBox();
		
		JTextField mytext = new JTextField();
		
		JLabel mylabel = new JLabel("username");
		myBox.add(mylabel);
		
		myBox.add(mytext);
		
		myFrame.add(myBox);
		myFrame.pack();
		myFrame.setVisible(true);
	}
}

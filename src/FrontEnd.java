import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FrontEnd {
	//fields
	private JFrame myFrame;
	private Box myBox;
	private Box myBox2;
	
	//constructor
	public FrontEnd(){
		myFrame = new JFrame("FrontEnd");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(400,400);
		
		myBox = Box.createHorizontalBox();
		myBox2 = Box.createHorizontalBox();
		JTextField myuser = new JTextField();
		JTextField mypass = new JTextField();
		
		JLabel myusername = new JLabel("username");
		JLabel mypassword = new JLabel("password");
		myBox.add(myusername);
		myBox.add(myuser);
		myBox2.add(mypassword);
		myBox2.add(mypass);
		myFrame.add(myBox);
		myFrame.add(myBox2);
		myFrame.pack();
		myFrame.setVisible(true);
	}
}

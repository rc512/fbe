import java.awt.Dimension;

import javax.swing.*;

public class FrontEnd {
	//fields
	private JFrame myFrame;
	private Box myBox;
	private Box myBox2;
	
	//constructor
	public FrontEnd(){
		myFrame = new JFrame("FrontEnd");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setPreferredSize(new Dimension(600, 100));
		myFrame.setLocation(400,400);
		
		JPanel p=new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		JTextArea searchDef = new JTextArea();
		searchDef.setWrapStyleWord(true);
		myBox = Box.createHorizontalBox();
		myBox2 = Box.createHorizontalBox();
		JTextField myuser = new JTextField();
		JButton input = new JButton("Add Message");
		JButton get = new JButton("Get Messages");
		
		JLabel myusername = new JLabel("Username");
		JLabel mymessage = new JLabel("Message");
		myBox.add(myusername);
		myBox.add(myuser);
		myBox2.add(mymessage);		
		myBox2.add(searchDef);
		myBox2.add(input);
		myBox2.add(get);
		
		p.add(myBox);
		p.add(myBox2);
		
		myFrame.add(p);
		//myFrame.add(myBox2);
		myFrame.pack();
		myFrame.setVisible(true);
	}
}

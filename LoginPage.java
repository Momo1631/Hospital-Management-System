package Hospital;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
	
	
	JFrame frame=new JFrame();
	JButton loginButton=new JButton("Login");
	JTextField userIdField=new JTextField();
	JPasswordField userPasswordField =new JPasswordField();
	JLabel userIDLabel=new JLabel(" user Id: ");
	
	JLabel userpasswordlabel=new JLabel(" password : ");
	JLabel messageLabel=new JLabel("");
	 
	public LoginPage()
	{
		
		
		userIDLabel.setBounds(50,100,75,25);
		userpasswordlabel.setBounds(50,150,175,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIdField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		
		frame.add(userIDLabel);
		frame.add(userpasswordlabel);
		frame.add(messageLabel);
		frame.add(userIdField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==loginButton)
		{String userID=userIdField.getText();
		String password=String.valueOf(userPasswordField.getPassword());
		
		if (userID.equals("admin")&& password.equals("admin1"))
		{messageLabel.setForeground(Color.green);
		
			messageLabel.setText("Login successfull");
			frame.dispose();
			}
		
		else {messageLabel.setForeground(Color.red);
		messageLabel.setText("Login unsuccessfull");
		}
		}
	
				}
	}
	
	


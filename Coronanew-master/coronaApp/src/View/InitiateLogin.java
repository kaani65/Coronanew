package View;

import Controler.InitiateRegistration;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class InitiateLogin {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JButton registerButton;

	public void login(JFrame frame, JPanel panel, InitiateMainMenue mMenue, InitiateRegistration register) {

		/*
		Create image as Icon
		*/

		ImageIcon icon = new ImageIcon("/Users/drs-0507-u/Downloads/Connection-master 2/Coronanew-master/coronaApp/src/images/coronapic.png");
		JButton coronapic = new JButton("", icon);

		coronapic.setContentAreaFilled(false);
		coronapic.setBounds(90, 30, 200, 200);
		panel.add(coronapic);

		Border border = BorderFactory.createLineBorder(Color.GRAY, 2);

		userLabel = new JLabel("User");
		userLabel.setBounds(10, 450, 80, 25);
		panel.add(userLabel);

		userText = new JTextField();
		userText.setBounds(100, 450, 165, 25);
		userText.setBorder(border);
		panel.add(userText);

		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 500, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 500, 165, 25);
		passwordText.setBorder(border);
		panel.add(passwordText);

		registerButton = new JButton("Register");
		registerButton.setBackground(Color.GRAY);
		registerButton.setBounds(200,550,100,45);
		registerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				frame.setVisible(false);
				register.registerUser(panel,frame,null);
			}
		});
		panel.add(registerButton);

		button = new JButton("Login");
		button.setBackground(Color.pink);
		button.setBounds(60, 550, 100, 45);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String user = userText.getText();
				String password = passwordText.getText();

				System.out.println(user + "," + password);

				if (user.equals("test") && password.equals("test")) {
					success.setText("Welcome " + user);
					panel.removeAll();
					frame.setVisible(false);
					mMenue.mainMenue(frame, panel, null);
				} else {
					success.setText("Invalid Username or Password");
				}
			}
		});
		panel.add(button);

		success = new JLabel("");
		success.setBounds(10, 580, 300, 25);
		panel.add(success);

		frame.setVisible(true);
	}

}

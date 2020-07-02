
package coronaApp;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controler.InitiateRegistration;
import Model.OracleDsSingleton;
import Model.Person;
import Controler.PersonDAO;
import View.InitiateLogin;
import View.InitiateMainMenue;
import View.InitiateSearch;

public class Application {


	public static void main(String[] args) {
		
		JScrollPane scrollPane = new JScrollPane();
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		InitiateMainMenue mMenue =  new InitiateMainMenue();
		InitiateLogin alogin = new InitiateLogin();
		JLabel label = new JLabel();
		OracleDsSingleton ora = OracleDsSingleton.getInstance();
        PersonDAO P = new PersonDAO();
        Person PP = new Person();
        InitiateSearch iSearch = new InitiateSearch();
		InitiateRegistration iRegister = new InitiateRegistration();



		scrollPane.setBounds(5,5,00,200);

		frame.add(scrollPane);
		frame.setSize(375, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(scrollPane);
		frame.add(panel);



		scrollPane.setBackground(Color.WHITE);
		scrollPane.setLayout(null);
		scrollPane.setVisible(false);

		
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);

		alogin.login(frame, panel, mMenue,iRegister);



	}


}

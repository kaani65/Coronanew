package View;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.awt.Desktop;

import  Controler.*;
import  coronaApp.*;
import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class InitiateSearch{

	private static JButton newestNumbers;
	private static JButton staySafe;
	private static JLabel success;
	private static ImageIcon icon;
	private static JTextField coronaSearchfield;
	private static JButton SearchButton;
	private static ImageIcon warn;


	public InitiateSearch() {}

	public void InitiateSearch(JFrame frame, JPanel panel) {
		frame.setVisible(true);
	}

	public void createSearchB(JPanel panel, int nummer, Person person){
		int spacing = 60;
		spacing = spacing*(nummer-1);
		SearchButton = new JButton(person.getVorname()+" "+person.getName());
		SearchButton.setBounds(5, 20+spacing, 80, 25);
		SearchButton.setSize(350,60);
		boolean infi = (person.getInfiziert().equals("ja"));
		System.out.println(infi);
		if(infi){SearchButton.setBackground(Color.RED);}
		else {SearchButton.setBackground(Color.GREEN);}
		panel.add(SearchButton);
		SearchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (person.getInfiziert().equals("ja")) {
					ImageIcon warn = new ImageIcon("/Users/drs-0507-u/Downloads/Connection-master 2/Coronanew-master/coronaApp/src/images/warning.png");
					JButton warning = new JButton("", warn);
					warning.setBounds(10, 10, 10, 10);

					int result = JOptionPane.showConfirmDialog(null, "Have you been near " + person.getVorname() + " " + person.getName() + " ?",
							"Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, warn);
					if (result == JOptionPane.YES_OPTION) {
						Desktop browser = Desktop.getDesktop();
						try {
							browser.browse(new URI("http://covapp.charite.de"));
						} catch (IOException err) {

						} catch (URISyntaxException err) {

						}
					} else if (result == JOptionPane.NO_OPTION) {
						System.out.println("No Selected");
					}
					System.out.println("Test");
				}else if(person.getInfiziert().equals("nein")) {
					System.out.println("Keine Gefahr");
				}
			}

		});


	}

}

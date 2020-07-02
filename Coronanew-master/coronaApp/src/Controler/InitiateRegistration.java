package Controler;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.*;
import javax.swing.*;
import javax.swing.border.Border;

public class InitiateRegistration{

    private static JButton backButton;
    private static JButton registerButton;

    private static JLabel newUser;
    private static JLabel nameLabel;

    private static JTextField userNameTextField;
    private static JLabel userName;
    private static JTextField userPasswordTextField;
    private static JLabel userPassword;
    private static JTextField nameTextfield;
    private static JLabel vornameLabel;
    private static JTextField vornameTextfield;
    private static JLabel strasseLabel;
    private static JTextField strasseTextfield;
    private static JLabel plzLabel;
    private static JTextField plzTextfield;
    private static JLabel ortLabel;
    private static JTextField ortTextfield;
    private static JLabel landLabel;
    private static JTextField landTextfield;
    private static JLabel infectLabel;
    private static JRadioButton infect;


    public void registerUser(JPanel panel, JFrame frame, InitiateLogin alogin) {

        frame.setVisible(true);

        newUser = new JLabel("New User");
        newUser.setFont(new Font("Serif", Font.BOLD,32));
        newUser.setBounds(120, 40, 500, 32);
        panel.add(newUser);

        Border border = BorderFactory.createLineBorder(Color.GRAY, 2);

        userName = new JLabel("Username: ");
        userName.setBounds(20, 100, 80, 25);
        panel.add(userName);

        userNameTextField = new JTextField();
        userNameTextField.setBounds(100, 100, 165, 25);
        userNameTextField.setBorder(border);
        panel.add(userNameTextField);

        userPassword = new JLabel("Passwort: ");
        userPassword.setBounds(20, 140, 80, 25);
        panel.add(userPassword);

        userPasswordTextField = new JTextField();
        userPasswordTextField.setBounds(100, 140, 165, 25);
        userPasswordTextField.setBorder(border);
        panel.add(userPasswordTextField);

        vornameLabel = new JLabel("Vorname: ");
        vornameLabel.setBounds(20, 200, 80, 25);
        panel.add(vornameLabel);

        vornameTextfield = new JTextField();
        vornameTextfield.setBounds(100, 200, 165, 25);
        vornameTextfield.setBorder(border);
        panel.add(vornameTextfield);

        nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(20, 240, 80, 25);
        panel.add(nameLabel);

        nameTextfield = new JTextField();
        nameTextfield.setBounds(100, 240, 165, 25);
        nameTextfield.setBorder(border);
        panel.add(nameTextfield);

        strasseLabel = new JLabel("Straße: ");
        strasseLabel.setBounds(20, 280, 80, 25);
        panel.add(strasseLabel);

        strasseTextfield = new JTextField();
        strasseTextfield.setBounds(100, 280, 165, 25);
        strasseTextfield.setBorder(border);
        panel.add(strasseTextfield);

        plzLabel = new JLabel("PLZ: ");
        plzLabel.setBounds(20, 320, 80, 25);
        panel.add(plzLabel);

        plzTextfield = new JTextField();
        plzTextfield.setBounds(100, 320, 165, 25);
        plzTextfield.setBorder(border);
        panel.add(plzTextfield);

        ortLabel = new JLabel("Ort: ");
        ortLabel.setBounds(20, 360, 140, 25);
        panel.add(ortLabel);

        ortTextfield = new JTextField();
        ortTextfield.setBounds(100, 360, 165, 25);
        ortTextfield.setBorder(border);
        panel.add(ortTextfield);

        landLabel = new JLabel("Land: ");
        landLabel.setBounds(20, 400, 80, 25);
        panel.add(landLabel);

        landTextfield = new JTextField();
        landTextfield.setBounds(100, 400, 165, 25);
        landTextfield.setBorder(border);
        panel.add(landTextfield);

        infectLabel = new JLabel("Bist du auf Covid19 positiv getestet worden?");
        infectLabel.setBounds(20, 440, 280, 25);
        panel.add(infectLabel);

        infect = new JRadioButton("Ja");
        infect.setBounds(80,500,20,20);
        infect.setBorder(border);
        panel.add(infect);

        backButton = new JButton("Zurück");
        backButton.setBackground(Color.GRAY);
        backButton.setBounds(60, 550, 100, 45);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                frame.setVisible(false);
                alogin.login(null,null,null,null);

            }

        } );
        panel.add(backButton);

        registerButton = new JButton("Registrieren");
        registerButton.setBackground(Color.CYAN);
        registerButton.setBounds(200,550,100,45);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(registerButton);
    }

}

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class GUIex implements ActionListener {
    JFrame frame;
    final private Font mainFont = new Font("Trebuchet MS", Font.BOLD, 18);

    JLabel nameLabel = new JLabel("Name:");
    JTextField nameTextField = new JTextField();
    JLabel addressLabel = new JLabel("Address:");
    JTextField addressTextField = new JTextField();
    JLabel emailLabel = new JLabel("Email:");
    JTextField emailTextField = new JTextField();
    JLabel birthLabel = new JLabel("Date of Birth:");
    JTextField birthTextField = new JTextField();
    JLabel titleLabel = new JLabel("User Registration");
    JButton submitButton = new JButton("Submit");
    JButton cancelButton = new JButton("Cancel");
    
    GUIex(){
        createWindow();
        setLocationandSize();
        addComponentsToFrame();
    }

    public void createWindow(){
        frame=new JFrame();

        
        frame.setTitle("User Registration");
        frame.setBounds(150,150,500,350);
        frame.getContentPane().setBackground(Color.white);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);  
    }

    public void setLocationandSize(){
        titleLabel.setBounds(178, 25, 250, 20);
        nameLabel.setBounds(75,50,100,50);
        nameTextField.setBounds(235, 63, 165, 23);
        addressLabel.setBounds(75,90,100,50);
        addressTextField.setBounds(235, 104, 165, 23);
        emailLabel.setBounds(75,130,100,50);
        emailTextField.setBounds(235, 142, 165, 23);
        birthLabel.setBounds(75,170,150,50);
        birthTextField.setBounds(235, 182, 165, 23);
        submitButton.setBounds(75,250,100,23);
        cancelButton.setBounds(300, 250, 100, 23);

    }

    public void addComponentsToFrame(){
        frame.add(titleLabel);
        titleLabel.setFont(mainFont);
        frame.add(nameLabel);
        nameLabel.setFont(mainFont);
        frame.add(nameTextField);
        frame.add(addressLabel);
        addressLabel.setFont(mainFont);
        frame.add(addressTextField);
        frame.add(emailLabel);
        emailLabel.setFont(mainFont);
        frame.add(emailTextField);
        frame.add(birthLabel);
        birthLabel.setFont(mainFont);
        frame.add(birthTextField);
        frame.add(submitButton);
        submitButton.setFont(mainFont);
        frame.add(cancelButton);
        cancelButton.setFont(mainFont);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
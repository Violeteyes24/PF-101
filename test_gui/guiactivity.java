import java.awt.*; // panel
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton; // JButton, J label and so on... 

public class guiactivity {

     public static void main(String[] args) {

        // Added frame
        Frame f = new Frame("User Registration");
        f.setSize(700, 700);
        f.setLocation(500, 120);
        
        // Add a WindowListener to handle the close button click
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent close) {
                f.dispose(); // Close the frame
            }
        });

        Panel panel1 = new Panel();

        Label alabel = new Label("Email");
        alabel.setAlignment(Label.LEFT);

        TextField emailTextField = new TextField();
        TextField passwordTextField = new TextField();
        passwordTextField.setEchoChar('*');

        String userEmail = emailTextField.getText();
        String userpassword = passwordTextField.getText();

        panel1.add(alabel);
        panel1.add(emailTextField);
        panel1.add(passwordTextField);

        f.setVisible(true);


    
    }
}

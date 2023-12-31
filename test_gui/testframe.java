import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;

public class testframe {
    public static void main(String[] args) {

        // Added frame
        Frame frame1 = new Frame("Hello World");
        frame1.setSize(500, 300);
        frame1.setLocation(500, 120);
        
        // Add a WindowListener to handle the close button click
        frame1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent close) {
                frame1.dispose(); // Close the frame
            }
        });

        frame1.setVisible(true);
        
        // added label I think it automatically labels the first panel
        Label alabel = new Label("Would you like to go out with me? ");
        alabel.setAlignment(Label.LEFT);

        // added panel inside frame
        Panel apanel = new Panel();
        Button okButton = new Button("Yes");
        Button cancelButton = new Button("yes please");
        
        // added list
        List alist = new List();
        alist.add("String 1");
        alist.add("List of strings?");  
        alist.add("Where");  
        alist.add("Do ");  
        alist.add("You wanna eat?");  

        //checkbox
        Checkbox creamCheckbox = new Checkbox("Cream");
        Checkbox cheeseCheckbox = new Checkbox("Cheese");

        // choice
        Choice aChoice = new Choice();
        aChoice.add("gamedev");
        aChoice.add("webdev");
        aChoice.add("appdev");
        aChoice.add("AI/ML");
        aChoice.add("Cloud Engineering");
        aChoice.add("Manager");

        TextField emailTextField = new TextField();
        TextField passwordTextField = new TextField();
        passwordTextField.setEchoChar('*');

        String userEmail = emailTextField.getText();
        String userpassword = passwordTextField.getText();

        TextArea txtarea = new TextArea(5, 50);
        String txt = txtarea.getText();

         // nvm, here is the chronological order for everything
        apanel.add(alabel);
        apanel.add(okButton);
        apanel.add(cancelButton);
        apanel.add(alist);
        apanel.add(creamCheckbox);
        apanel.add(cheeseCheckbox);
        apanel.add(aChoice);
        apanel.add(emailTextField);
        apanel.add(passwordTextField);
        apanel.add(txtarea);
        // called the panel from frame
        frame1.add(apanel);

        Frame frame2 = new Frame("Hello Bitch");
        frame2.setSize(400, 300);
        frame2.setLocation(1000, 120);
        
        // Add a WindowListener to handle the close button click
        frame2.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent close) {
                frame2.dispose(); // Close the frame
            }
        });
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        
        frame2.add(b1);
        frame2.add(b2);
        frame2.add(b3);
        frame2.add(b4);
        frame2.add(b5);
        
        frame2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame2.setSize(300,200);
        frame2.setVisible(true);

    }
}

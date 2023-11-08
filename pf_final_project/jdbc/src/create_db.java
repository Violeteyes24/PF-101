import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*; // for gui, usually Jlabel, Jtexfield, access to its built in methods
import java.awt.event.*; // Action Listener
import java.awt.*; // font, maint font and color

public class create_db {
    static final String DB_URL = "jdbc:mysql://localhost:3307";
    static final String USER = "root";
    static final String PASS = "";
    public static void main(String[] args){

        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmnt = conn.createStatement();)
        
        {
            String sql = "CREATE DATABASE dmid";
            stmnt.executeUpdate(sql);
            System.out.println("Database created succesfully...");
        } catch(SQLException e){
            e.printStackTrace();
        }

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
    }
}

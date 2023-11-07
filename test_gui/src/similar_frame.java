import javax.swing.*; // for gui, usually Jlabel, Jtexfield, access to its built in methods
import java.awt.event.*; // Action Listener
import java.awt.*; // font, maint font and color

public class similar_frame implements ActionListener { // class that implements action listener, easier to pass parameters
    JFrame f; // declaring Jframe
    final private Font mainFont = new Font("Trebuchet MS", Font.BOLD, 18);
    // assigning font in final, it is like constant in C
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
    // creating labels and text fields, as well as buttons
    similar_frame(){ // constructor which stores all functions
        createWindow(); 
        setLocationandSize();
        addComponentsToFrame();
    }

    public void createWindow(){
        f=new JFrame();

        f.setTitle("User Registration");
        f.setBounds(150,150,500,350);
        f.getContentPane().setBackground(Color.lightGray);
        f.getContentPane().setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);  
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
        f.add(titleLabel);
        titleLabel.setFont(mainFont);
        f.add(nameLabel);
        nameLabel.setFont(mainFont);
        f.add(nameTextField);
        f.add(addressLabel);
        addressLabel.setFont(mainFont);
        f.add(addressTextField);
        f.add(emailLabel);
        emailLabel.setFont(mainFont);
        f.add(emailTextField);
        f.add(birthLabel);
        birthLabel.setFont(mainFont);
        f.add(birthTextField);
        f.add(submitButton);
        submitButton.setFont(mainFont);
        f.add(cancelButton);
        cancelButton.setFont(mainFont);
    }

    public static void main(String[] args){
        
        similar_frame gui = new similar_frame();
        // created object and caller, expected to execute the whole object.
    }

    @Override
    public void actionPerformed(ActionEvent e) { // needed to run code, automated by quick fix on vscode
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
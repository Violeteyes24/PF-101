import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class testframe {
    public static void main(String[] args) {

        // Added frame
        Frame frame1 = new Frame("Hello World");
        frame1.setSize(500, 300);
        frame1.setLocation(500, 120);
        
        // Add a WindowListener to handle the close button click
        frame1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame1.dispose(); // Close the frame
            }
        });

        frame1.setVisible(true);

        // added panel inside frame
        Panel apanel = new Panel();
        Button okButton = new Button("Ok");
        Button cancelButton = new Button("Cancel");

        Label alabel = new Label("Would you like to go out with me? ");
        alabel.setAlignment(Label.RIGHT);
        
        apanel.add(alabel);
        apanel.add(okButton);
        apanel.add(cancelButton);
        // called the panel from frame
        frame1.add(apanel);
    }
}

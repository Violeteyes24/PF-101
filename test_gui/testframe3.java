import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class testframe3 {

    public static void main (String[]args){

        Frame frame3 = new JFrame("Need title");
        frame3.setLocation(700, 200);
        frame3.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent close) {
                frame3.dispose(); // Close the frame
            }
        });

        JButton c1 = new JButton("NORTH");
        JButton c2 = new JButton("SOUTH");
        JButton c3 = new JButton("EAST");
        JButton c4 = new JButton("WEST");
        JButton c5 = new JButton("CENTER");
        
        frame3.add(c1,BorderLayout.NORTH);
        frame3.add(c2,BorderLayout.SOUTH);
        frame3.add(c3,BorderLayout.EAST);
        frame3.add(c4,BorderLayout.WEST);
        frame3.add(c5,BorderLayout.CENTER);

        // frame3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame3.setSize(300,300);
        frame3.setVisible(true);
    }
}

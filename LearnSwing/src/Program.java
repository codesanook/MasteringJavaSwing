import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program {

	public static void main(String[] args) {
	final	JFrame frame =new JFrame("Hello world");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		frame.setVisible(true);
		
	
	frame.addWindowListener( new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent we) {
            showDialog(frame);
            System.exit(0);
        }
    } );
	
	}
	
	 // The method we wish to call on exit.
    public static void showDialog(Component c) {
        JOptionPane.showMessageDialog(c, "Bye Bye!");
    }

}

//add on exit event
//http://stackoverflow.com/questions/7073412/awt-window-close-listener-event

//how to write java listener
//http://docs.oracle.com/javase/tutorial/uiswing/events/windowlistener.html
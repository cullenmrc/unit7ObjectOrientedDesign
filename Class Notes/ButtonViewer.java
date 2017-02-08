import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This class demonstrates how to install an action listener.
 * 
 * @author gcschmit
 * @version 8 February 2017
 */
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;
    
    public static void main( String[] args )
    {
        // 1. define and setup the UI components
        JFrame frame = new JFrame();
        JButton button = new JButton( "Click me!" );
        frame.add( button );
        
        // 2. create listener object
        ActionListener listener = new ClickListener();
        
        // 3. register listener object with component that generates the event
        button.addActionListener( listener );
        
        // configure and show the frame (i.e., window)
        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}






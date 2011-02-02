import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class ProblemOne extends JFrame
{
    JButton button;
    String buttons_label="0";

    public static int getNumber( String in )
    {
        try
        {
            int ret_val = Integer.parseInt( in );
            return ret_val;
        }
        catch( NumberFormatException e )
        {
            JOptionPane.showMessageDialog( null, "Cannot convert " + in + " to int, exiting...");
            System.exit( 1 );
        }
        return -1;
    }

    public ProblemOne()
    {
        // GUI init
        setSize( new Dimension( 400,200 ));
        setVisible( true );
        setLayout( new FlowLayout());
        
        // creating controls
        button = new JButton( buttons_label );
        add ( button );

        // event listeners
        button.addActionListener( new ActionListener() 
        {
            public void actionPerformed( ActionEvent e )
            { 
                button.setText( Integer.toString( getNumber( button.getText())+1 ));
            }
        });

    }

    public static void main( String[] args ) 
    {
        new ProblemOne();
    }
}

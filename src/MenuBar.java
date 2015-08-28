import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class MenuBar extends JFrame
{
    Clock funClock;
    private final int FRAME_HEIGHT       = 400;
    private final int FRAME_WIDTH        = 400;
   
    //////////////////////////////////////////////////
    //
    //             DEFAULT CONSTRUCTOR
    // DESCRIPTION: contructor taking in parameter 
    // of clock class: okClock. Method sets title, 
    // creates a new menuFrame object called menuFrame.
    // Adds File() and Show() methods to menuFrame.
    //
    //////////////////////////////////////////////////
    public MenuBar(Clock okClock)
    {
   
       funClock = okClock;
       setTitle("It's About Time!");
       JMenuBar menuFrame = new JMenuBar();
       menuFrame.add(File());
       menuFrame.add(Show());
       setJMenuBar(menuFrame);

    }
    //////////////////////////////////////////////////
    //
    // METHOD: File()
    // DESCRIPTION: creates file menu titled File adds
    // method FileExit() to menu.
    //
    //////////////////////////////////////////////////
    public JMenu File()
    {
        JMenu menu = new JMenu("File");
        menu.add(FileExit());
        return menu;
    }
    //////////////////////////////////////////////////
    //
    // METHOD: FileExit
    // DESCRIPTION: creates a new JMenuItem, titled
    // "Exit", and new ActionListener named listener.
    // Class MenuItemListener implements 
    // ActionListener which allows progrom to end
    //////////////////////////////////////////////////
    public JMenuItem FileExit()
    {
        JMenuItem item = new JMenuItem("Exit");
         class MenuItemListener implements ActionListener
         {
            public void actionPerformed(ActionEvent event)
            {
            System.exit(0);
            }
         }
        ActionListener listener = new MenuItemListener();
        item.addActionListener(listener);
        return item;
        
    }
    //////////////////////////////////////////////////
    //
    // METHOD: Show()
    // DESCRIPTION: creats a new JMenu titled "Show",
    // adds methods SecOn() and SecOff()
    //
    //////////////////////////////////////////////////
    public JMenu Show()
    {
        JMenu menu = new JMenu("Show");
        menu.add(SecOn());
        menu.add(SecOff());
        return menu;
    }
    //////////////////////////////////////////////////
    //
    // METHOD: SecOn()
    // DESCRIPTION: creates new JMenuItem titled
    // "Seconds on". Class MenuItemListener has class
    // actionPerformed, taking in parameter event. calls
    // class setVisible() from clock class. 
    //
    //////////////////////////////////////////////////
    public JMenuItem SecOn()
    {
        JMenuItem item = new JMenuItem("Seconds On");
        class MenuItemListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                funClock.setVisible();
            }
        }
             ActionListener listener = new MenuItemListener();
        item.addActionListener(listener);
        return item;
        
     }
    //////////////////////////////////////////////////
    //
    // METHOD: SecOff()
    // DESCRIPTION: creates new JMenuItem titled
    // "Seconds off". Class MenuItemListener has class
    // actionPerformed, taking in parameter event. calls
    // class setInvisible() from clock class. 
    //
    //////////////////////////////////////////////////
     public JMenuItem SecOff()
     {
         JMenuItem item = new JMenuItem("Seconds Off");
         class MenuItemListener implements ActionListener
         {
            public void actionPerformed(ActionEvent event)
            {
                funClock.setInvisible();
            }
        }
        ActionListener listener = new MenuItemListener();
        item.addActionListener(listener);
        return item;
     }
}


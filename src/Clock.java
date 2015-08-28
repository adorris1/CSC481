
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Font;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;
public class Clock extends JComponent{
	public static final int TOP = 0; //distance from top border
    public static final int LEFT = 0; //distance from left border
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;
    
    public static final int HOFFSET = (HEIGHT)/2;
    public static final int VOFFSET = (WIDTH)/2;
    
    public static final double TOTAL_PERCENT = 100;
    public static final double RADIUS = 20;
    public static final double TWO_PI = 2.0 * Math.PI;
    
    public static final int MINUTE_HAND_RADIUS = 110;
    public static final int HOUR_HAND_RADIUS = 83;
    public static final int SECOND_HAND_RADIUS = 120;
    
    public static final double HALF_PI = Math.PI/2;
    public static final double MINS_PER_HOUR = 60;
    
    public boolean secondHandVisible; 
    //////////////////////////////////////////////////
    //
    // clock:
    //constructor calls start() method to start
    // clock timer. Initializes boolean variable to
    // false.
    //
    //////////////////////////////////////////////////
    public Clock()
    {
        start();
        secondHandVisible= false;
        
    }
    //////////////////////////////////////////////////
    //
    // METHOD: setVisible()
    // DESCRIPTION: sets boolean variable secondHandVisible
    // to true.
    //
    //////////////////////////////////////////////////
    public void setVisible()
    {
        secondHandVisible = true;
       
    }
    //////////////////////////////////////////////////
    //
    // METHOD: setInvisible()
    // DESCRIPTION: sets boolean variable secondHandVisible
    // to false.
    //
    //////////////////////////////////////////////////
    public void setInvisible()
    {
        secondHandVisible = false;
    }
    //////////////////////////////////////////////////
    //
    // METHOD: paintComponent 
    // DESCRIPTION: takes in parameter g of type Graphics.
    // Using the Graphics class to create an image of a 
    // clock that shows current time and ticks accordingly
    //
    //////////////////////////////////////////////////
    public void paintComponent(Graphics g)
             
    {
    Graphics2D g2 = (Graphics2D)g;
    g2.setColor(Color.BLACK);
    
    Ellipse2D.Double circle = new Ellipse2D.Double(TOP, LEFT,WIDTH,HEIGHT);
   
    g2.draw(circle);
    g2.setColor(Color.black);
    Font stringFont = new Font( "SansSerif", Font.BOLD, 24 );
    g2.setFont( stringFont );
    g2.drawString("12", 140, 20);
    g2.drawString("1", 220, 50);
    g2.drawString("2", 260, 95);
    g2.drawString("10", 20, 95);
    g2.drawString("11", 70, 50);
    g2.drawString("6", 145, 290);
    g2.drawString("3", 280, 160);
    g2.drawString("4", 260, 225);
    g2.drawString("9", 10, 160);
    g2.drawString("8", 20, 225);
    g2.drawString("5", 220, 275);
    g2.drawString("7", 70, 275);
    Point2D.Double center = new Point2D.Double( (HEIGHT+LEFT+LEFT)/2, 
            (WIDTH +TOP+TOP)/2);
    GregorianCalendar currentTime = new GregorianCalendar();
    //get current second minute and hour
    int seconds = currentTime.get(Calendar.SECOND);
    int minutes = currentTime.get(Calendar.MINUTE);
    int hours   = currentTime.get(Calendar.HOUR);
    
    //changing seconds and minutes to double variables
    double dMinute = (minutes * 1.0);
    double dHour = (hours * 1.0);
   
    
    double percent_of_60secs = seconds/60.0;
    double percent_of_60mins = dMinute/60.0;
    double percent_of_12hours = dHour/12.0;
    
    double x = Math.cos(TWO_PI * percent_of_60secs - HALF_PI) * SECOND_HAND_RADIUS + HOFFSET;
    double y = Math.sin(TWO_PI * percent_of_60secs - HALF_PI) * SECOND_HAND_RADIUS + VOFFSET;
    
    double xMinute = Math.cos(TWO_PI* percent_of_60mins -HALF_PI) *MINUTE_HAND_RADIUS  + HOFFSET;
    double yMinute = Math.sin(TWO_PI* percent_of_60mins -HALF_PI) *MINUTE_HAND_RADIUS+ VOFFSET;
    
    double xHour = Math.cos(TWO_PI* percent_of_12hours -HALF_PI)*HOUR_HAND_RADIUS+ HOFFSET;
    double yHour = Math.sin(TWO_PI* percent_of_12hours -HALF_PI)*HOUR_HAND_RADIUS+ VOFFSET;
    
    Point2D.Double pS = new Point2D.Double(x,y);
    Point2D.Double pM = new Point2D.Double(xMinute, yMinute);
    Point2D.Double pH = new Point2D.Double(xHour, yHour);
    
    Line2D.Double secondHand = new Line2D.Double(pS, center);
    Line2D.Double minuteHand = new Line2D.Double(pM, center);
    Line2D.Double hourHand = new Line2D.Double(pH, center);
    
   
    g2.setColor(Color.black);
    g2.draw(minuteHand);
    g2.setColor(Color.black);
    g2.draw(hourHand);
       if(secondHandVisible)
	{
            g2.setColor(Color.RED);
            g2.draw(secondHand); 
        }
    }
    //////////////////////////////////////////////////
    //
    // METHOD: start()
    // DESCRIPTION: calls predifined class: repaint 
    // declares and initializes a new timer object called
    // listener
    //
    //////////////////////////////////////////////////
    public void start()
    {
        class EventTimer implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
                {
                    repaint();
                }
        }
    EventTimer listener = new EventTimer();
    
    Timer t = new Timer(1000, listener);
    t.start();
    }
   
    

}

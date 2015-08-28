import javax.swing.JFrame;

public class mainTimeClass {

	public static void main(String[] args) {
		 Clock clockComponent    = new Clock();
	       JFrame frame            = new MenuBar(clockComponent);
	       
	       frame.setSize(500, 500);
	       frame.add(clockComponent);
	       frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setVisible(true);
	    }
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 500;
	}


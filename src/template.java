//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JComboBox;
//import java.util.Arrays;
//
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.events.SelectionListener;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.widgets.Combo;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Label;
//import org.eclipse.swt.widgets.Shell;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//public class template extends JFrame {
//	Display d = new Display();
//	Shell s = new Shell(d);
//   JPanel contentPane;
//   JLabel jlbPicture;
//	public template() {
//		init();
//		 s.setLayout(new GridLayout(2, false));
//		    
//		    (new Label(s, SWT.NULL)).setText("Select the actions you wish to make: ");
//		    
//		s.setText("Newspaper Delivery Service");
//		String[] actions= {"Add Customer", "Delete Customer", "Edit Customer", "Print Delivery List", "Print Delivery Summary"};
//		JComboBox comboBoxChooseAction = new JComboBox(actions);
//		comboBoxChooseAction.setSelectedIndex(4);
//		comboBoxChooseAction.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JComboBox jcmbType = (JComboBox) e.getSource();
//				int cmbType = jcmbType.getSelectedItem();
//				if(cmbType==0)
//				{
//					
//				}
//			}
//		});
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		Arrays.sort(actions);
//		
//		for(int i = 0; i< actions.length; i++)
//		{
//			comboBoxChooseAction.addItem(actions[i]);
//		}
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
//		contentPane.add(comboBoxChooseAction, BorderLayout.CENTER);
//	}
//	
//public void callSelectedAction(int index)
//{
//	
//}
//
//}

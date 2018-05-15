package demo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Content extends JSplitPane {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -571268537018552975L;
	JPanel topPanel;
	JPanel bottomPanel;
	demo.Controller controller = new Controller();
	
	Content(){
		setBounds(100, 100, 600, 600);
		setOrientation(JSplitPane.VERTICAL_SPLIT);
		
		setDividerSize(0);

		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.add(new Label("Demo file"));
		
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(5, 5));
		for(int i = 0; i<5*5; ++i)
			bottomPanel.add(new JButton(Integer.valueOf(i).toString()));
		
		setTopComponent(topPanel);
		setBottomComponent(bottomPanel);
					
		this.setFocusable(true);
		this.requestFocus();
		this.addKeyListener(controller);
		
		
	}

}

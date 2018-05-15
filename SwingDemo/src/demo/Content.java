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

public class Content extends JSplitPane implements KeyListener {
	
	JPanel topPanel;
	JPanel bottomPanel;
	
	Content(){
		setBounds(100, 100, 600, 600);
		setOrientation(JSplitPane.VERTICAL_SPLIT);
		setEnabled(false);
		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.add(new Label("Demo file"));
		
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(5, 5));
		for(int i = 0; i<5*5; ++i)
			bottomPanel.add(new JButton(Integer.valueOf(i).toString()));
		
		setTopComponent(topPanel);
		setBottomComponent(bottomPanel);
		
		this.addKeyListener(this);
		
		setFocusable(true);
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Megnyomtad a " + arg0.getKeyCode() + " Gombot");
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Megnyomtad a " + arg0.getKeyCode() + " Gombot");

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Megnyomtad a " + arg0.getKeyCode() + " Gombot");

	}
	
}

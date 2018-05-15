package demo;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class Window extends JFrame {
	
	private Container component;

	Window(){
		super("demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		component = new demo.Content();
		setContentPane(component);
		setMinimumSize(new Dimension(400, 400));
		setVisible(true);
	}

	public static void main(String[] args) {
		new Window();
	}
	
}

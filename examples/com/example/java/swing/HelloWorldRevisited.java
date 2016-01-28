package com.example.java.swing;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldRevisited {

	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setSize(640, 480);
		// positions are relative to top left corner
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add the ubiquitous "Hello World" label.
		JLabel label = new JLabel("Hello World");
		// label.setBorder(BorderFactory.createDashedBorder(new Paint()));
		frame.getContentPane().add(label);

		// Display the window.
		// frame.pack(); // no pack, because otherwise the window will shrink again
		frame.setVisible(true);
	}

}

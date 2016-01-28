package com.example.java.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add the ubiquitous "Hello World" label.
		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);

		// Display the window.
		frame.pack(); // pack -> determine the size of the window
		frame.setVisible(true);
	}

}

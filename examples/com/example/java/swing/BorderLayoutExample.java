package com.example.java.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class BorderLayoutExample {

	public static void main(String[] args) {

		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// BorderLayout is the default Layout, so the following is not required
		frame.setLayout(new BorderLayout());

		// frame.getContentPane().add(layout);
		frame.setVisible(true);

	}

}

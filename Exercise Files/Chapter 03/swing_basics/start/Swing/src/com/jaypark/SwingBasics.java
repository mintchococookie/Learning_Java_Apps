package com.jaypark;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingBasics {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingBasics window = new SwingBasics();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingBasics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(66, 11, 212, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label2 = new JLabel("");
		label2.setBounds(26, 51, 382, 14);
		frame.getContentPane().add(label2);
		
		JButton button = new JButton("Say Hi");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label2.setText("Hi " + textField.getText());
			}
		});
		button.setForeground(Color.BLACK);
		button.setBounds(288, 10, 80, 23);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("Name:");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBounds(10, 14, 46, 14);
		frame.getContentPane().add(label);
		
		
	}
}
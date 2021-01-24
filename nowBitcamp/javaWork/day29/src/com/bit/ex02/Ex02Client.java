package com.bit.ex02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Ex02Client extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		new Ex02Client();
	}

	public Ex02Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.PINK);
		contentPane.add(p1, BorderLayout.NORTH);
		
		JLabel label = new JLabel("클라이언트");
		label.setFont(new Font("궁서체", Font.BOLD, 18));
		p1.add(label);
		
		JPanel panel_1 = new JPanel();
		
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(25);
		
		JButton btnSend = new JButton("send");
		panel_1.add(btnSend);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{100, 0};
		gbl_panel_2.rowHeights = new int[]{62, 62, 62, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BIT02-08\\Pictures\\game4 - \uBCF5\uC0AC\uBCF8.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 2;
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.fill = GridBagConstraints.BOTH;
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 2;
		panel_2.add(btnExit, gbc_btnExit);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		

		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(textField.getText()+"\n");
				textField.setText("");
			}
		});

		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(textField.getText()+"\n");
				textField.setText("");
			}
		});
		
		setVisible(true);
	}

}

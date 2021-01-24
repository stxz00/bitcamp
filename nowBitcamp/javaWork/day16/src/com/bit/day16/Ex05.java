package com.bit.day16;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex05 extends Frame{
	
	public Ex05(){
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btn5 = new Button("btn5");
		Button btn6 = new Button("btn6");
		Button btn7 = new Button("btn7");
		
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.fill = 1;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 1.0;
		gbc1.weighty = 1.0;
		gbl.setConstraints(btn1, gbc1);
		add(btn1);
		
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.fill = 1;
		gbc2.gridx = 1;
		gbc2.gridy = 0;
		gbc2.gridwidth = 1;
		gbc2.gridheight = 1;
		gbc2.weightx = 1.0;
		gbc2.weighty = 1.0;
		gbl.setConstraints(btn2, gbc2);
		add(btn2);
		
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.fill = 1;
		gbc3.gridx = 2;
		gbc3.gridy = 0;
		gbc3.gridwidth = 1;
		gbc3.gridheight = 1;
		gbc3.weightx = 1.0;
		gbc3.weighty = 1.0;
		gbl.setConstraints(btn3, gbc3);
		add(btn3);
		
		GridBagConstraints gbc4 = new GridBagConstraints();
		gbc4.fill = 1;
		gbc4.gridx = 0;
		gbc4.gridy = 1;
		gbc4.gridwidth = 1;
		gbc4.gridheight = 1;
		gbc4.weightx = 1.0;
		gbc4.weighty = 1.0;
		gbl.setConstraints(btn4, gbc4);
		add(btn4);
		
		GridBagConstraints gbc5 = new GridBagConstraints();
		gbc5.fill = 1;
		gbc5.gridx = 1;
		gbc5.gridy = 1;
		gbc5.gridwidth = 2;
		gbc5.gridheight = 1;
		gbc5.weightx = 1.0;
		gbc5.weighty = 1.0;
		gbl.setConstraints(btn5, gbc5);
		add(btn5);
			
		GridBagConstraints gbc6 = new GridBagConstraints();
		gbc6.fill = 1;
		gbc6.gridx = 0;
		gbc6.gridy = 2;
		gbc6.gridwidth = 2;
		gbc6.gridheight = 1;
		gbc6.weightx = 1.0;
		gbc6.weighty = 1.0;
		gbl.setConstraints(btn6, gbc6);
		add(btn6);
		
		GridBagConstraints gbc7 = new GridBagConstraints();
		gbc7.fill = 1;
		gbc7.gridx = 2;
		gbc7.gridy = 2;
		gbc7.gridwidth = 1;
		gbc7.gridheight = 1;
		gbc7.weightx = 1.0;
		gbc7.weighty = 1.0;
		gbl.setConstraints(btn7, gbc7);
		add(btn7);

		
		
		
		setLocation(100,100);
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}

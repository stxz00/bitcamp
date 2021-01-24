package com.bit.Exercise;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;

public class Ex03 extends Frame{

	Ex03(){
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = 1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		Font font = new Font("궁서", 1, 13);
		
		Label la1 = new Label("치킨의 종류");
		la1.setFont(font);
		gbl.setConstraints(la1, gbc);
		add(la1);

		Panel p1 = new Panel();
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("후라이드",false,cbg);
		Checkbox cb2 = new Checkbox("양념",false,cbg);
		Checkbox cb3 = new Checkbox("간장",false,cbg);
		
		p1.add(cb1);
		p1.add(new Label("   "));
		p1.add(cb2);
		p1.add(new Label("   "));
		p1.add(cb3);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbl.setConstraints(p1, gbc);
		add(p1);
		
		Label la2 = new Label("치킨의 양");
		la2.setFont(font);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbl.setConstraints(la2, gbc);
		add(la2);
		
		Panel p2 = new Panel();
		Checkbox cb4 = new Checkbox("1인분");
		Checkbox cb5 = new Checkbox("2인분");
		Checkbox cb6 = new Checkbox("3인분");
		p2.add(cb4);
		p2.add(new Label("   "));
		p2.add(cb5);
		p2.add(new Label("   "));
		p2.add(cb6);
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbl.setConstraints(p2, gbc);
		add(p2);
		
		
		
		
		setLocation(100,100);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03();
	}
}

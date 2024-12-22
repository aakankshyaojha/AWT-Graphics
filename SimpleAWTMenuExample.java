package com.menu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class SimpleAWTMenuExample {

	public static void main(String[] args) {
		Frame frame = new Frame("AWT Menu Example");
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = new Menu("File");
		Menu editfile = new Menu("Edit");
		MenuItem newItem = new MenuItem("New");
		MenuItem openItem =  new MenuItem("Open");
		MenuItem saveItem = new MenuItem("Save");
		MenuItem exitItem = new MenuItem("Exit");
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);
		menuBar.add(editfile);
		frame.setMenuBar(menuBar);
		exitItem.addActionListener(e -> {
			System.out.println("Exiting...");
			frame.dispose();
		});
		frame.setSize(400,300);
		frame.setLayout(null);
		frame.setVisible(true);
		
		// TODO Auto-generated method stub

	}

}

package com.paintapp.gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.paintapp.controller.CanvasController;


/*This is for displaying shapes*/
public class DrawCanvas extends JPanel {
	private static final long serialVersionUID = 1L;
	private CanvasController canvasController;

	public DrawCanvas() {
		canvasController = new CanvasController();
		this.addMouseListener(canvasController);
	}	
	
	@Override
	public void paintComponent(Graphics grahics) {
        super.paintComponent(grahics);
        canvasController.drawShape(grahics);
	}
}

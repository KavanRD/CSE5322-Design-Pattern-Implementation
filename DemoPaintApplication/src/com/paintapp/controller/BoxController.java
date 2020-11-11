package com.paintapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.paintapp.draw.Context;
import com.paintapp.gui.ShapesGUI;

public class BoxController implements ActionListener {

	private ShapesGUI shapeGui;
	
	public BoxController(ShapesGUI GuiShape) {
		this.shapeGui = GuiShape;
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		Context cntxt = Context.getContext(shapeGui.getCanvasPanel());
		cntxt.boxClicked();
		
		shapeGui.getCanvasPanel().revalidate();
		shapeGui.getCanvasPanel().repaint();

	}


}

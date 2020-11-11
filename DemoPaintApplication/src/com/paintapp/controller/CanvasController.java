package com.paintapp.controller;



import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.paintapp.draw.Context;


/*This is a action listener for the button clicks on the canvas */

public class CanvasController implements MouseListener {


	@Override
	public void mousePressed(MouseEvent event) {
		Context cntxt = Context.getContext();
		cntxt.mouseClickedOnCanvas(event);
		event.getComponent().repaint();
	}

	public void drawShape(Graphics graphics) {
		Context cntxt = Context.getContext();
		if(cntxt !=null) {
			cntxt.paintCanvas(graphics);	
		}
		
	}
	
	@Override
	public void mouseClicked(java.awt.event.MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent event) {
		// TODO Auto-generated method stub
		
	}


}
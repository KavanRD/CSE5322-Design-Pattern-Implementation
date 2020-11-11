package com.paintapp.draw;



import java.awt.Graphics;
import java.awt.event.MouseEvent;

import com.paintapp.buttons.Buttons;
import com.paintapp.buttons.Composite;


//This is the state patterns' State super class
//it has all the transition methods

public class State {

	public void boxClicked(Context cntxt) {}
	public void circleClicked(Context cntxt) {}
	public void mouseClickedOnCanvas(Context cntxt, MouseEvent event) {}
	
	public void undoClicked(Context cntxt) {
		cntxt.setCurrentState(new StateDefault(cntxt));
		Buttons.undo();
	}
	public void redoClicked(Context cntxt) {
		cntxt.setCurrentState(new StateDefault(cntxt));
		Buttons.redo();
	}

	public void paintCanvas(Context cntxt, Graphics graphics) {
		Buttons drawOnCanvas = new Composite(graphics);
		drawOnCanvas.execute();
	}
	
}

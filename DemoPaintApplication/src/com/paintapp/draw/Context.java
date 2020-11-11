package com.paintapp.draw;



import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

//This is the Subject class of the State pattern and also the main controller
// This has the application's current state - either of BoxState, CircleState, LineState, LineEndState, or defaultState


public class Context {

	private static Context cntxt = null;
	
	private State currentState;
	private JPanel canvas;
	
	private Context(JPanel canvas) {
		this.canvas = canvas;
		this.currentState = new StateDefault(this);
	}
	
	public static Context getContext(JPanel canvas) {
		if(cntxt == null) {
			cntxt = new Context(canvas);
		}
		return cntxt;
	}
	
	public static Context getContext() {
		return cntxt;
	}
	
	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public void boxClicked() {
		currentState.boxClicked(this);
	}
	
	public void circleClicked() {
		currentState.circleClicked(this);
	}
	
	public void undoClicked() {
		currentState.undoClicked(this);
	}
	public void redoClicked() {
		currentState.redoClicked(this);
	}
	
	public void mouseClickedOnCanvas(MouseEvent event) {
		currentState.mouseClickedOnCanvas(this,event);
	}

	public void paintCanvas(Graphics graphics) {
		currentState.paintCanvas(this, graphics);
		
	}
	
	public JPanel getCanvas() {
		return canvas;
	}


	

}

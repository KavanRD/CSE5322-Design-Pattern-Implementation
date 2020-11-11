package com.paintapp.draw;


import java.awt.Cursor;
import java.awt.event.MouseEvent;

/* The state is set here, be it at initial state (StateDefault) i.e at the start of the application 
 * or when the button is clicked(BoxClicked/CircleClicled/MouseClickOnCanvas) */

public class StateDefault extends State {

	public StateDefault(Context cntxt) {
		cntxt.getCanvas().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	@Override
	public void boxClicked(Context cntxt) {
		cntxt.setCurrentState(new BoxDraw(cntxt));
	}


	@Override
	public void circleClicked(Context cntxt) {
		cntxt.setCurrentState(new CircleDraw(cntxt));
	}

	@Override
	public void mouseClickedOnCanvas(Context cntxt, MouseEvent event) {
//		do nothing
	}
}

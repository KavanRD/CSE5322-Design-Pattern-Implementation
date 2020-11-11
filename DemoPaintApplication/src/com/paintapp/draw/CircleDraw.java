package com.paintapp.draw;

import java.awt.Cursor;
import java.awt.event.MouseEvent;

import com.paintapp.buttons.Buttons;
import com.paintapp.buttons.CircleShape;

public class CircleDraw extends State {
	public CircleDraw(Context cntxt) {
		cntxt.getCanvas().setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
	}
	
	@Override
	public void boxClicked(Context cntxt) {
		cntxt.setCurrentState(new BoxDraw(cntxt));

	}

	@Override
	public void circleClicked(Context cntxt) {

	}

	@Override
	public void mouseClickedOnCanvas(Context cntxt, MouseEvent event) {
		cntxt.setCurrentState(new StateDefault(cntxt));
		Buttons circleShape = new CircleShape(event);
		circleShape.execute();
		
	}
}

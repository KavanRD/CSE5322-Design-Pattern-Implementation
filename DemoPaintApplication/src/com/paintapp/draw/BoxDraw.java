package com.paintapp.draw;

import java.awt.Cursor;
import java.awt.event.MouseEvent;

import com.paintapp.buttons.BoxShape;
import com.paintapp.buttons.Buttons;

public class BoxDraw extends State {
	
	public BoxDraw(Context cntxt) {
		cntxt.getCanvas().setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));		// change the cursor when in this state to cross hair
	}
	@Override
	public void boxClicked(Context cntxt) {
	}

	@Override
	public void circleClicked(Context cntxt) {
		cntxt.setCurrentState(new CircleDraw(cntxt));

	}

	@Override
	public void mouseClickedOnCanvas(Context cntxt, MouseEvent event) {
		cntxt.setCurrentState(new StateDefault(cntxt));
		Buttons boxShape = new BoxShape(event);
		boxShape.execute();
		
	}

}

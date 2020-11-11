package com.paintapp.buttons;

import java.awt.event.MouseEvent;

import com.paintapp.models.BoxModel;


public class BoxShape extends Buttons {
	
private MouseEvent clickEvent; 
	
	public BoxShape(MouseEvent click) {
		this.clickEvent = click;
		ButtonStack.getButtonStack().push(this);
	}
	
	@Override
	public void execute() {
		int x = clickEvent.getX();
		int y = clickEvent.getY();
		result = new BoxModel(x,y);
	}	

}

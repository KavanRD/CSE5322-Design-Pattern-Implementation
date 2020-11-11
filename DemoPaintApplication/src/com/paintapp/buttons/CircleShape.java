package com.paintapp.buttons;

import java.awt.event.MouseEvent;

import com.paintapp.models.CircleModel;


public class CircleShape extends Buttons {
	
private MouseEvent click;
	
	public CircleShape(MouseEvent e) {
		this.click = e;
		ButtonStack.getButtonStack().push(this);
	}
	@Override
	public void execute() {
		int x = click.getX();
		int y = click.getY();
		result = new CircleModel(x,y);

}
}

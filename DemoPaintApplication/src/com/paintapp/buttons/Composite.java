package com.paintapp.buttons;



import java.awt.Graphics;
import java.util.Iterator;

import com.paintapp.models.CShapeModel;
import com.paintapp.models.ShapesModel;

/*Part of the command pattern
command class to draw the composite shape*/

public class Composite extends Buttons{

	private Graphics graphics = null;
	public Composite(Graphics graphics) {
		this.graphics = graphics;
	}

	@Override
	public void execute() {
		ButtonStack stack = ButtonStack.getButtonStack();
		
		Iterator<Buttons> iterator = stack.getIterator();
		CShapeModel comShapeModel = new CShapeModel();
		while(iterator.hasNext()) {
			ShapesModel shapesModel = iterator.next().getResult() ;
			comShapeModel.addShape(shapesModel);
		}
		comShapeModel.draw(graphics);
	}
	

}

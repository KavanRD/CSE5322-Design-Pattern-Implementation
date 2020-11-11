package com.paintapp.models;



import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

/*it is the composite class of the composite pattern. 
 * This holds the other classes in the list and we use the Java Collection (ArrayList of type ShapesModel - composite class) 
 * and use Iterator to loop through it.*/

public class CShapeModel extends ShapesModel{
	private ArrayList<ShapesModel> shapesModel;		// collection of the composite class
		
	public CShapeModel() {
		shapesModel = new ArrayList<>();
	}
	
	@Override
	public void draw(Graphics graphics) {
		
		//Iterator pattern applied
		Iterator<ShapesModel> iterator = shapesModel.iterator();
		while(iterator.hasNext()) {
			iterator.next().draw(graphics);
		}
	}
	
	@Override
	public void addShape(ShapesModel shapeModel) {
		shapesModel.add(shapeModel);
	}
	
	@Override
	public void removeShape(ShapesModel shapeModel) {
		shapesModel.remove(shapeModel);
	}
	
}

package com.paintapp.models;


import java.awt.Graphics;


/*This is the super class and the Composite class. 
 * The composite pattern is applied here*/

abstract public class ShapesModel{

	public abstract void draw(Graphics graphics);
	
	public void addShape(ShapesModel shapeModel) {
		// implemented in the composite class - CShapeModel
		
	}

	public void removeShape(ShapesModel shapeModel) {
		// implemented in the composite class - CShapeModel
		
	}

}

package com.paintapp.models;

import java.awt.Graphics;

public class BoxModel extends ShapesModel {
	
private int xCoordinate,yCoordinate;
	
	public BoxModel(int coordinateX, int coordinateY) {
		this.xCoordinate = coordinateX;
		this.yCoordinate = coordinateY;
	}
	
	@Override
	public void draw(Graphics graphics) {
		graphics.drawRect(xCoordinate, yCoordinate, 100, 100);
		
	}

}

package com.paintapp.models;

import java.awt.Graphics;

public class CircleModel extends ShapesModel {
private int x,y;
	
	public CircleModel(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(x,y,100,100);
	}
}

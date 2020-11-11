package com.paintapp.main;



import java.awt.EventQueue;

import com.paintapp.gui.ShapesGUI;

/*This is the class where execution begins as this is the main class with main function in it.
 * The application starts from here. 
 * This main function get called first*/

public class PaintApplication {
    
	private void init() {
		ShapesGUI shapesGui = new ShapesGUI("Paint Application - Kavan Mehta");
		shapesGui.setVisible(true);
	}

	public static void main(String args[]){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
            	PaintApplication paintApplicationObj = new PaintApplication();
            	paintApplicationObj.init();
                
            }
        });
    }
}

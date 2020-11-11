package com.paintapp.buttons;

import com.paintapp.models.ShapesModel;

public abstract class Buttons {

	protected ShapesModel result;		//stores the result of the command execution
	
	public abstract void execute();

	public ShapesModel getResult() {
		return result;
	}

	//redo from the command stack
	public static void redo() {
		ButtonStack stack = ButtonStack.getButtonStack();
		stack.pop(ButtonStack.POP_REDO);
	}
	
	//undo from the command stack
	public static void undo() {
		ButtonStack stack = ButtonStack.getButtonStack();
		stack.pop(ButtonStack.POP_UNDO);
	}
	

	
}

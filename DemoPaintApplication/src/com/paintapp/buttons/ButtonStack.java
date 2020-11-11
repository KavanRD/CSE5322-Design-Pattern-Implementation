package com.paintapp.buttons;

import java.util.Iterator;
import java.util.Stack;

public class ButtonStack {
	private static ButtonStack stackInstance = null;
	private Stack<Buttons> executed;
	private Stack<Buttons> undo;
	public final static String POP_UNDO = "U";
	public final static String POP_REDO = "R";
	
	private ButtonStack() {
		initStacks();
	}
	
	public Iterator<Buttons> getIterator(){
		return this.executed.iterator();
	}
	
	public static ButtonStack getButtonStack() {
		if(stackInstance == null) {
			stackInstance = new ButtonStack();
		}
		return stackInstance;
	}
	
	private void initStacks() {
		if(executed == null) {
			executed = new Stack<Buttons>();			
		}
		if(undo == null) {
			undo = new Stack<Buttons>();
		}
	}
	
	public void push(Buttons bt) {
		executed.push(bt);		
	}

	public Buttons pop(String s) {
		Buttons bt = null;
		if(s == POP_UNDO) {
			if(undo()) {
				bt = executed.pop();
				undo.push(bt);	
			}
		}
		else if(s == POP_REDO) {
			if(redo()) {
				bt = undo.pop();
				executed.push(bt);
			}
		}

		return bt;
	}

	public boolean undo() {
		if(executed.empty()) {
			return false;
		}
		return true;
	}
	public boolean redo() {
		if(undo.empty()) {
			return false;
		}
		return true;
	}


}

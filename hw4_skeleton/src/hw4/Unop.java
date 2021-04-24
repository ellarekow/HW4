package hw4;

import api.DefaultNode;
import api.Expression;
import parser.ProgramNode;

public abstract class Unop implements Expression{
	
	private Expression expr;
	
	
	public Unop(Expression expression) {
		expr = expression;
	}
	
	public ProgramNode getChild(int i) {
		if(i == 0)
			return expr;
		else 
			return new DefaultNode("Invalid index " + i + " for type " + this.getClass().getName());
	}
	
	@Override
	public int getNumChildren() {
		return 1;
	}	
	
	@Override
	public String getText() {
		return "";
	}

}

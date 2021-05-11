package hw4;

import api.DefaultNode;
import api.Expression;
import parser.ProgramNode;

public abstract class Unop implements Expression{
	
	/**
	 * expression for the function 
	 */
	private Expression expr;
	
	/**
	 * 
	 * @param expression
	 * expression for the function 
	 */
	public Unop(Expression expression) {
		expr = expression;
	}
	
	/**
	 * @param i 
	 * index of the child 
	 * @return 
	 * child of the function, 0th is the expression, otherwise error message
	 */
	public ProgramNode getChild(int i) {
		if(i == 0)
			return expr;
		else 
			return new DefaultNode("Invalid index " + i + " for type " + this.getClass().getName());
	}
	
	/**
	 * @return children
	 * returns the number of children, 1
	 */
	@Override
	public int getNumChildren() {
		return 1;
	}	
	
	/**
	 * @return text
	 * returns an empty string
	 */
	@Override
	public String getText() {
		return "";
	}
	
	/**
	 * 
	 * @return expr
	 * returns the expression
	 */
	protected Expression getExpr() {
		return expr;
	}

}

/**
 * 
 */
package hw4;

import api.DefaultNode;
import api.Expression;
import api.Scope;
import parser.ProgramNode;

/**
 * @author Ella Rekow
 *
 */
public abstract class Binop implements Expression{
	
	protected Expression lhs;
	protected Expression rhs;
	
	/**
	 * 
	 * @param left left hand side of equation
	 * @param right right hand side of equation 
	 */
	public Binop(Expression left, Expression right) {
		lhs = left; 
		rhs = right;
	}
	
	public ProgramNode getChild(int i) {
		if(i == 0)
			return lhs; 
		
		else if(i == 1)
			return rhs;
		
		else
			return new DefaultNode("Invalid index " + i + " for type " + this.getClass().getName());
	}
	
	public int getNumChildren() {
		return 2;
	}
	
	public String toString(){
	    return makeString();
	 }

}

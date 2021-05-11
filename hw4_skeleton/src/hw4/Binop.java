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
	
	/**
	 * expression represented on the left hand side of the equation 
	 */
	private Expression lhs;
	/**
	 * expression represented on the right hand side of the equation
	 */
	private Expression rhs;
	
	/**
	 * An abstract for binary operations 
	 * @param left left hand side of equation
	 * @param right right hand side of equation 
	 */
	public Binop(Expression left, Expression right) {
		lhs = left; 
		rhs = right;
	}
	
	/**
	 * finds the specified challenge 
	 * @param i 
	 * 	index of which child you are looking for
	 * @return side
	 * 	the correct side of the equation 
	 * 	
	 */
	@Override
	public ProgramNode getChild(int i) {
		if(i == 0)
			return lhs; 
		
		else if(i == 1)
			return rhs;
		
		else
			return new DefaultNode("Invalid index " + i + " for type " + this.getClass().getName());
	}
	
	/**
	 * @return number of children, 2
	 */
	@Override
	public int getNumChildren() {
		return 2;
	}
	
	/**
	 * @return string
	 *  returns the string for the tree
	 */
	@Override
	public String toString(){
	    return makeString();
	 }
<<<<<<< Updated upstream
=======
	
	/**
	 * @return string
	 * 	empty string
	 */
	@Override
	public String getText()
	{
		return "";
	}
	
	/**
	 * 
	 * @return lhs
	 * returns the left hand side of the equation 
	 */
	protected Expression getlhs() {
		return lhs;
	}
	
	/**
	 * 
	 * @return rhs
	 * 	returns the right hand side of the equation
	 */
	protected Expression getrhs() {
		return rhs;
	}
>>>>>>> Stashed changes

}

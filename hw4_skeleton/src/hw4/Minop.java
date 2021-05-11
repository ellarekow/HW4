package hw4;

import api.DefaultNode;
import api.Expression;
import api.Instruction;
import api.Scope;
import parser.ProgramNode;

public abstract class Minop implements Instruction {
	
	/**
	 * Identifier for the variable  
	 */
	private Identifier variable;
	/**
	 * expression for the function
	 */
	private Expression expression;
	/**
	 * instructions for the function 
	 */
	private Instruction instruction; 
	
	
	/**
	 * 
	 * @param v
	 * Identifier for the variable 
	 * @param e
	 * Expression for the function 
	 * sets the instruction set to null 
	 */
	public Minop(Identifier v, Expression e) {
		variable = v;
		expression = e;
		instruction = null; 
	}
	
	/**
	 * 
	 * @param e
	 * expression for function 
	 * @param s
	 * instruction for the function 
	 * 
	 * instruction set to null 
	 */
	public Minop(Expression e, Instruction s) {
		variable = null;
		expression = e; 
		instruction = s;
	}

	/**
	 * @return text
	 * returns the variable get text method 
	 */
	  public String getText()
	  {
	    return variable.getText();
	  }
	  
	  /**
	   * @param index
	   * gets the index of the child 
	   * @return child
	   * returns either variable ro instruction according to which constructor is used in 0th index, expression for 1st index, or an error messsage
	   */
	  public ProgramNode getChild(int i)
	  {
	    if (i == 0)
	    {
	    	if(variable != null)
	    		return variable;
	    	else 
	    		return instruction;
	    }
	    else if (i == 1)
	    {
	      return expression;
	    }
	    else
	    {
	      return new DefaultNode("Invalid index " + i + " for type " + this.getClass().getName());      
	    }
	  }
	  
	  /**
	   * @return children 
	   * returns number of children, 2
	   */
	  public int getNumChildren()
	  {
	    return 2;
	  }
	  
	  /**
	   * @return 
	   * returns the name
	   */
	  public String toString()
	  {
	    return makeString();
	  }
	  
	  /**
	   * 
	   * @return variable
	   *  returns the variable 
	   */
	  protected Identifier getVar() {
		  return variable;
	  }
	  
	  /**
	   * 
	   * @return expression
	   * returns the expression 
	   */
	  protected Expression getExpr() {
		  return expression;
	  }
	  
	  /**
	   * 
	   * @return instruction 
	   * returns the instruction 
	   */
	  protected Instruction getInstrcut() {
		  return instruction;
	  }

}

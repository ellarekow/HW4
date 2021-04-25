package hw4;

import api.DefaultNode;
import api.Expression;
import api.Instruction;
import api.Scope;
import parser.ProgramNode;

public abstract class Minop implements Instruction {
	
	protected Identifier variable;
	protected Expression expression;
	protected Instruction instruction; 
	
	
	//2 Constructors the move??? 
	public Minop(Identifier v, Expression e) {
		variable = v;
		expression = e;
		instruction = null; 
	}
	
	public Minop(Expression e, Instruction s) {
		variable = null;
		expression = e; 
		instruction = s;
	}

	  public String getText()
	  {
	    return variable.getText();
	  }
	  
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
	  
	  public int getNumChildren()
	  {
	    return 2;
	  }
	  
	  public String toString()
	  {
	    return makeString();
	  }

}

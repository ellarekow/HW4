package hw4;

import api.DefaultNode;
import api.Expression;
import api.Instruction;
import api.Scope;
import parser.ProgramNode;

public abstract class Minop implements Instruction {
	
	protected Identifier variable;
	protected Expression expression;
	
	public Minop(Identifier v, Expression e) {
		variable = v;
		expression = e;
	}

	  public String getText()
	  {
	    return variable.getText();
	  }
	  
	  public ProgramNode getChild(int i)
	  {
	    if (i == 0)
	    {
	      return variable;
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

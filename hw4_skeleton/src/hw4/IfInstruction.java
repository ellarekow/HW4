package hw4;

import api.DefaultNode;
import api.Expression;
import api.Instruction;
import api.Scope;
import parser.ProgramNode;

/**
 * Instruction type representing a conditional.  A conditional has an
 * expression and two instructions.  If the expression evaluates to a 
 * nonzero value (i.e., "true"), the first instruction is executed; otherwise, the 
 * second instruction is executed.
 * <ul>
 *   <li>There are three children; the first is the expression, the second 
 *   is the instruction for the "true", the third is the instruction for
 *   the "false" branch
 *   <li>The getLabel() method returns the string "If".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
//TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Instruction INTERFACE
// AND OVERRIDE THE toString METHOD
public class IfInstruction implements Instruction
{
	/**
	 * expression of the program
	 */
	private Expression expr;
	/**
	 * first instruction for the function
	 */
	private Instruction ins1;
	/**
	 * second instruction for the function 
	 */
	private Instruction ins2;
  
  /**
   * Constructs a conditional statement from the given condition
   * and alternative actions.
   * @param condition
   *    an expression to use as the condition
   * @param s0
   *    statement to be executed if the condition is true (nonzero)
   * @param s1
   *    statement to be executed if the condition is false (zero)
   */
  public IfInstruction(Expression condition, Instruction s0, Instruction s1)
  {
	  expr = condition;
	  ins1 = s0;
	  ins2 = s1;
  }

  /**
   * @param arg0
   * index of which child
   * @return child 
   * returns the correct child 
   * returns the expression for the 0th index
   * returns the first set of instructions for the 1st index
   * returns the second set of instructions for the 2nd index
   */
@Override
public ProgramNode getChild(int arg0) {
	if(arg0 == 0) 
		return expr;
	else if(arg0 == 1)
		return ins1;
	else if(arg0 == 2)
		return ins2;
	else 
		return new DefaultNode("Invalid index " + arg0 + " for type " + this.getClass().getName());
}

/**
 * @return label
 * 	returns the label "if"
 */
@Override
public String getLabel() {
	// TODO Auto-generated method stub
	return "If";
}

/**
 * @return child 
 * returns the number of children, 3
 */
@Override
public int getNumChildren() {
	// TODO Auto-generated method stub
	return 3;
}

@Override
public String getText() {
	// TODO Auto-generated method stub
	return "";
}

@Override
public void execute(Scope env) {
	// TODO Auto-generated method stub
	if(expr.eval(env) != 0)
		ins1.execute(env);
	else
		ins2.execute(env);
	
}
  

}

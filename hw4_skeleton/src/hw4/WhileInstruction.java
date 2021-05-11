package hw4;

import api.DefaultNode;
import api.Expression;
import api.Instruction;
import api.Scope;
import parser.ProgramNode;

/**
 * Instruction type representing a while-loop.  A loop has an
 * expression and an instruction.  If the expression evaluates to a 
 * nonzero value (i.e., "true"), the instruction is executed
 * and the expression is re-evaluated, and this process continues 
 * until the expression evaluates to 0 ("false").
 * <ul>
 *   <li>There are two children; the first is the expression, the second 
 *   is the instruction
 *   <li>The getLabel() method returns the string "While".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
//TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Instruction INTERFACE
// AND OVERRIDE THE toString METHOD
public class WhileInstruction
{
  
  /**
   * Constructs a while statement from the given condition and body
   * @param condition
   *   expression for the loop condition
   * @param s
   *   instruction for the loop body
   */
  public WhileInstruction(Expression condition, Instruction s)
  {
<<<<<<< Updated upstream

  }
=======
	  super(condition, s);
  }

  /**
   * @param env
   * maps the variables
   * 
   * executes the functions until it evaulates to 0
   */
@Override
public void execute(Scope env) {
	// TODO Auto-generated method stub
	if(getExpr().eval(env) != 0) {
		getInstrcut().execute(env);
		execute(env);
	}
}

/**
 * @return label
 * returns the string "While"
 */
@Override
public String getLabel() {
	// TODO Auto-generated method stub
	return "While";
}
>>>>>>> Stashed changes
}

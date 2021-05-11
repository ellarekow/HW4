package hw4;

import api.DefaultNode;
import api.Expression;
import api.Instruction;
import api.Scope;
import parser.ProgramNode;

/**
 * Instruction type whose execution causes the value of an expression to
 * be printed to the console.
 * <ul>
 *   <li>There is one child, the expression whose value is to be printed.
 *   <li>The getLabel() method returns the string "Output".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
//TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Instruction INTERFACE
// AND OVERRIDE THE toString METHOD
public class OutputInstruction
{
  
  /**
   * Constructs an output statement for the given expression.
   * @param expr
   *   given expression
   */
  public OutputInstruction(Expression expr)
  {

<<<<<<< Updated upstream
  }
=======
  /**
   * @param arg0
   * 
   */
	@Override
	public ProgramNode getChild(int arg0) {
		// TODO Auto-generated method stub
		if(arg0 == 0)
			return expression;
		else
			return new DefaultNode("Invalid index " + arg0 + " for type " + this.getClass().getName());
	}
	
	/**
	 * @return label 
	 * returns the string "output"
	 */
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Output";
	}
	
	/**
	 * @return children 
	 * returns the number of children, 1
	 */
	@Override
	public int getNumChildren() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	/**
	 * @return text
	 * returns an empty string
	 */
	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "";
	}
	
	/**
	 * @param env
	 * maps the names 
	 * 
	 * @return expression 
	 * prints the expression
	 */
	@Override
	public void execute(Scope env) {
		// TODO Auto-generated method stub
		System.out.println(expression.eval(env));
		
	}
>>>>>>> Stashed changes

}

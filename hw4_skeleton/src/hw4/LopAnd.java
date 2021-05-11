package hw4;

import api.Expression;

/**
 * Node type representing a logical expression 
 * with the "and" operator. If both operands evaluate
 * to a nonzero value, then this expression evaluates to 1;
 * otherwise, this expression evaluates to zero.
 * <ul>
 *   <li>There are two children; the first is the left operand, and the second 
 *   is the right operand.
 *   <li>The getLabel() method returns a string consisting of a double ampersand
 *   (&amp;&amp;).
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
//TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Expression INTERFACE
// AND OVERRIDE THE toString METHOD
public class LopAnd
{
  /**
   * Constructs an expression with the given left and right sides.
   * @param lhs
   *   expression for the left-hand-side operand
   * @param rhs
   *   expression for the left-hand-side operand
   */
  public LopAnd(Expression lhs, Expression rhs)
  {
<<<<<<< Updated upstream
=======
	  super(lhs, rhs);
  }

  /**
   * @param env
   * 	maps the variable names
   * @return bothTrue
   * 	if both values are non zero numbers, returns 1 otherwise returns 0
   */
	@Override
	public int eval(Scope env) {
		int leftVal = getlhs().eval(env);
		int rightVal = getrhs().eval(env);
		
		if(leftVal != 0 && rightVal != 0)
			return 1;
		else 
			return 0;
	}

	/**
	 * @return label
	 *  returns string "&&"
	 */
	@Override
	public String getLabel() {
		return "&&";
	}

>>>>>>> Stashed changes

  }
  

}
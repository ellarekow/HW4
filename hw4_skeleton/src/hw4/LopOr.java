package hw4;

import api.Expression;

/**
 * Node type representing a logical expression 
 * with the "or" operator.  If both operands evaluate
 * to zero, then this expression evaluates to 0;
 * otherwise, this expression evaluates to 1.
 * <ul>
 *   <li>There are two children; the first is the left operand, and the second 
 *   is the right operand.
 *   <li>The getLabel() method returns the string "||".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
//TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Expression INTERFACE
// AND OVERRIDE THE toString METHOD
public class LopOr
{
  /**
   * Constructs an expression with the given left and right sides.
   * @param lhs
   *   expression for the left-hand-side operand
   * @param rhs
   *   expression for the left-hand-side operand
   */
  public LopOr(Expression lhs, Expression rhs)
  {
<<<<<<< Updated upstream

  }
=======
	  super(lhs, rhs);
  }

  /**
   * @param env
   * maps the variable names
   * @return eitherTrue
   * returns 1 if neither of the values evaluate to 0, 1 otherwise 
   */
@Override
public int eval(Scope env) {
	int leftVal = getlhs().eval(env);
	int rightVal = getrhs().eval(env);
	
	if(leftVal == 0 && rightVal == 0)
		return 0;
	else 
		return 1;
}

/**
 * @return label 
 * returns the string "||" 
 */
@Override
public String getLabel() {
	return "||";
}
>>>>>>> Stashed changes

}
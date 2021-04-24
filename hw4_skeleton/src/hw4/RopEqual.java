package hw4;

import api.Expression;
import api.Scope;

/**
 * Node type representing a relational expression
 * with the "equals" operator.  If the two operands
 * evaluate the the same number, this expression evaluates
 * to 1; otherwise, it evaluates to zero.
 * <ul>
 *   <li>There are two children; the first is the left operand, and the second 
 *   is the right operand.
 *   <li>The getLabel() method returns the string "==".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
//TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Expression INTERFACE
// AND OVERRIDE THE toString METHOD
public class RopEqual extends Binop
{
  /**
   * Constructs an expression with the given left and right sides.
   * @param lhs
   *   expression for the left-hand-side operand
   * @param rhs
   *   expression for the left-hand-side operand
   */
  public RopEqual(Expression lhs, Expression rhs)
  {
	  super(lhs, rhs);
  }

@Override
public int eval(Scope env) {
	int leftVal = lhs.eval(env);
	int rightVal = rhs.eval(env);
	
	if(leftVal == rightVal)
		return 1;
	else 
		return 0;
	
}

@Override
public String getLabel() {
	// TODO Auto-generated method stub
	return "==";
}

}
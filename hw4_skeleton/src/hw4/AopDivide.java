package hw4;

import api.Expression;
import api.Scope;

/**
 * Node type representing an arithmetic expression 
 * with a division operator.
 * <ul>
 *   <li>There are two children; the first is the left operand, and the second 
 *   is the right operand.
 *   <li>The getLabel() method returns the string "/".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
// TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Expression INTERFACE
// AND OVERRIDE THE toString METHOD
public class AopDivide extends Binop
{
  /**
   * Constructs an expression with the given left and right sides.
   * @param lhs
   *   expression for the left-hand-side operand
   * @param rhs
   *   expression for the left-hand-side operand
   */
  public AopDivide(Expression lhs, Expression rhs)
  {
	  super(lhs, rhs);
  }
  
  /**
   * @return string "/"
   */
  @Override
  public String getLabel()
  {
    return "/";
  }
  
  /**
   * @param env maps variable names
   * @return left side divided by right side
   */
  @Override
  public String getText()
  {
    return "";
  }
  
  @Override
  public int eval(Scope env)
  {
	int leftVal = super.getlhs().eval(env);
    int rightVal = super.getrhs().eval(env);
    return leftVal / rightVal;
  }

}

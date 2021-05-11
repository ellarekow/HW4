package hw4;

import api.Expression;
import api.Scope;

/**
 * Node type representing an arithmetic expression 
 * with a subtraction operator.
 * <ul>
 *   <li>There are two children; the first is the left operand, and the second 
 *   is the right operand.
 *   <li>The getLabel() method returns the string "-".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
// TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Expression INTERFACE
// AND OVERRIDE THE toString METHOD
public class AopSubtract extends Binop
{
  /**
   * Constructs an expression with the given left and right sides.
   * @param lhs
   *   expression for the left-hand-side operand
   * @param rhs
   *   expression for the left-hand-side operand
   */
  public AopSubtract(Expression lhs, Expression rhs)
  {
	   super(lhs, rhs);
  }
  
  /**
   * @return String "-"
   */
  @Override
  public String getLabel()
  {
    return "-";
  }

  /**
   * @return empty string
   */
  @Override
  public String getText()
  {
    return "";
  }
  
  /**
   * @return left minus right side
   */
  @Override
  public int eval(Scope env)
  {

    int leftVal = super.getlhs().eval(env);
    int rightVal = super.getrhs().eval(env);
    return leftVal - rightVal;
  }
  
}

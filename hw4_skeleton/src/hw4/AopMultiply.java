package hw4;

import api.Expression;
import api.Scope;

/**
 * Node type representing an arithmetic expression 
 * with a multiplication operator.
 * <ul>
 *   <li>There are two children; the first is the left operand, and the second 
 *   is the right operand.
 *   <li>The getLabel() method returns the string "*".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
// TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Expression INTERFACE
// AND OVERRIDE THE toString METHOD
public class AopMultiply extends Binop
{
  /**
   * Constructs an expression with the given left and right sides.
   * @param lhs
   *   expression for the left-hand-side operand
   * @param rhs
   *   expression for the left-hand-side operand
   */
  public AopMultiply(Expression lhs, Expression rhs)
  {
	  super(lhs, rhs);
  }
  
  /**
   * @return string "*"
   */
  @Override
  public String getLabel()
  {
    return "*";
  }
  
<<<<<<< Updated upstream
  @Override
  public String getText()
  {
    return "";
  }
  
=======
  /**
   * @param env 
   * maps variable names
   * @return left side multiplied by right side
   */
>>>>>>> Stashed changes
  @Override
  public int eval(Scope env)
  {

    int leftVal = super.getlhs().eval(env);
    int rightVal = super.getrhs().eval(env);
    return leftVal * rightVal;
  }
  

}

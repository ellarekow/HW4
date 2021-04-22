package hw4;

import api.Expression;
import api.Scope;

/**
 * Arithmetic negation expression (unary minus).  
 * <ul>
 *   <li>There is one child, the expression to be negated
 *   <li>The getLabel() method returns the string "Negative".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
// TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Expression INTERFACE
// AND OVERRIDE THE toString METHOD
public class AopNegation //extends Binop
{
  /**
   * Constructs a new unary expression representing the negative
   * of the given expression.
   * @param expr
   *   arithmetic expression to be negated
   */
  public AopNegation(Expression expr)
  {
//	  super(lhs, rhs);	
  }
  
//  @Override
//  public String getLabel()
//  {
//    return "negative";
//  }
//  
//  @Override
//  public String getText()
//  {
//    return "";
//  }
//  
//  @Override
//  public int eval(Scope env)
//  {
//    int leftVal = super.getChild(0).eval(env);
//    int rightVal = super.getChild(1).eval(env);
//    return leftVal + rightVal;
//  }

}

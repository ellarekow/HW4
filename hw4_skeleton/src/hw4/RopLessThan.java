package hw4;

import api.Expression;

/**
 * Node type representing a relational expression
 * with the "less than" operator.  If the left
 * operand evaluates to a smaller value than the 
 * right operand, this expression evaluates to 1; otherwise,
 * it evaluates to zero.
 * <ul>
 *   <li>There are two children; the first is the left operand, and the second 
 *   is the right operand.
 *   <li>The getLabel() method returns a string consisting of the less-than symbol
 *   (&lt;).
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
//TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Expression INTERFACE
// AND OVERRIDE THE toString METHOD
public class RopLessThan
{
  /**
   * Constructs an expression with the given left and right sides.
   * @param lhs
   *   expression for the left-hand-side operand
   * @param rhs
   *   expression for the left-hand-side operand
   */
  public RopLessThan(Expression lhs, Expression rhs)
  {

  }

}
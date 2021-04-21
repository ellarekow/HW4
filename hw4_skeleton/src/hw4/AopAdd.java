package hw4;

import api.DefaultNode;
import api.Expression;
import api.Scope;
import parser.ProgramNode;

/**
 * Node type representing an arithmetic expression 
 * with an addition operator.
 * <ul>
 *   <li>There are two children; the first is the left operand, and the second 
 *   is the right operand.
 *   <li>The getLabel() method returns the string "+".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
//TODO: POSSIBLY REFACTOR THIS CLASS TO REDUCE CODE DUPLICATION
public class AopAdd implements Expression
{
  private Expression lhs;
  private Expression rhs;
  
  /**
   * Constructs an expression with the given left and right sides.
   * @param lhs
   *   expression for the left-hand-side operand
   * @param rhs
   *   expression for the left-hand-side operand
   */
  public AopAdd(Expression lhs, Expression rhs)
  {
    this.lhs = lhs;
    this.rhs = rhs;
  }

  @Override
  public String getLabel()
  {
    return "+";
  }

  @Override
  public String getText()
  {
    return "";
  }

  @Override
  public ProgramNode getChild(int i)
  {
    if (i == 0)
    {
      return lhs;
    }
    else if (i == 1)
    {
      return rhs;
    }
    else
    {
      return new DefaultNode("Invalid index " + i + " for type " + this.getClass().getName());
    }
  }

  @Override
  public int getNumChildren()
  {
    return 2;
  }

  @Override
  public int eval(Scope env)
  {
    int leftVal = lhs.eval(env);
    int rightVal = rhs.eval(env);
    return leftVal + rightVal;
  }
  
  @Override
  public String toString()
  {
    return makeString();
  }
}

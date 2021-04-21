package hw4;

import api.DefaultNode;
import api.Expression;
import api.Scope;
import parser.ProgramNode;

/**
 * Expression type representing a literal (int) value.
 * Evaluating a literal expression returns the given value.
 * <ul>
 *   <li>There are no children.
 *   <li>The getLabel() method returns the string "Int".
 *   <li>The getText() method returns the given value as a string.
 * </ul>
 */
//TODO: POSSIBLY REFACTOR THIS CLASS TO REDUCE CODE DUPLICATION
public class Literal implements Expression
{  
  /**
   * Value of this literal.
   */
  private int value;
  
  /**
   * Constructs a literal with the given value.
   * @param value
   *   int value for this literal.
   */
  public Literal(int value)
  {
    this.value = value;
  }

  @Override
  public String getLabel()
  {
    return "Int";
  }

  @Override
  public String getText()
  {
    return "" + value;
  }

  @Override
  public ProgramNode getChild(int i)
  {
    return new DefaultNode("Invalid index " + i + " for type " + this.getClass().getName());
  }

  @Override
  public int getNumChildren()
  {
    return 0;
  }

  @Override
  public int eval(Scope env)
  {
    return value;
  }

  @Override
  public String toString()
  {
    return makeString();
  }
}

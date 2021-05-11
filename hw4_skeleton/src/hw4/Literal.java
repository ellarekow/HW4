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

  /**
   * @return label 
   * returns the string "Int"
   */
  @Override
  public String getLabel()
  {
    return "Int";
  }

  /**
   * @return value
   * 	returns the value of the expression 
   */
  @Override
  public String getText()
  {
    return "" + value;
  }

  /**
   * @param i
   * 	index of the child
   * @return child
   * returns the an error as there are no children 
   */
  @Override
  public ProgramNode getChild(int i)
  {
    return new DefaultNode("Invalid index " + i + " for type " + this.getClass().getName());
  }

  /**
   * @return children
   * returns the number of children, 0 
   */
  @Override
  public int getNumChildren()
  {
    return 0;
  }

  /**
   * @param env
   * maps the variable names 
   * @return value 
   * 	returns the value of the expression 
   */
  @Override
  public int eval(Scope env)
  {
    return value;
  }

  /**
   * @return string 
   * returns the name
   */
  @Override
  public String toString()
  {
    return makeString();
  }
}

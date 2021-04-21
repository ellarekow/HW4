package hw4;

import api.DefaultNode;
import api.Expression;
import api.Scope;
import parser.ProgramNode;

/**
 * Expression type representing an identifier (variable).
 * An identifier contains a string to be used as a variable name.
 * Evaluating an identifier expression returns the value
 * in the current Scope that is associated with the variable name.
 * Throws an InterpreterException if the name isn't in the current
 * Scope.
 * <ul>
 *   <li>There are no children.
 *   <li>The getLabel() method returns the string "Id".
 *   <li>The getText() method returns the given name.
 * </ul>
 */
//TODO: POSSIBLY REFACTOR THIS CLASS TO REDUCE CODE DUPLICATION
public class Identifier implements Expression
{
  private String name;
  
  /**
   * Constructs an identifier using the given string name.
   * @param givenName
   *   name for this identifier
   */
  public Identifier(String givenName)
  {
    name = givenName;
  }

  @Override
  public String getLabel()
  {
    return "Id";
  }

  @Override
  public String getText()
  {
    return name;
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
    return env.get(name);
  }

  @Override
  public String toString()
  {
    return makeString();
  }
}

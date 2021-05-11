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

  /**
   * @return label 
   * returns the label "ID" 
   */
  @Override
  public String getLabel()
  {
    return "Id";
  }

  /**
   * @return name
   * returns the name
   */
  @Override
  public String getText()
  {
    return name;
  }

  /**
   * @param i
   * 	the index of which child is being referenced 
   * @return child
   * 	there are no child so will always returns an error message
   */
  @Override
  public ProgramNode getChild(int i)
  {
    return new DefaultNode("Invalid index " + i + " for type " + this.getClass().getName());
  }

  /**
   * @return children
   * 	returns 0 as there are no children
   */
  @Override
  public int getNumChildren()
  {
    return 0;
  }

  /**
   * @param env
   * 	maps the variable name
   * @return name
   * 	returns the name
   */
  @Override
  public int eval(Scope env)
  {
		  return env.get(name);
  }

  /**
   * @return string 
   * 	returns the name
   */
  @Override
  public String toString()
  {
    return makeString();
  }
}

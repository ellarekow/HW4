package hw4;

import api.ArgList;
import api.DefaultNode;
import api.Expression;
import api.Function;
import api.ParameterList;
import api.Scope;
import parser.ProgramNode;

/**
 * Expression representing the value of a function call. All expressions
 * in the argument list are evaluated with respect to the current scope,
 * and the resulting values are associated with the corresponding parameter names in
 * a new "local" Scope.  This local scope is used to evaluate the function body
 * (its BlockInstruction) and after that, the function return expression. 
 * Variables in the current scope are not accessible during execution of the function
 * body.
 * The eval method of this call expression returns value of the function's
 * return expression.
 * <ul>
 *   <li>There are two children; the first is the Function object, and the second 
 *   is the argument list.
 *   <li>The getLabel() method returns the string "Call".
 *   <li>The getText() method returns the getText() string of the Function
 * </ul>
 */
// TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Expression INTERFACE
// AND OVERRIDE THE toString METHOD
public class CallExpression implements Expression
{
	/**
	 * function for the current expression 
	 */
	private Function fun;
	/**
	 * argument list for the function 
	 */
	private ArgList arg; 
  /**
   * Constructs a CallExpression for the given function and argument list.
   * @param f
   *   the function to be called
   * @param args
   *   the arguments to the function
   */
  public CallExpression(Function f, ArgList args)
  {
	  fun = f;
	  arg = args; 
  }
  
  /**
   * Sets the Function object for this CallExpression
   * @param f
   *   the function to be called
   */
  public void setFunction(Function f)
  {
    // TODO
	  fun = f;  
  }

  /**
   * @param arg0
   * 	gets the index of the child 
   * 
   * @return child
   * 	returns which child referenced
   */
@Override
public ProgramNode getChild(int arg0) {
	if(arg0 == 0)
		return fun;
	else if(arg0 == 1)
		return arg; 
	else
		 return new DefaultNode("Invalid index " + arg0 + " for type " + this.getClass().getName());    
}

/**
 * @return String
 * 	returns the label "Call"
 */
@Override
public String getLabel() {
	return "Call";
}

/**
 * @return child 
 * returns the two child
 */
@Override
public int getNumChildren() {
	return 2;
}

/**
 * @return text
 * 	returns the getText function
 */
@Override
public String getText() {
	return fun.getText();
}

/**
 * @param env
 * 	maps variable names
 * @return 
 * 	evaluates the expression 
 */
@Override
public int eval(Scope env) {
	ProgramNode node = fun.getChild(2);
	Expression expr = (Expression) node;
	return expr.eval(env);
}

}

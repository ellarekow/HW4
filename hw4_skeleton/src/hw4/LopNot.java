package hw4;

import api.Expression;

/**
 * Node type representing a logical expression 
 * with the "not" operator. If expr evaluates to zero, 
 * then this expression evaluates to 1; otherwise, this
 * expression evaluates to 0. 
 * <ul>
 *   <li>There is one child, the expression to be logically negated
 *   <li>The getLabel() method returns the string "!".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
//TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Expression INTERFACE
// AND OVERRIDE THE toString METHOD
public class LopNot
{ 
  /**
   * Constructs a unary expression that represents the logical negation
   * of the given expression.  
   * @param expr
   *   the logical expression to be negated
   */
  public LopNot(Expression expr)
  {
    
  }

<<<<<<< Updated upstream
=======
  /**
   * @param eval 
   * maps the variable names 
   * @return isNotTrue
   * returns 1 if one of the values evaluate to 0 and 0 otherwise
   */
	@Override
	public int eval(Scope env) {
		// TODO Auto-generated method stub
		int val = getExpr().eval(env);
		
		if(val == 0)
			return 1;
		else
			return 0;
	}
	
	/**
	 * @return label 
	 * returns the string "!"
	 */
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "!";
	}

>>>>>>> Stashed changes
}

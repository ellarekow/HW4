import api.Expression;
import api.Scope;
import hw4.AopAdd;
import hw4.AssignmentInstruction;
import hw4.Identifier;
import hw4.Literal;
import util.ParserUtil;
import viewer.TreeViewer;

public class Basic
{

  public static void main(String[] args)
  {
    // A literal value.  
    Expression e0 = new Literal(2);
    Expression e1 = new Literal(3);
    
    // create the expression 2 + 3
    Expression aSum = new AopAdd(e0, e1);

    // Note the scope is not actually being used here
    Scope env = new Scope();
    System.out.println(e0.eval(env));   // expected 2
    System.out.println(e1.eval(env));   // expected 3
    System.out.println(aSum.eval(env)); // expected 5

    // create the expression (2 + 3) + 4
    Expression e2 = new Literal(4);
    Expression anotherSum = new AopAdd(aSum, e2);
    System.out.println(anotherSum.eval(env)); // expected 9
    
    // optionally, take a look at the resulting elements using the viewer
//    TreeViewer.start(anotherSum); 

    // create an expression with a variable, say x + 4
    Identifier id = new Identifier("x");
    Expression sumWithVar = new AopAdd(id, e2);
    
    // to evaluate it, we need to provide a scope in which x has a value
    env.put("x", 42);
    System.out.println(sumWithVar.eval(env));  // 46
    
    // we could also give x a value by executing an assignment statement
    AssignmentInstruction a = new AssignmentInstruction(id, new Literal(137));
    a.execute(env);
    System.out.println(sumWithVar.eval(env));  // 141
    
    // we can also use the parser to create a tree from a string or file
    String s = "(fred + 3) + (george + (4 + 5))";
    Expression e = ParserUtil.parseExpression(s);
//    TreeViewer.start(e);
  }

}

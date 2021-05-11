package hw4;

import java.util.ArrayList;

import api.DefaultNode;
import api.Instruction;
import api.Scope;
import parser.ProgramNode;

/**
 * Compound instruction representing a sequence of instructions.  Execution
 * of a block iterates through the sequence, calling execute() on each
 * one. When initially constructed, the block contains no instructions.  
 * Instruction objects are added to the sequence using the method
 * <pre>
 *     public void addStatement(Instruction s)
 * </pre>
 * <ul>
 *   <li>The number of children is the number of statements in
 *       this block (possibly zero).
 *   <li>The getLabel() method returns the string "Block".
 *   <li>The getText() method returns an empty string
 * </ul>
 */
//TODO: THIS CLASS MUST DIRECTLY OR INDIRECTLY IMPLEMENT THE Instruction INTERFACE
// AND OVERRIDE THE toString METHOD
public class BlockInstruction implements Instruction
{
	private ArrayList<Instruction> instructs; 

  /**
   * Constructs an empty sequence of instructions.
   */
  public BlockInstruction()
  {
  }

  /**
   * Adds an instruction to this block.  The instructions will be executed
   * in the order added.
   * @param s
   *   instruction to be added to this block
   */
  public void addStatement(Instruction s)
  {
	  instructs.add(s);
  }

  /**
   * @param arg0
   * 	the index of the child 
   * @return child 
   * returns the specified child
   */
@Override
public ProgramNode getChild(int arg0) {
	// TODO Auto-generated method stub
	return instructs.get(arg0);
}

/**
 * @return string
 * returns the label "block"
 */
@Override
public String getLabel() {
	// TODO Auto-generated method stub
	return "Block";
}

/**
 * @return size
 * returns the number of children
 */
@Override
public int getNumChildren() {
	// TODO Auto-generated method stub
	return instructs.size();
}

/**
 * @return string
 * returns empty string
 */
@Override
public String getText() {
	// TODO Auto-generated method stub
	return "";
}

/**
 * @param env
 * the map of the variable names
 * 
 * executes each instruction
 */
@Override
public void execute(Scope env) {
	// TODO Auto-generated method stub
	for(int i = 0; i < instructs.size(); i++) {
		instructs.get(i).execute(env);
	}
}
  

}

/* 
 * This file is part or JMathLib 
 * 
 * Check it out at http://www.jmathlib.de
 *
 * Author:  
 * (c) 2005-2009   
 */
package jmathlib.toolbox.jmathlib.system;

import jmathlib.core.tokens.Token;
import jmathlib.core.tokens.OperandToken;
import jmathlib.core.tokens.CharToken;
import jmathlib.core.functions.ExternalFunction;
import jmathlib.core.interpreter.Errors;
import jmathlib.core.interpreter.GlobalValues;

/**An external function for displaying error messages
aborts the current function being processed*/
public class error extends ExternalFunction
{
	/**write operand to main display then abort processing
	@param operand[n] = error messages to display*/
	public OperandToken evaluate(Token[] operands, GlobalValues globals)
	{	
		if(operands[0] instanceof CharToken)
		{
			String val = ((CharToken)operands[0]).toString();
			if(val.equals(""))
				return new CharToken("");
		}	
		Errors.throwMathLibException(ERR_USER_ERROR, new Object[] {operands[0]});
		return  null;
	}
}

/*
@GROUP
system
@SYNTAX
error(message)
@DOC
Displays message and aborts the current operation.
@NOTES
@EXAMPLES
Error("There has been an error")
There has been an error
@SEE
warning, exit
*/


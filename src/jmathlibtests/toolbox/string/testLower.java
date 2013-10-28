package jmathlibtests.toolbox.string;

import jmathlib.core.interpreter.Interpreter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testLower extends TestCase {
	protected Interpreter ml;
	
    public testLower(String name) {
		super(name);
	}
	public static void main (String[] args) {
		junit.textui.TestRunner.run (suite());
	}
	protected void setUp() {
		ml = new Interpreter(true);
	}
    protected void tearDown() {
        ml = null;
    }

	public static Test suite() {
		return new TestSuite(testLower.class);
	}

	public void test01() {
        ml.executeExpression("a=\"hello\"");
        ml.executeExpression("b=lower(a)");
		assertTrue(ml.getString("b").equals("hello"));
	}

    public void test02() {
        ml.executeExpression("aa=\"HELLO\"");
        ml.executeExpression("bb=lower(aa)");
        assertTrue(ml.getString("bb").equals("hello"));
    }
    
    public void test03() {
        ml.executeExpression("a=\"heLlo\"");
        ml.executeExpression("b=lower(a)");
        assertTrue(ml.getString("b").equals("hello"));
    }
    public void test04() {
        ml.executeExpression("a=\"HellO\"");
        ml.executeExpression("b=lower(a)");
        assertTrue(ml.getString("b").equals("hello"));
    }
    public void test05() {
        ml.executeExpression("a=\"HeLLO\"");
        ml.executeExpression("b=lower(a)");
        assertTrue(ml.getString("b").equals("hello"));
    }




}

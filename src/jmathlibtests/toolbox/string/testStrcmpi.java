package jmathlibtests.toolbox.string;

import jmathlib.tools.junit.framework.JMathLibTestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class testStrcmpi extends JMathLibTestCase {
	
    public testStrcmpi(String name) {
		super(name);
	}
	public static void main (String[] args) {
		junit.textui.TestRunner.run (suite());
	}

	public static Test suite() {
		return new TestSuite(testStrcmpi.class);
	}

	public void testStrcmpi01() {
		assertEvalScalarEquals("a=strcmpi('abcd','abcd');", "a", 1);
	}
    public void testStrcmpi02() {
        assertEvalScalarEquals("a=strcmpi('abcd','ABCD');", "a", 1);
    }
    public void testStrcmpi03() {
        assertEvalScalarEquals("a=strcmpi('abcd','AbCd');", "a", 1);
    }
    public void testStrcmpi04() {
        assertEvalScalarEquals("a=strcmpi('abcd','ABCd');", "a", 1);
    }
    public void testStrcmpi05() {
        assertEvalScalarEquals("a=strcmpi('aBCd','abcd');", "a", 1);
    }
    public void testStrcmpi06() {
        assertEvalScalarEquals("a=strcmpi('aBCd','axcd');", "a", 0);
    }
    public void testStrcmpi07() {
        assertEvalScalarEquals("a=strcmpi('abcd','abcde');", "a", 0);
    }



}

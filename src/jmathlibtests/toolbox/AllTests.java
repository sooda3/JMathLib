package jmathlibtests.toolbox;

import junit.framework.*;

/**
 * TestSuite that runs all the tests
 *
 */
public class AllTests {

	public static void main (String[] args) {
	    junit.textui.TestRunner.run (suite());
	}
	public static Test suite ( ) {
		TestSuite suite= new TestSuite("functions");

		/* include subdirectories here */
        suite.addTest(jmathlibtests.toolbox.audio.AllTests.suite());
		suite.addTest(jmathlibtests.toolbox.control.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.crypto.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.demos.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.deprecated.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.engine.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.finance.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.ftp.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.funfun.AllTests.suite());
		suite.addTest(jmathlibtests.toolbox.general.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.help.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.image.AllTests.suite());
		//suite.addTest(jmathlibtests.toolbox.GuiTools.AllTests.suite());
		suite.addTest(jmathlibtests.toolbox.io.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.integration.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.jmathlib.AllTests.suite());
		suite.addTest(jmathlibtests.toolbox.linearalgebra.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.miscellaneous.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.net.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.ode.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.optimization.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.physical_constants.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.polynomial.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.quaternion.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.set.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.signal.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.sparse.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.specfun.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.specialmatrix.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.splines.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.statistics.AllTests.suite());
		suite.addTest(jmathlibtests.toolbox.string.AllTests.suite());
        //suite.addTest(jmathlibtests.toolbox.symbolic.AllTests.suite());
		suite.addTest(jmathlibtests.toolbox.test.AllTests.suite());
		suite.addTest(jmathlibtests.toolbox.time.AllTests.suite());
        suite.addTest(jmathlibtests.toolbox.toolbox_skeleton.AllTests.suite());
		suite.addTest(jmathlibtests.toolbox.trigonometric.AllTests.suite());
		suite.addTest(jmathlibtests.toolbox.video.AllTests.suite());
        
        /* include tests in this directory */
        suite.addTest(jmathlibtests.toolbox.testFunctions.suite());
        suite.addTest(jmathlibtests.toolbox.testStandardFunctions.suite());
        suite.addTest(jmathlibtests.toolbox.testUserFunction.suite());


	    return suite;
	}
}

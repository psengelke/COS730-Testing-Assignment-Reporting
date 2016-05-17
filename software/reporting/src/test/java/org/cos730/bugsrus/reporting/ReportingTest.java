package org.cos730.bugsrus.reporting;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Bugs R Us
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ReportingTestConfig.class})
public class ReportingTest {

    /**
     *
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void serviceOrMethod1_scenario1() throws Exception {
        // when testing a precondition replace Exception with the particular
        // exception that will be thrown if the service is correctly refused   

    }

    /**
     *
     */
    @Test
    public void serviceOrMethod1_scenario2() {

    }

    /**
     *
     */
    @Test
    public void serviceOrMethod2_scenario1() {

    }

    /**
     *
     */
    @Test
    public void serviceOrMethod2_scenario2() {

    }

    @Before
    /**
     *
     */
    public void setup() {
        //set up test data to be used by every test
        //this method runs once before every test method and its 
        //members are accessible by the test methods
    }

    @After
    /**
     *
     */
    public void clean() {
        //whatever needs to be deleted/refreshed before the next test runs
    }
}

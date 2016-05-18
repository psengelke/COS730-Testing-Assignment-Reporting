package org.cos730.bugsrus.reporting;

import java.util.HashMap;
import java.util.Map;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Bugs R Us
 */
@RunWith(MockitoJUnitRunner.class)
public class ReportingTest {

    @Mock
    Delegate delegateMock;

    @InjectMocks
    Example example;

    /**
     *
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void getAccreditationUnitsReport_perGroup() throws Exception {
        // when testing a precondition replace Exception with the particular
        // exception that will be thrown if the service is correctly refused   
            
    }

    /**
     *
     */
    @Test
    public void serviceOrMethod1_scenario2() {
        example.doSomething();        
        verify(delegateMock).execute();
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

    Map<String, Object> fieldData;
    public void setFieldData(Map<String, Object> dat)
    {
        this.fieldData=dat;
    }
    @Before
    /**
     *
     */
    public void setup() {
        //set up test data to be used by every test
        //this method runs once before every test method and its 
        //members are accessible by the test methods
         fieldData = new HashMap<String,Object>();
        fieldData.put("PUBLICATION_TYPE","CONFERENCE PAPER");// other possibilites are journal artile, survey, litrature review, etc
        fieldData.put("AUTHOR","T. TESTER"); 
        fieldData.put("CO-AUTHOR(s)","T. TESTER1,T. TESTER2,T. TESTER3");
        fieldData.put("RESEARCH_GROUP","CIRG");
        fieldData.put("LIFECYCLE_STATE","REVIEWED"); // other possibilites are REJECTED, ACCEPTED, etc
        fieldData.put("DATE","18-05-2016"); 
        
        setFieldData(fieldData);
        
    }

    @After
    /**
     *
     */
    public void clean() {
        //whatever needs to be deleted/refreshed before the next test runs
    }
    
    
}

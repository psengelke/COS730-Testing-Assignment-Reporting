package org.cos730.bugsrus.reporting;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;

import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Bugs R Us
 */
@RunWith(MockitoJUnitRunner.class)
public class ReportingTest {

    private Map<String, Object> fieldData;

    @Test
    public void testAccreditationByEntity() throws Exception {

    }

    @Test
    public void testAccreditationByPublicationType() throws Exception {

    }

    @Test
    public void testAccreditationByLifeCycleState() throws Exception {

    }

    @Test
    public void testAccreditationByCombination() throws Exception {

    }

    @Test
    public void testResearchStatusByEntity() throws Exception {

    }

    @Test
    public void testResearchStatusByPublicationType() throws Exception {

    }

    @Test
    public void testResearchStatusByCombination() throws Exception {

    }

    /**
     * Set up test data to be used by every test.
     * This method runs once before each test method.
     */
    @Before
    public void setup() {

        fieldData = new HashMap<>();
        fieldData.put("PUBLICATION_TYPE", "CONFERENCE PAPER");// other possibilites are journal artile, survey, litrature review, etc
        fieldData.put("AUTHOR", "T. TESTER");
        fieldData.put("CO-AUTHOR(s)", "T. TESTER1,T. TESTER2,T. TESTER3");
        fieldData.put("RESEARCH_GROUP", "CIRG");
        fieldData.put("LIFECYCLE_STATE", "REVIEWED"); // other possibilites are REJECTED, ACCEPTED, etc
        fieldData.put("DATE", "18-05-2016");
    }

    /**
     *
     */
    @After
    public void clean() {
        //whatever needs to be deleted/refreshed before the next test runs
    }
}

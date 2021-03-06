package org.cos730.bugsrus.reporting;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.persistence.EntityManager;

import net.sf.jasperreports.engine.JasperReport;
import org.cos730.bugsrus.reporting.mock.*;

import org.cos730.bugsrus.reporting.mock.filter.EntityFilter;
import org.cos730.bugsrus.reporting.mock.filter.Filter;
import org.cos730.bugsrus.reporting.mock.filter.LifeCycleStateFilter;
import org.cos730.bugsrus.reporting.mock.filter.PublicationFilter;
import org.cos730.bugsrus.reporting.mock.types.LifeCyleState;
import org.cos730.bugsrus.reporting.mock.types.PublicationType;
import org.junit.*;
import org.junit.runner.Request;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

/**
 * @author Bugs R Us
 */
@RunWith(MockitoJUnitRunner.class)
public class ReportingTest {

    private Map<String, Object> fieldData;

    @Mock
    private EntityManager em;

    @InjectMocks
    private ReportGenerator rg;

    private void testNotNullRepsonse() throws Exception {

    }

    @Test
    public void testAccreditationNoData() throws Exception {

    }

    @Test
    public void testResearchStatusNoData() throws Exception {

    }

    @Test
    public void testAccreditationByEntity() throws Exception {        
        LinkedList<Filter> filters = new LinkedList<>();
        filters.add(new EntityFilter("John", false));

        AccreditationReportResponse res =
                rg.requestAccreditationReport(new AccreditationReportRequest(filters));
        LinkedList<String> names = res.getReportData().get("EntityID");
        for (String e : names) {
            Assert.assertEquals("testAccreditationByEntity:CorrectEntity", "John", e);
        }

        filters = new LinkedList<>();
        filters.add(new EntityFilter("Group A", true));

        res = rg.requestAccreditationReport(new AccreditationReportRequest(filters));
        HashMap<String, LinkedList<String>> data = res.getReportData();
        Assert.assertEquals("testAccreditationByEntity:SingleGroup", 1, data.get("EntityID").size());
        Assert.assertEquals("testAccreditationByEntity:CorrectGroup", "Group A", data.get("EntityID").getFirst());
    }

    @Test
    public void testAccreditationByPublicationType() throws Exception {        
        LinkedList<Filter> filters = new LinkedList<>();
        filters.add(new PublicationFilter(PublicationType.BookChapter));

        AccreditationReportResponse res =
                rg.requestAccreditationReport(new AccreditationReportRequest(filters));
        LinkedList<String> lfs = res.getReportData().get("PublicationType");
        for (String e : lfs) {
            Assert.assertEquals("testAccreditationByPublicationType:CorrectPublicationType", PublicationType.BookChapter, e);
        } 

    }

    @Test
    public void testAccreditationByLifeCycleState() throws Exception {        
        LinkedList<Filter> filters = new LinkedList<>();
        filters.add(new LifeCycleStateFilter(LifeCyleState.InRevision));

        AccreditationReportResponse res =
                rg.requestAccreditationReport(new AccreditationReportRequest(filters));
        LinkedList<String> lfs = res.getReportData().get("EntityID");
        for (String e : lfs) {
            Assert.assertEquals("testAccreditationByLifeCycleState:CorrectLifeCycleState", LifeCyleState.InRevision, e);
        } 
    }

    @Test
    public void testAccreditationByCombination() throws Exception {
        LinkedList<Filter> filters = new LinkedList<>();
        filters.add(new EntityFilter("John", false));
        filters.add(new LifeCycleStateFilter(LifeCyleState.Submitted));
        filters.add(new PublicationFilter(PublicationType.Journal));

        AccreditationReportResponse res =
                rg.requestAccreditationReport(new AccreditationReportRequest(filters));
        
        LinkedList<String> names = res.getReportData().get("EntityID");
        LinkedList<String> lifeCycles = res.getReportData().get("PublicationLifeCycleState");
        LinkedList<String> types = res.getReportData().get("PublicationType");
        
        for (String e : names) {
            Assert.assertEquals("testAccreditationByEntity:CorrectEntity", "John", e);
        }  
        
        for (String e : lifeCycles) {
            Assert.assertEquals("testAccreditationByEntity:CorrectLifeCycle", LifeCyleState.Submitted, e);
        }
        
        for (String e : types) {
            Assert.assertEquals("testAccreditationByEntity:CorrectPublicationType", PublicationType.Journal, e);
        }
    }

    @Test
    public void testResearchStatusByEntity() throws Exception {

        
        LinkedList<Filter> filters = new LinkedList<>();
        filters.add(new EntityFilter("John", false));

        ProgressStateResponse res =
                rg.requestProgressStateReport(new ProgressStateReportRequest(filters));
        for (String e : res.getReportData().get("EntityID")) {
            Assert.assertEquals("testAccreditationByEntity:CorrectEntity", "John", e);
        }
        for (String e : res.getReportData().get("PublicationLifeCycleState")){
            Assert.assertEquals("testAccreditationByEntity:CorrectPublicationLifeCycleState",
                    LifeCyleState.InProgress.toString(), e);
        }

        filters = new LinkedList<>();
        filters.add(new EntityFilter("Group A", true));

        res = rg.requestProgressStateReport(new ProgressStateReportRequest(filters));
        for (String e : res.getReportData().get("GroupID")) {
            Assert.assertEquals("testAccreditationByEntity:CorrectGroup", "Group A", e);
        }
        for (String e : res.getReportData().get("PublicationLifeCycleState")){
            Assert.assertEquals("testAccreditationByEntity:CorrectPublicationLifeCycleState",
                    LifeCyleState.InProgress.toString(), e);
        }
    }

    @Test
    public void testResearchStatusByPublicationType() throws Exception {
 
        ReportGenerator rg = new ReportGenerator();
        LinkedList<Filter> filters = new LinkedList<>();
        filters.add(new PublicationFilter(PublicationType.Conference));

        ProgressStateResponse res =
                rg.requestProgressStateReport(new ProgressStateReportRequest(filters));
        LinkedList<String> pubs = res.getReportData().get("PublicationName");
        for (String e : pubs) {
            Assert.assertEquals("testProgressByPublication:CorrectPublication", PublicationType.Conference, e);
        }
   }

    @Test
    public void testResearchStatusByCombination() throws Exception {
LinkedList<Filter> filters = new LinkedList<>();
        filters.add(new EntityFilter("John", false));
        filters.add(new PublicationFilter(PublicationType.Conference));

        AccreditationReportResponse res =
                rg.requestAccreditationReport(new AccreditationReportRequest(filters));
        
        LinkedList<String> names = res.getReportData().get("EntityID");
        LinkedList<String> types = res.getReportData().get("PublicationType");
        
        for (String e : names) {
            Assert.assertEquals("testAccreditationByEntity:CorrectEntity", "John", e);
        }               
        
        for (String e : types) {
            Assert.assertEquals("testAccreditationByEntity:CorrectPublicationType", PublicationType.Conference, e);
        }
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

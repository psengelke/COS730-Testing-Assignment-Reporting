package org.cos730.bugsrus.reporting.mock;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * @author Bugs R Us
 */
public class ReportGenerator {
    
    private EntityManager em;

    public AccreditationReportResponse requestAccreditationReport(AccreditationReportRequest req) throws NoDataException, InvalidInputException{
 
        return new AccreditationReportResponse(null);
    }

    public ProgressStateResponse requestProgressStateReport(ProgressStateReportRequest req) throws NoDataException, InvalidInputException{ 

        return new ProgressStateResponse(null);
    }
    
    @Inject
    void setEntityManager(EntityManager em){
        this.em = em;
    }
}

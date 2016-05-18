package org.cos730.bugsrus.reporting.mock;

/**
 * @author Bugs R Us
 */
public class ReportGenerator {

    public AccreditationReportResponse requestAccreditationReport(AccreditationReportRequest req) throws NoDataException, InvalidInputException{
 
        return new AccreditationReportResponse(null);
    }

    public ProgressStateResponse requestProgressStateReport(ProgressStateReportRequest req) throws NoDataException, InvalidInputException{ 

        return new ProgressStateResponse(null);
    }
}

package org.cos730.bugsrus.reporting.mock;

/**
 * @author Bugs R Us
 */
public class ReportGenerator {

    public AccreditationReportResponse requestAccreditationReport(AccreditationReportRequest req){

        return new AccreditationReportResponse(null);
    }

    public ProgressStateResponse requestProgressStateReport(ProgressStateReportRequest req){

        return new ProgressStateResponse(null);
    }
}

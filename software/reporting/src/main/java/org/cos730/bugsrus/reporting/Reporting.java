package org.cos730.bugsrus.reporting;

import org.apache.commons.lang.NotImplementedException;

/**
 * This is a stub class created for tested purposes. The supplied code does
 * not adhere to the requirements and therefore tests will not compile without
 * this stub
 * 
 * @author Bugs R Us
 */
public interface Reporting {

    public AccreditationReportResult getAccreditationReport(AccreditationReportRequest request) throws NoDataException, InvalidInputException; 
    
     public ProgressReportResult getProgressReport(ProgressReportRequest request) throws NoDataException, InvalidInputException;
}

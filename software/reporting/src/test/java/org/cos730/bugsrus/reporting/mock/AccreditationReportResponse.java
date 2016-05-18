package org.cos730.bugsrus.reporting.mock;

import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author Bugs R Us
 */
public class AccreditationReportResponse {

    private final JasperReport report;

    public AccreditationReportResponse(JasperReport report){
        this.report = report;
    }

    public JasperReport getReport(){
        return this.report;
    }
}

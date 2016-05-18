package org.cos730.bugsrus.reporting.mock;

import net.sf.jasperreports.engine.JasperReport;

/**
 * @author Paul Engelke
 */
public class ProgressStateResponse {

    private final JasperReport report;

    public ProgressStateResponse(JasperReport report){
        this.report = report;
    }

    public JasperReport getReport(){
        return this.report;
    }
}

package org.cos730.bugsrus.reporting.mock;

import net.sf.jasperreports.engine.JasperReport;

import java.util.HashMap;
import java.util.LinkedList;

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

    public HashMap<String, LinkedList<String>> getReportData(){

        return null;
    }
}

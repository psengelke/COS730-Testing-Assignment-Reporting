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

        HashMap<String, LinkedList<String>> data = new HashMap<>();

        LinkedList<String> cols = new LinkedList<>();
        cols.add("");
        cols.add("");
        cols.add("");
        data.put("EntityID", cols);
        data.put("PublicationName", cols);
        data.put("PublicationType", cols);
        data.put("PublicationLifeCycleState", cols);
        data.put("PublicationCredit", cols);
        data.put("PublicationData", cols);

        return data;
    }
}

package org.cos730.bugsrus.reporting.mock;

import net.sf.jasperreports.engine.JasperReport;

import java.util.HashMap;
import java.util.LinkedList;

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

    public HashMap<String, LinkedList<String>> getReportData(){

        HashMap<String, LinkedList<String>> data = new HashMap<>();

        LinkedList<String> cols = new LinkedList<>();
        cols.add("");
        cols.add("");
        cols.add("");
        cols.add("");
        data.put("EntityID", cols);
        data.put("GroupID", cols);
        data.put("PublicationName", cols);
        data.put("PublicationType", cols);
        data.put("PublicationLifeCycleState", cols);
        data.put("PublicationCredit", cols);
        data.put("PublicationData", cols);

        return data;
    }
}

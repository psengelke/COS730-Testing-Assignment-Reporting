package org.cos730.bugsrus.reporting.mock.filter;

import org.cos730.bugsrus.reporting.mock.types.PublicationType;

/**
 * @author Paul Engelke
 */
public class PublicationFilter implements Filter {

    public PublicationFilter(PublicationType type){

    }

    @Override
    public String getQueryString() {
        return null;
    }
}

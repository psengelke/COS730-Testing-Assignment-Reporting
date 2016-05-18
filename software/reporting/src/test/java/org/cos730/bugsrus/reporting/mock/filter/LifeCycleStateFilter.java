package org.cos730.bugsrus.reporting.mock.filter;

import org.cos730.bugsrus.reporting.mock.types.LifeCyleState;

/**
 * @author Paul Engelke
 */
public class LifeCycleStateFilter implements Filter {

    public LifeCycleStateFilter(LifeCyleState state){
        
    }

    @Override
    public String getQueryString() {
        return null;
    }
}

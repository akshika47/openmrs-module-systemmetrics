package org.openmrs.module.systemmetrics;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.systemmetrics.api.PerformanceMonitoringService;

public class PerformanceMonitoringUtils {

    public static Log log = LogFactory.getLog(PerformanceMonitoringUtils.class);

    /**
     * Returns the PerformanceMonitoring service from the Context
     *
     * @return PerformanceMonitoring service
     */
    public static PerformanceMonitoringService getService() {
        return Context.getService(PerformanceMonitoringService.class);
    }
}
package org.openmrs.module.systemmetrics;


import javax.persistence.Column;
import javax.persistence.Id;

public class AverageMetricValuePerMin {


    @Column(name = "timestamp")
    private long timestamp;

    @Column(name = "metric_id")
    private int metricId;

    @Id
    @Column(name = "metric_value")
    private long metricValue;

    public AverageMetricValuePerMin (int metric_id, long timestamp, long metric_value) {
        this.metricId = metric_id;
        this.timestamp= timestamp;
        this.metricValue=metric_value;
    }

    public int getMetricId() {
        return metricId;
    }

    public void setMetricId(int metricId) {
        this.metricId = metricId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getMetricValue() {
        return metricValue;
    }

    public void setMetricValue(long metricValue) {
        this.metricValue = metricValue;
    }
}

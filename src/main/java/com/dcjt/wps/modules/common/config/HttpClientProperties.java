package com.dcjt.wps.modules.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="httpclient")
public class HttpClientProperties {
	
    private int connectionRequestTimeout;
    private int connectTimeout;
    private int socketTimeout;
    private int maxConnTotal;    
    private int maxConnPerRoute;
    
    public int getConnectionRequestTimeout() {
        return connectionRequestTimeout;
    }
    
    public void setConnectionRequestTimeout(int connectionRequestTimeout) {
        this.connectionRequestTimeout = connectionRequestTimeout;
    }
    
    public int getConnectTimeout() {
        return connectTimeout;
    }
    
    public void setConnectTimeout(int connectionTimeout) {
        this.connectTimeout = connectionTimeout;
    }
    
    public int getSocketTimeout() {
        return socketTimeout;
    }
    
    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }
    
    public int getMaxConnTotal() {
        return maxConnTotal;
    }
    
    public void setMaxConnTotal(int maxConnTotal) {
        this.maxConnTotal = maxConnTotal;
    }
    
    public int getMaxConnPerRoute() {
        return maxConnPerRoute;
    }
    
    public void setMaxConnPerRoute(int maxConnPerRoute) {
        this.maxConnPerRoute = maxConnPerRoute;
    }
    
}

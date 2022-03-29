package com.dcjt.wps.modules.common.config;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class WPS3AuthenticationInterceptor implements ClientHttpRequestInterceptor {
    
    private DateFormat dateFormat;
        
    private String appId;
    
    private String appKey;
    
    public WPS3AuthenticationInterceptor(String appId, String appKey) {
        this.appId = appId;
        this.appKey = appKey;
        
        dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {
        
        String path = request.getURI().getPath();
        
        if (path.startsWith("/open")) {
            path = path.replace("/open", "");
        } else {
            request.getHeaders().set(HttpHeaders.CONTENT_TYPE, "");
            return execution.execute(request, body);
        }
        
        String contentMd5;

        if (body != null && body.length > 0) {
            contentMd5 = DigestUtils.md5Hex(body);
        } else {
            contentMd5 = DigestUtils.md5Hex("".getBytes());
        }
        
        String url = path;
        
        if (request.getURI().getQuery() != null) {
            url += "?" + request.getURI().getQuery();
        }
        
        String contentType = request.getHeaders().getContentType().toString();
        String date = dateFormat.format(new Date());
        String authorizationSha1 = DigestUtils
                .sha1Hex(appKey + contentMd5 + url + contentType + date);
        
        request.getHeaders().add("Content-Md5", contentMd5);
        request.getHeaders().add("Date", date);
        request.getHeaders().add("X-Auth", String.format("WPS-3:%s:%s", appId, authorizationSha1));
        return execution.execute(request, body);
    }

}

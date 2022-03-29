package com.dcjt.wps.modules.centerplatform.schedule;


import com.dcjt.wps.modules.centerplatform.domain.GeApptTokenResponse;
import com.dcjt.wps.modules.centerplatform.service.AppTokenService;
import com.dcjt.wps.modules.common.utils.TokenUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.ServletContext;

/**
 * 描述信息
 * 全局定时任务类
 *
 * @author 杨祎
 * @date 2019/04/24
 */
@Component
public class GlobalSchedule {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private AppTokenService appTokenService;

    @Resource
    private ServletContext servletContext;


    /**
     * 服务启动时、每天8、20点更新token
     */
    @PostConstruct
    @Scheduled(cron = "0 0 8,20 * * ? ")
    public void updateToken() {
        log.info("update token...");
        try {
            GeApptTokenResponse res = appTokenService.getAppToken();
            servletContext.setAttribute(TokenUtils.APP_TOKEN_KEY,res.getToken());
        } catch (Exception e) {
            log.error("update token error:{}", e.getMessage(), e);
        }
    }
}

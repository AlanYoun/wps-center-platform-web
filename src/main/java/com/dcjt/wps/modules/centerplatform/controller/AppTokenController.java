package com.dcjt.wps.modules.centerplatform.controller;

import com.dcjt.wps.modules.centerplatform.domain.GeApptTokenResponse;
import com.dcjt.wps.modules.centerplatform.service.AppTokenService;
import com.dcjt.wps.modules.common.api.R;
import com.dcjt.wps.modules.common.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取app_token控制器
 *
 * @author yy
 */
@RestController
public class AppTokenController {

    @Autowired
    private AppTokenService appTokenService;

    /**
     * 获取app_token
     *
     * @return token
     */
    @GetMapping("/app/token")
    public R<GeApptTokenResponse> getAppToken() {
        GeApptTokenResponse res = appTokenService.getAppToken();
        TokenUtils.setAppToken(res.getToken());
        return R.data(res);
    }

}

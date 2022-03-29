package com.dcjt.wps.modules.centerplatform.controller;

import com.dcjt.wps.modules.centerplatform.domain.online.edit.OnNotifyRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * 描述信息
 * 回调控制器
 *
 * @author yy
 * @date 2021/12/28
 */
@RestController
@RequestMapping("/v1/3rd")
public class OnNotifyController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @PostMapping("/onnotify")
    public void onnotify(@RequestParam("_w_third_appid") String appId,
                         @RequestParam("_w_third_file_id") String fileId,
                         @RequestBody OnNotifyRequest notify) {
        log.info("应用：{}，文件ID：{}，发生回调：{}", appId, fileId, notify);
    }
}

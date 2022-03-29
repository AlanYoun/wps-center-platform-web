package com.dcjt.wps.modules.centerplatform.controller;

import com.dcjt.wps.modules.centerplatform.domain.online.edit.GetOnlineEditUrlResponse;
import com.dcjt.wps.modules.centerplatform.service.FileService;
import com.dcjt.wps.modules.centerplatform.service.OnlineEditService;
import com.dcjt.wps.modules.centerplatform.vo.ReqGetOnlineEditUrlVO;
import com.dcjt.wps.modules.centerplatform.vo.ReqUserInfoVO;
import com.dcjt.wps.modules.centerplatform.vo.RespOnlineEditFileVO;
import com.dcjt.wps.modules.common.api.R;
import com.dcjt.wps.modules.data.entity.WFile;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 在线编辑控制器
 *
 * @author yy
 */
@RestController
@RequestMapping("/online-edit")
public class OnlineEditController {

    @Resource
    private OnlineEditService onlineEditService;

    /**
     * 获取在线编辑链接
     * @param vo 请求参数
     * @return
     */
    @GetMapping("/get-url")
    public R<GetOnlineEditUrlResponse> getOnlineEditUrl(ReqGetOnlineEditUrlVO vo) {
        return R.data(onlineEditService.getUrl(vo.getFileId(), vo));
    }
}
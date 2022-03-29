package com.dcjt.wps.modules.centerplatform.controller;

import com.dcjt.wps.modules.centerplatform.service.FileService;
import com.dcjt.wps.modules.centerplatform.vo.ReqCopyFileVO;
import com.dcjt.wps.modules.centerplatform.vo.ReqUserInfoVO;
import com.dcjt.wps.modules.centerplatform.vo.RespFileInfoVO;
import com.dcjt.wps.modules.centerplatform.vo.RespOnlineEditFileVO;
import com.dcjt.wps.modules.common.api.R;
import com.dcjt.wps.modules.data.entity.WFile;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 描述信息
 * wps文件控制器
 *
 * @author yy
 * @date 2021/12/28
 */
@RestController
@RequestMapping("/file")
public class WpsFileController {

    @Resource
    private FileService fileService;

    /**
     * 创建wps文件
     *
     * @param file 文件
     * @param user 用户信息
     */
    @PostMapping("/new")
    public R<RespOnlineEditFileVO> fileNew(@RequestBody MultipartFile file, ReqUserInfoVO user) {
        return R.data(fileService.fileNew(file, user));
    }

    /**
     * 复制文件
     *
     * @param cf 请求参数
     * @return
     */
    @PostMapping("copy")
    public R<RespOnlineEditFileVO> fileCopy(@RequestBody ReqCopyFileVO cf) {
        return R.data(fileService.fileCopy(cf.getFileId(), cf));
    }

    /**
     * 获取文件信息
     *
     * @param id 文件id
     * @return 文件信息
     */
    @GetMapping("/info")
    public R<RespFileInfoVO> info(@RequestParam String id) {
        WFile file = fileService.getWFile(id);
        if (Objects.isNull(file)) {
            return R.fail("文件不存在");
        }
        RespFileInfoVO fileVO = new RespFileInfoVO();
        fileVO.setId(file.getId());
        fileVO.setName(file.getName());
        fileVO.setDownloadUrl(file.getDownloadUrl());
        return R.data(fileVO);
    }

    /**
     * 删除文件信息
     *
     * @param id 文件id
     * @return 文件信息
     */
    @PostMapping("/remove/{id}")
    public R<Boolean> remove(@PathVariable String id) {
        return R.data(fileService.remove(id));
    }

}

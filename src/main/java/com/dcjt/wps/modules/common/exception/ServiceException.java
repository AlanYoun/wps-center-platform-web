package com.dcjt.wps.modules.common.exception;

/**
 * 描述信息
 * 自定义服务异常
 *
 * @author yy
 * @date 2021/12/28
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 2359767895161832954L;

    public ServiceException(String message) {
        super(message);
    }
}

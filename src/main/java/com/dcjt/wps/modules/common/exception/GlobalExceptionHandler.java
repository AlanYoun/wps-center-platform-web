package com.dcjt.wps.modules.common.exception;

import com.dcjt.wps.modules.common.api.R;
import com.sun.jndi.toolkit.url.UrlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 描述信息
 * 全局异常处理
 *
 * @author yy
 * @date 2021/12/29
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(value = ServiceException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public R serviceExceptionHandler(ServiceException e) {
        log.error("业务异常:",e);
        return R.fail( e.getMessage());
    }

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public R handleError(Throwable e) {
        log.error("服务器异常", e);
        //发送服务异常事件
        return R.fail(HttpStatus.INTERNAL_SERVER_ERROR.value(), (ObjectUtils.isEmpty(e.getMessage()) ? "服务器异常": e.getMessage()));
    }
}

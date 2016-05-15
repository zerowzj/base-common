package com.company.project.common.exception.system;

import com.company.project.common.exception.BaseException;
import com.company.project.common.exception.util.ExceptionUtil;

/**
 * 系统异常
 *
 * @author wangzhj
 */
public class SystemException extends BaseException {

    public SystemException(String errorDesc, Throwable cause){
        this(null, errorDesc, cause);
    }

    public SystemException(String errorCode, String errorDesc, Throwable cause){
        super(errorCode, errorDesc, ExceptionUtil.getMessageOfSystemException(errorDesc), cause);
    }
}

package org.ko.analysis.conf.exp;

import org.ko.analysis.conf.api.IResponseCode;
import org.ko.analysis.core.exp.CustomRuntimeException;

/**
 * GeneralException
 */
public class BusinessException extends CustomRuntimeException {

    private static final long serialVersionUID = 1633213333563068730L;

    private Integer code;

    public BusinessException() {}

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(IResponseCode responseCode) {
        super(responseCode.getMessage());
        this.code = responseCode.getCode();
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}

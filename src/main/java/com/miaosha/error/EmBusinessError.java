package com.miaosha.error;

/**
 * Created by Administrator on 2019/4/11 0011.
 */
public enum EmBusinessError implements CommonError {

    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),
    USER_NOT_EXIST(20001,"用户不存在")
    ;

    private int errorCode;
    private String errorMsg;



    EmBusinessError(int code, String msg) {
        this.errorCode = code;
        this.errorMsg = msg;
    }

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errorMsg;
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
        this.errorMsg=errorMsg;
        return this;
    }
}

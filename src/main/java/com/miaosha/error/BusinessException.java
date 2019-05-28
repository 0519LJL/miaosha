package com.miaosha.error;

/**
 * Created by Administrator on 2019/4/11 0011.
 */
public class BusinessException extends Exception implements CommonError {

    private CommonError commonError;

    //直接接收EmBusinessError的传参用于构造业务异常
    public BusinessException(CommonError error){
        super();
        this.commonError = error;
    }

    //
    public BusinessException(CommonError error,String msg){
        super();
        this.commonError = error;
        this.commonError.setErrorMsg(msg);
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return this.commonError.getErrorMsg();
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
        this.commonError.setErrorMsg(errorMsg);
        return this;
    }
}

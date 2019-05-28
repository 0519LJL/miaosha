package com.miaosha.error;

/**
 * Created by Administrator on 2019/4/11 0011.
 */
public interface CommonError {
    public int getErrorCode();
    public String getErrorMsg();
    public CommonError setErrorMsg(String ErrorMsg);
}

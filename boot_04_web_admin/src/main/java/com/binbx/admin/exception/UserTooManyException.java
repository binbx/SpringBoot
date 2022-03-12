package com.binbx.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Description: 自定义异常
 * @ClassName: UserTooManyException
 * @Author: bxie
 * @Date: 2022/3/12
 */
@ResponseStatus(value= HttpStatus.FORBIDDEN,reason = "用户数量太多")
public class UserTooManyException extends RuntimeException {

    //无参有参构造器
    public  UserTooManyException(){
    }
    public  UserTooManyException(String message){
        super(message);
    }
}

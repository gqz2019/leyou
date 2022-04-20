package com.gqz.commons;

/**
 * <p>返回状态码</p>
 *
 * @author gqz20
 * @create 2021-10-23 15:13
 **/
public interface StatusCode {
    int OK = 20000;//成功
    int ERROR = 20001;//失败
    int LOGINERROR = 20002;//用户名或密码错误
    int ACCESSERROR = 20003;//权限不足
    int REMOTEERROR = 20004;//远程调用失败
    int REPERROR = 20005;//重复操作
    int NOTFOUNDERROR = 20006;//没有对应的抢购数据
}

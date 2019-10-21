package com.springboot.manager.ExceptionHandle;

import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestControllerAdvice
public class ControllerExceptionHandler {
    /**
     * 参数校验会抛出此类异常
     * （使用BindingResult或Errors接收校验结果，手动抛出的异常）
     *
     * @param response
     * @return
     */
    @ExceptionHandler(ServletRequestBindingException.class)
    public void handleBindException(HttpServletResponse response) throws IOException {

        System.out.println(Thread.currentThread().getName());
        response.sendRedirect("error");
    }
}

package com.example.demo.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理页面
 *
 * @author ROG
 * @create 2017-10-21-14:22
 */
@ControllerAdvice
public class ExceptionHandler {

    private static  final String DEFAULT_ERROR_VIEW = "error";

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandle(HttpServletRequest request,Exception e)throws  Exception
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception",e);
        modelAndView.addObject("url",request.getRequestURI());
        modelAndView.setViewName(DEFAULT_ERROR_VIEW);
        return modelAndView;
    }


}

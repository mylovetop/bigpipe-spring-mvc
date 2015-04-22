/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.springapp.mvc.controller.bigpage;

import com.springapp.mvc.bigpipe.BigPipeContext;
import com.springapp.mvc.bigpipe.Pagelet;
import com.springapp.mvc.bigpipe.PageletResult;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-7-28 下午8:20
 * <p>Version: 1.0
 */
@Controller("bigpipe/part3")
public class Part3Pagelet implements Pagelet {


    @Override
    public PageletResult run(final BigPipeContext context, final HttpServletResponse response) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        context.put("msg", "这是第三段内容");


        return PageletResult.pageletResult("part3")
                .container("part3")
                .cssUrl("/static/bigpipe/part3.css")
                .jsUrl("/static/bigpipe/part3.js");
    }
}

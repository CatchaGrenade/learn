package com.csq.jwlearn.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo2 implements Servlet {
    /**
     * 在servlet被创建时调用（被第一次访问或配置访问时机(load-on-startup)），只会执行一次
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init2....");
    }

    /**
     * 来获取servletConfig对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务方法，每一次Servlet被访问时执行
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service2....");
    }

    /**
     * 获取servlet的一些信息如 版本、作者
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法，在servlet被杀死时执行/在服务器正常关闭执行
     */
    @Override
    public void destroy() {
        System.out.println("destroy2....");
    }
}

package com.example.jwlearn2.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/demo4")
public class ServletDemo4 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("demo4");
        /*请求转发,
            1 浏览器地址栏路径不发生变化
            2 只能转发到当前服务器的内部资源
            3 转发在浏览器上只有1个请求
        */
        servletRequest.setAttribute("msg", "sasdadsdasd");
        servletRequest.getRequestDispatcher("/demo5").forward(servletRequest, servletResponse);
    }
}

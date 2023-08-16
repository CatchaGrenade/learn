package com.example.jwlearn2.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(urlPatterns = "/demo5")
public class ServletDemo5 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod());
        System.out.println(req.getContextPath());
        System.out.println(req.getServletPath());
        System.out.println(req.getQueryString());
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getProtocol());
        System.out.println(req.getRemoteAddr());

        Enumeration<String> headNames = req.getHeaderNames();
        while (headNames.hasMoreElements()){
            String name = headNames.nextElement();
            String value = req.getHeader(name);
            System.out.println(name+"=========="+value);
        }

        System.out.println(req.getParameter("userName"));
        System.out.println(req.getAttribute("msg"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
//        BufferedReader br = req.getReader();
//        String line = null;
//        while ((line = br.readLine()) != null){
//            System.out.println(line);
//        }

        System.out.println(req.getParameter("userName"));
    }
}

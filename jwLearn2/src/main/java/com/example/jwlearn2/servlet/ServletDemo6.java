package com.example.jwlearn2.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo6")
public class ServletDemo6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie c1 = new Cookie("msg", "hello");
//        c1.setPath("/ss");
        Cookie c2 = new Cookie("msg2", "hello2");
        response.addCookie(c1);
        response.addCookie(c2);
        Cookie[] c = request.getCookies();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].getName());
        }
    }
}

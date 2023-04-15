package com.example.demo;

import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


public class Info extends HttpServlet {
    private String message;

    public void init() {
        message = "Бабков Андрей Сергеевич , 2 курс , группа АД-211 , тема курсовой: програма для котнтроля собственных свредств";
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
    public void destroy() {
    }

}


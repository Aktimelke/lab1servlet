package com.example.demo;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.Date;

public class TimeWorker extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Date date = new Date();
        req.setAttribute("date", date.toString());
        req.getRequestDispatcher("time.jsp").forward(req, resp);
    }

}


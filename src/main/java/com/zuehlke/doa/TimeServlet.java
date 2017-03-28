package com.zuehlke.doa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/time" })
public class TimeServlet extends HttpServlet {

    private static final long serialVersionUID = 8741145576684240606L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>My Servlet</h1>");
        out.println("<p>Current time is: ");
        out.println("</p>");
        out.println("</body>");
        out.println("</html>");
        // no close here
    }

}

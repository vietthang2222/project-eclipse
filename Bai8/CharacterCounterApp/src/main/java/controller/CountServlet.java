package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String input = request.getParameter("inputString");
        int count = input.length();

        request.setAttribute("inputString", input);
        request.setAttribute("count", count);

        // Lưu vào session để listener bắt được
        HttpSession session = request.getSession();
        session.setAttribute("inputString", input);

        request.getRequestDispatcher("count.jsp").forward(request, response);
    }
}


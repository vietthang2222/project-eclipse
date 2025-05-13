package filter;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public class InputFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String input = req.getParameter("inputString");

        if (input == null || input.trim().isEmpty()) {
            request.setAttribute("error", "Chuỗi không được rỗng.");
            request.getRequestDispatcher("count.jsp").forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }

    public void init(FilterConfig config) {}
    public void destroy() {}
}

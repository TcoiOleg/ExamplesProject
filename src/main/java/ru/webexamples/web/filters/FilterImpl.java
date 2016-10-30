package ru.webexamples.web.filters;


import ru.webexamples.web.utils.JspUtils;

import javax.servlet.*;
import java.io.IOException;

public class FilterImpl implements Filter
{
    private FilterConfig config = null;
    private boolean active = false;

    public void init (FilterConfig config) throws ServletException
    {
        this.config = config;
        String act = config.getInitParameter("active");
        if (act != null)
            active = (act.toUpperCase().equals("TRUE"));
    }

    public void doFilter (ServletRequest request, ServletResponse response,
                          FilterChain chain) throws IOException,
            ServletException
    {
        if (active) {
            response.getOutputStream().print("FILTER ENABLED: javax.servlet.Filter used for filtering responses. \n");
        }
        if (response.getContentType() == null) {
            response.setContentType("text/html");
        }
        response.getOutputStream().println("<html><body><ul class=\"list\">" +
                JspUtils.createServletExampleListItem("index.jsp", "back") +
                "</ul></body></html>");
        chain.doFilter(request, response);
    }



    public void destroy()
    {
        config = null;
    }
}

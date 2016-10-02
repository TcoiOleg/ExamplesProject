package ru.webexamples.web.filters;


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
        if (active)
        {
            response.getOutputStream().print("FILTER ENABLED: active mafaka\n");
        }
        chain.doFilter(request, response);
    }



    public void destroy()
    {
        config = null;
    }
}

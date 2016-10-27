package ru.webexamples.web.rest.api;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import ru.webexamples.web.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;

@WebServlet("/createUser")
public class CreateUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataSource dataSource = WebContext.getBean("dataSource");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet("select name FROM users where id = 1");
        if (!sqlRowSet.next()) {
            resp.getOutputStream().print("there is no data in table.");
            return;
        }
        resp.getOutputStream().print(sqlRowSet.getString("name"));
    }
}

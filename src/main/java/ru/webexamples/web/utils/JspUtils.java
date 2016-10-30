package ru.webexamples.web.utils;

public class JspUtils {
    public static String createServletExampleListItem (String jspFile, String title) {
        return "<li class=\"list__item\"><a href=\""  + jspFile + "\">" + title + "</a></li>";
    }

    public static class Constants {
        public static final String URI_ARRAY = "array";
    }
}
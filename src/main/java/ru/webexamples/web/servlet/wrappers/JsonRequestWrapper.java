package ru.webexamples.web.servlet.wrappers;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.IOException;

public class JsonRequestWrapper extends HttpServletRequestWrapper {

    //private SerializationFactory serializationFactory = AppContext.<SerializationFactory>getBean("serializationFactory");

    public JsonRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    public JSONObject getJsonObject(){
        JSONObject j = new JSONObject();
        try {
            BufferedReader reader = getRequest().getReader();
            String temp, jsonStr = "";
            while ((temp = reader.readLine()) != null) {
                jsonStr += temp;
            }
            j = (JSONObject) new JSONParser().parse(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return j;
    }
}

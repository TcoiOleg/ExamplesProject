package ru.sgu.acm.solutions.labs;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonExample {
    public static void main(String[] args) throws ParseException {
        JSONObject obj = new JSONObject();

        obj.put("name", "foo");
        obj.put("num", 100);
        obj.put("balance", 1000.21);
        obj.put("is_vip", true);

        System.out.println(obj);

        JSONObject parse = (JSONObject) new JSONParser().parse(obj.toJSONString());
        System.out.println(parse.get("name"));
    }
}

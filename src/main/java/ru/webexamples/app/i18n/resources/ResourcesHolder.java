package ru.webexamples.app.i18n.resources;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class ResourcesHolder {

    public static Map<BigInteger, String> resources = new HashMap<BigInteger, String>(){{
        put(NAME_NOT_VALID_RESOURCE_ID, NAME_NOT_VALID_RESOURCE);
        put(ARRAY_SERVLET_NAME_RESOURCE_ID, ARRAY_SERVLET_NAME_RESOURCE);
    }};

    public static void fillFromParsedJson() {

    }

    public static final BigInteger NAME_NOT_VALID_RESOURCE_ID = BigInteger.valueOf(132L);
    public static final BigInteger ARRAY_SERVLET_NAME_RESOURCE_ID = BigInteger.valueOf(142L);

    public static final String NAME_NOT_VALID_RESOURCE = "Name should be filled.";
    public static final String ARRAY_SERVLET_NAME_RESOURCE = "Array page example";
}

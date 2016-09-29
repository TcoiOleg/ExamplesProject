package ru.webexamples.app.i18n.resources;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class ResourcesHolder {

    public static Map<BigInteger, String> resources = new HashMap<BigInteger, String>(){{
        put(NAME_NOT_VALID_RESOURCE_ID, NAME_NOT_VALID_RESOURCE);
    }};

    public static final BigInteger NAME_NOT_VALID_RESOURCE_ID = BigInteger.valueOf(132L);

    public static final String NAME_NOT_VALID_RESOURCE = "Name should be filled.";
}

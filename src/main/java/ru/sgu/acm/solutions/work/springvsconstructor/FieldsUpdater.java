package ru.sgu.acm.solutions.work.springvsconstructor;

import java.math.BigInteger;
import java.util.*;

/**
 * User: 1
 * Date: 10.09.15
 */
public class FieldsUpdater {

    public GenericRequest genericRequest;
    private final Map<BigInteger, String> ATTR_MAP = new HashMap<BigInteger, String>(){
        {
            put(BigInteger.valueOf(0L), "Nice");
        }
    };


    public FieldsUpdater(GenericRequest genericRequest) {
        this.genericRequest = genericRequest;
        ATTR_MAP.put(BigInteger.ONE, genericRequest.request);
    }

    public List<String> getFields(BigInteger attributeId) {
        String targetValue = ATTR_MAP.get(attributeId);
        if (targetValue != null) {
            return new ArrayList<String>(){{add(targetValue);}};
        } else {
            return Collections.emptyList();
        }
    }
}

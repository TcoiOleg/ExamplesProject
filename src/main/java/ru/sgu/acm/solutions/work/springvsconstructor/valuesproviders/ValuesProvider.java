package ru.sgu.acm.solutions.work.springvsconstructor.valuesproviders;

import java.math.BigInteger;
import java.util.List;

/**
 * User: 1
 * Date: 10.09.15
 */
public interface ValuesProvider {
    List<String> getCriteria(BigInteger attrId);
}

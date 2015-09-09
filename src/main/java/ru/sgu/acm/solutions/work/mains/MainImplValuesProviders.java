package ru.sgu.acm.solutions.work.mains;

import ru.sgu.acm.solutions.TasksContext;
import ru.sgu.acm.solutions.main.Main;
import ru.sgu.acm.solutions.work.springvsconstructor.GenericRequest;
import ru.sgu.acm.solutions.work.springvsconstructor.valuesproviders.ValuesProvider;

import java.math.BigInteger;
import java.util.List;

/**
 * User: 1
 * Date: 10.09.15
 */
public class MainImplValuesProviders implements Main {
    @Override
    public void runMain() {
        GenericRequest request = new GenericRequest("QQW");
        ValuesProvider valuesProvider = (ValuesProvider) TasksContext.getBean("contactVP", request);
        List<String> values = valuesProvider.getCriteria(BigInteger.ONE);
        values.forEach(System.out::println);
    }
}

package ru.sgu.acm.solutions.work.springvsconstructor.valuesproviders.impl;

import ru.sgu.acm.solutions.work.springvsconstructor.FieldsUpdater;
import ru.sgu.acm.solutions.work.springvsconstructor.GenericRequest;
import ru.sgu.acm.solutions.work.springvsconstructor.valuesproviders.ValuesProvider;

import java.math.BigInteger;
import java.util.List;

/**
 * User: 1
 * Date: 10.09.15
 */
public class ValuesProviderImpl implements ValuesProvider {

    protected final FieldsUpdater fieldsUpdater;

    public ValuesProviderImpl(GenericRequest genericRequest) {
        this.fieldsUpdater = new FieldsUpdater(genericRequest);
    }

    @Override
    public List<String> getCriteria(BigInteger attrId) {
        return getFields(attrId);
    }

    protected List<String> getFields(BigInteger attrId) {
        return fieldsUpdater.getFields(attrId);
    }
}

package ru.webexamples.app.api.validation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class EntityValidator {

    public void validate(Object entity) {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(entity);
        String s = "";
        for (ConstraintViolation<Object> cv : constraintViolations) {
            s += (String.format(
                    "property: [%s], value: [%s], message: [%s]",
                    cv.getPropertyPath(), cv.getInvalidValue(), cv.getMessage()));
        }
        if (!s.isEmpty()) {throw new RuntimeException(s);}
    }
}

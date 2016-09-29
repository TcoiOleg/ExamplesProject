package ru.webexamples.app.i18n;

import ru.webexamples.app.i18n.resources.ResourcesHolder;

import java.math.BigInteger;

public class I18nResolver {
    public static String getLocalizedResource(BigInteger resourceId) {
        return ResourcesHolder.resources.get(resourceId);
    }
}

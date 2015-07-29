package ru.sgu.acm.solutions.task.executors.impl.file;

import org.junit.Test;

import java.util.Map;
import java.util.Properties;

/**
 * User: 1
 * Date: 29.07.15
 */
public class FileCreatorUtilsTest {

    @Test
    public void testPath() {
        Properties properties = System.getProperties();
        for (Map.Entry<Object, Object> propertyEntry : properties.entrySet()) {
            //System.out.println(propertyEntry.getKey() + "|" + propertyEntry.getValue());
        }
        System.out.println(System.getProperty("user.dir"));
    }
}

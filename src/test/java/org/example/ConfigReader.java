package org.example;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    public static Properties loadConfig(String env) {

        try {
            FileInputStream fis = new FileInputStream(
                    "src/test/resources/config/" + env + ".properties"
            );

            properties = new Properties();
            properties.load(fis);

        } catch (Exception e) {
            throw new RuntimeException("Config load failed: " + env, e);
        }

        return properties;
    }
}

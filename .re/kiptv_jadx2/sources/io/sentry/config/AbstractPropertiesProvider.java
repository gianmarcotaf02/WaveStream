package io.sentry.config;

import B2.a;
import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

abstract class AbstractPropertiesProvider implements PropertiesProvider {
    private final String prefix;
    private final Properties properties;

    public AbstractPropertiesProvider(String str, Properties properties) {
        this.prefix = (String) Objects.requireNonNull(str, "prefix is required");
        this.properties = (Properties) Objects.requireNonNull(properties, "properties are required");
    }

    @Override
    public Map<String, String> getMap(String str) {
        String strO = a.o(new StringBuilder(), this.prefix, str, ".");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.properties.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str2 = (String) entry.getKey();
                if (str2.startsWith(strO)) {
                    map.put(str2.substring(strO.length()), StringUtils.removeSurrounding((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override
    public String getProperty(String str) {
        return StringUtils.removeSurrounding(this.properties.getProperty(this.prefix + str), "\"");
    }

    public AbstractPropertiesProvider(Properties properties) {
        this("", properties);
    }
}

package io.sentry.config;

/* JADX INFO: loaded from: classes4.dex */
public interface PropertiesProvider {
    default java.lang.Boolean getBooleanProperty(java.lang.String str) {
        java.lang.String property = getProperty(str);
        if (property != null) {
            return java.lang.Boolean.valueOf(property);
        }
        return null;
    }

    default java.lang.Double getDoubleProperty(java.lang.String str) {
        java.lang.String property = getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return java.lang.Double.valueOf(property);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    default java.util.List<java.lang.String> getList(java.lang.String str) {
        java.lang.String property = getProperty(str);
        return property != null ? java.util.Arrays.asList(property.split(",")) : java.util.Collections.EMPTY_LIST;
    }

    default java.util.List<java.lang.String> getListOrNull(java.lang.String str) {
        java.lang.String property = getProperty(str);
        if (property != null) {
            return java.util.Arrays.asList(property.split(","));
        }
        return null;
    }

    default java.lang.Long getLongProperty(java.lang.String str) {
        java.lang.String property = getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(property);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String str);

    java.lang.String getProperty(java.lang.String str);

    default java.lang.String getProperty(java.lang.String str, java.lang.String str2) {
        java.lang.String property = getProperty(str);
        return property != null ? property : str2;
    }
}

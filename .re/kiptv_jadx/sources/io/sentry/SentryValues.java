package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class SentryValues<T> {
    private final java.util.List<T> values;

    public static final class JsonKeys {
        public static final java.lang.String VALUES = "values";
    }

    public SentryValues(java.util.List<T> list) {
        this.values = new java.util.ArrayList(list == null ? new java.util.ArrayList<>(0) : list);
    }

    public java.util.List<T> getValues() {
        return this.values;
    }
}

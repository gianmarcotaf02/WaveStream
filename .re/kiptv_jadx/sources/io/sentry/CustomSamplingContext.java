package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomSamplingContext {
    private final java.util.Map<java.lang.String, java.lang.Object> data = new java.util.HashMap();

    public java.lang.Object get(java.lang.String str) {
        io.sentry.util.Objects.requireNonNull(str, "key is required");
        return this.data.get(str);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getData() {
        return this.data;
    }

    public void set(java.lang.String str, java.lang.Object obj) {
        io.sentry.util.Objects.requireNonNull(str, "key is required");
        this.data.put(str, obj);
    }
}

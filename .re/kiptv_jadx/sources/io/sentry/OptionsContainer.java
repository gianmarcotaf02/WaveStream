package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class OptionsContainer<T> {
    private final java.lang.Class<T> clazz;

    private OptionsContainer(java.lang.Class<T> cls) {
        this.clazz = cls;
    }

    public static <T> io.sentry.OptionsContainer<T> create(java.lang.Class<T> cls) {
        return new io.sentry.OptionsContainer<>(cls);
    }

    public T createInstance() {
        return this.clazz.getDeclaredConstructor(null).newInstance(null);
    }
}

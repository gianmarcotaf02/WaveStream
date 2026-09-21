package io.sentry;

public final class OptionsContainer<T> {
    private final Class<T> clazz;

    private OptionsContainer(Class<T> cls) {
        this.clazz = cls;
    }

    public static <T> OptionsContainer<T> create(Class<T> cls) {
        return new OptionsContainer<>(cls);
    }

    public T createInstance() {
        return this.clazz.getDeclaredConstructor(null).newInstance(null);
    }
}

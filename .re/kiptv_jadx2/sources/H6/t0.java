package H6;

public final class t0 extends Error {
    public t0() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public t0(String message) {
        super(message);
        kotlin.jvm.internal.m.e(message, "message");
    }
}

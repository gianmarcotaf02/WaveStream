package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends java.lang.Error {
    public t0() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(java.lang.String message) {
        super(message);
        kotlin.jvm.internal.m.e(message, "message");
    }
}

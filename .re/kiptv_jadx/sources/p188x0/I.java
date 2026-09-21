package p188x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ p188x0.I[] f31051h;

    /* JADX INFO: Fake field, exist only in values array */
    p188x0.I EF5;

    static {
        p188x0.I[] iArr = {new p188x0.I("CounterClockwise", 0), new p188x0.I("Clockwise", 1)};
        f31051h = iArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(iArr);
    }

    public static p188x0.I valueOf(java.lang.String str) {
        return (p188x0.I) java.lang.Enum.valueOf(p188x0.I.class, str);
    }

    public static p188x0.I[] values() {
        return (p188x0.I[]) f31051h.clone();
    }
}

package p027c7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ p027c7.f[] f18515h;

    /* JADX INFO: Fake field, exist only in values array */
    p027c7.f EF5;

    static {
        p027c7.f[] fVarArr = {new p027c7.f("SOURCE", 0), new p027c7.f("BINARY", 1)};
        f18515h = fVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(fVarArr);
    }

    public static p027c7.f valueOf(java.lang.String str) {
        return (p027c7.f) java.lang.Enum.valueOf(p027c7.f.class, str);
    }

    public static p027c7.f[] values() {
        return (p027c7.f[]) f18515h.clone();
    }
}

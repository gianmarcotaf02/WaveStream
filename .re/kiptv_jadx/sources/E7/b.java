package E7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ E7.b[] f3228h;

    /* JADX INFO: Fake field, exist only in values array */
    E7.b EF5;

    static {
        E7.b[] bVarArr = {new E7.b("ERROR_CLASS", 0), new E7.b("ERROR_FUNCTION", 1), new E7.b("ERROR_SCOPE", 2), new E7.b("ERROR_MODULE", 3), new E7.b("ERROR_PROPERTY", 4), new E7.b("ERROR_TYPE", 5), new E7.b("PARENT_OF_ERROR_SCOPE", 6)};
        f3228h = bVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bVarArr);
    }

    public static E7.b valueOf(java.lang.String str) {
        return (E7.b) java.lang.Enum.valueOf(E7.b.class, str);
    }

    public static E7.b[] values() {
        return (E7.b[]) f3228h.clone();
    }
}

package F7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final F7.b f3714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ F7.b[] f3715i;

    static {
        F7.b bVar = new F7.b("FOR_SUBTYPING", 0);
        f3714h = bVar;
        F7.b[] bVarArr = {bVar, new F7.b("FOR_INCORPORATION", 1), new F7.b("FROM_EXPRESSION", 2)};
        f3715i = bVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bVarArr);
    }

    public static F7.b valueOf(java.lang.String str) {
        return (F7.b) java.lang.Enum.valueOf(F7.b.class, str);
    }

    public static F7.b[] values() {
        return (F7.b[]) f3715i.clone();
    }
}

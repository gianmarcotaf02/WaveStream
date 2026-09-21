package J;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J.M f5654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J.M f5655i;
    public static final J.M j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ J.M[] f5656k;

    static {
        J.M m8 = new J.M("None", 0);
        f5654h = m8;
        J.M m9 = new J.M("Selection", 1);
        f5655i = m9;
        J.M m10 = new J.M("Cursor", 2);
        j = m10;
        J.M[] mArr = {m8, m9, m10};
        f5656k = mArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(mArr);
    }

    public static J.M valueOf(java.lang.String str) {
        return (J.M) java.lang.Enum.valueOf(J.M.class, str);
    }

    public static J.M[] values() {
        return (J.M[]) f5656k.clone();
    }
}

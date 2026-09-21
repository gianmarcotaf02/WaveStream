package O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O0.V f7612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O0.V f7613i;
    public static final /* synthetic */ O0.V[] j;

    static {
        O0.V v6 = new O0.V("Min", 0);
        f7612h = v6;
        O0.V v9 = new O0.V("Max", 1);
        f7613i = v9;
        O0.V[] vArr = {v6, v9};
        j = vArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(vArr);
    }

    public static O0.V valueOf(java.lang.String str) {
        return (O0.V) java.lang.Enum.valueOf(O0.V.class, str);
    }

    public static O0.V[] values() {
        return (O0.V[]) j.clone();
    }
}

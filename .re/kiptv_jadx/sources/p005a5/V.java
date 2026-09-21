package p005a5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p005a5.V f14006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p005a5.V f14007i;
    public static final p005a5.V j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p005a5.V f14008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p005a5.V[] f14009l;

    static {
        p005a5.V v6 = new p005a5.V("IDLE", 0);
        f14006h = v6;
        p005a5.V v9 = new p005a5.V("LOADING", 1);
        f14007i = v9;
        p005a5.V v10 = new p005a5.V("LOADED", 2);
        j = v10;
        p005a5.V v11 = new p005a5.V("FAILED", 3);
        f14008k = v11;
        p005a5.V[] vArr = {v6, v9, v10, v11};
        f14009l = vArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(vArr);
    }

    public static p005a5.V valueOf(java.lang.String str) {
        return (p005a5.V) java.lang.Enum.valueOf(p005a5.V.class, str);
    }

    public static p005a5.V[] values() {
        return (p005a5.V[]) f14009l.clone();
    }
}

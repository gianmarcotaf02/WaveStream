package p005a5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class E1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p005a5.E1 f13331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p005a5.E1 f13332i;
    public static final p005a5.E1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p005a5.E1 f13333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p005a5.E1 f13334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p005a5.E1 f13335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p005a5.E1[] f13336n;

    static {
        p005a5.E1 e6 = new p005a5.E1("NoContent", 0);
        f13331h = e6;
        p005a5.E1 e9 = new p005a5.E1("Timeout", 1);
        f13332i = e9;
        p005a5.E1 e10 = new p005a5.E1("ServerError", 2);
        j = e10;
        p005a5.E1 e11 = new p005a5.E1("NetworkError", 3);
        f13333k = e11;
        p005a5.E1 e12 = new p005a5.E1("AuthFailed", 4);
        f13334l = e12;
        p005a5.E1 e13 = new p005a5.E1("Expired", 5);
        f13335m = e13;
        p005a5.E1[] e1Arr = {e6, e9, e10, e11, e12, e13};
        f13336n = e1Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(e1Arr);
    }

    public static p005a5.E1 valueOf(java.lang.String str) {
        return (p005a5.E1) java.lang.Enum.valueOf(p005a5.E1.class, str);
    }

    public static p005a5.E1[] values() {
        return (p005a5.E1[]) f13336n.clone();
    }
}

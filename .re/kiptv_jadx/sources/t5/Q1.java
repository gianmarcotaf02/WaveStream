package t5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class Q1 {
    public static final t5.P1 Companion;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t5.Q1 f28035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t5.Q1 f28036i;
    public static final t5.Q1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t5.Q1 f28037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ t5.Q1[] f28038l;

    static {
        t5.Q1 q9 = new t5.Q1("NONE", 0);
        f28035h = q9;
        t5.Q1 q10 = new t5.Q1("KIPTV", 1);
        f28036i = q10;
        t5.Q1 q11 = new t5.Q1("TRAKT", 2);
        j = q11;
        t5.Q1 q12 = new t5.Q1("BOTH", 3);
        f28037k = q12;
        t5.Q1[] q1Arr = {q9, q10, q11, q12};
        f28038l = q1Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(q1Arr);
        Companion = new t5.P1();
    }

    public static t5.Q1 valueOf(java.lang.String str) {
        return (t5.Q1) java.lang.Enum.valueOf(t5.Q1.class, str);
    }

    public static t5.Q1[] values() {
        return (t5.Q1[]) f28038l.clone();
    }
}

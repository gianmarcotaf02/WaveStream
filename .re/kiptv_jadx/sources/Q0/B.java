package Q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Q0.B f8202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q0.B f8203i;
    public static final Q0.B j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Q0.B f8204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Q0.B f8205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ Q0.B[] f8206m;

    static {
        Q0.B b9 = new Q0.B("Measuring", 0);
        f8202h = b9;
        Q0.B b10 = new Q0.B("LookaheadMeasuring", 1);
        f8203i = b10;
        Q0.B b11 = new Q0.B("LayingOut", 2);
        j = b11;
        Q0.B b12 = new Q0.B("LookaheadLayingOut", 3);
        f8204k = b12;
        Q0.B b13 = new Q0.B("Idle", 4);
        f8205l = b13;
        Q0.B[] bArr = {b9, b10, b11, b12, b13};
        f8206m = bArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bArr);
    }

    public static Q0.B valueOf(java.lang.String str) {
        return (Q0.B) java.lang.Enum.valueOf(Q0.B.class, str);
    }

    public static Q0.B[] values() {
        return (Q0.B[]) f8206m.clone();
    }
}

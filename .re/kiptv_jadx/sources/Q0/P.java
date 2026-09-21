package Q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Q0.P f8310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q0.P f8311i;
    public static final Q0.P j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Q0.P[] f8312k;

    static {
        Q0.P p2 = new Q0.P("IsPlacedInLookahead", 0);
        f8310h = p2;
        Q0.P p9 = new Q0.P("IsPlacedInApproach", 1);
        f8311i = p9;
        Q0.P p10 = new Q0.P("IsNotPlaced", 2);
        j = p10;
        Q0.P[] pArr = {p2, p9, p10};
        f8312k = pArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(pArr);
    }

    public static Q0.P valueOf(java.lang.String str) {
        return (Q0.P) java.lang.Enum.valueOf(Q0.P.class, str);
    }

    public static Q0.P[] values() {
        return (Q0.P[]) f8312k.clone();
    }
}

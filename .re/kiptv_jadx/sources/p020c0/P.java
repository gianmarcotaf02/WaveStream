package p020c0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p020c0.P f18179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p020c0.P f18180i;
    public static final p020c0.P j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p020c0.P f18181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p020c0.P[] f18182l;

    static {
        p020c0.P p2 = new p020c0.P("IGNORED", 0);
        f18179h = p2;
        p020c0.P p9 = new p020c0.P("SCHEDULED", 1);
        f18180i = p9;
        p020c0.P p10 = new p020c0.P("DEFERRED", 2);
        j = p10;
        p020c0.P p11 = new p020c0.P("IMMINENT", 3);
        f18181k = p11;
        p020c0.P[] pArr = {p2, p9, p10, p11};
        f18182l = pArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(pArr);
    }

    public static p020c0.P valueOf(java.lang.String str) {
        return (p020c0.P) java.lang.Enum.valueOf(p020c0.P.class, str);
    }

    public static p020c0.P[] values() {
        return (p020c0.P[]) f18182l.clone();
    }
}

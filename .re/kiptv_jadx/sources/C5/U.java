package C5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class U {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5.U f1139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5.U f1140i;
    public static final C5.U j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5.U f1141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5.U f1142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5.U f1143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C5.U[] f1144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f1145o;

    static {
        C5.U u6 = new C5.U("INFO", 0);
        f1139h = u6;
        C5.U u7 = new C5.U("UP_NEXT", 1);
        f1140i = u7;
        C5.U u8 = new C5.U("CAST", 2);
        j = u8;
        C5.U u9 = new C5.U("FAVORITES", 3);
        f1141k = u9;
        C5.U u10 = new C5.U("RECENT", 4);
        f1142l = u10;
        C5.U u11 = new C5.U("REPLAY", 5);
        f1143m = u11;
        C5.U[] uArr = {u6, u7, u8, u9, u10, u11};
        f1144n = uArr;
        f1145o = com.google.crypto.tink.shaded.protobuf.q0.t(uArr);
    }

    public static p126o6.b a() {
        return f1145o;
    }

    public static C5.U valueOf(java.lang.String str) {
        return (C5.U) java.lang.Enum.valueOf(C5.U.class, str);
    }

    public static C5.U[] values() {
        return (C5.U[]) f1144n.clone();
    }
}

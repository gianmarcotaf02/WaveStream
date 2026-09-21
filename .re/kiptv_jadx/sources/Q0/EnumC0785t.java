package Q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Q0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0785t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Q0.EnumC0785t f8471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q0.EnumC0785t f8472i;
    public static final Q0.EnumC0785t j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Q0.EnumC0785t f8473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Q0.EnumC0785t[] f8474l;

    static {
        Q0.EnumC0785t enumC0785t = new Q0.EnumC0785t("LookaheadMeasurement", 0);
        f8471h = enumC0785t;
        Q0.EnumC0785t enumC0785t2 = new Q0.EnumC0785t("LookaheadPlacement", 1);
        f8472i = enumC0785t2;
        Q0.EnumC0785t enumC0785t3 = new Q0.EnumC0785t("Measurement", 2);
        j = enumC0785t3;
        Q0.EnumC0785t enumC0785t4 = new Q0.EnumC0785t("Placement", 3);
        f8473k = enumC0785t4;
        Q0.EnumC0785t[] enumC0785tArr = {enumC0785t, enumC0785t2, enumC0785t3, enumC0785t4};
        f8474l = enumC0785tArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0785tArr);
    }

    public static Q0.EnumC0785t valueOf(java.lang.String str) {
        return (Q0.EnumC0785t) java.lang.Enum.valueOf(Q0.EnumC0785t.class, str);
    }

    public static Q0.EnumC0785t[] values() {
        return (Q0.EnumC0785t[]) f8474l.clone();
    }
}

package W6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public class F {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W6.F f10620i;
    public static final W6.F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final W6.F f10621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final W6.E f10622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ W6.F[] f10623m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f10624h;

    static {
        W6.F f9 = new W6.F("NULL", 0, null);
        f10620i = f9;
        W6.F f10 = new W6.F("INDEX", 1, -1);
        j = f10;
        W6.F f11 = new W6.F("FALSE", 2, java.lang.Boolean.FALSE);
        f10621k = f11;
        W6.E e6 = new W6.E("MAP_GET_OR_DEFAULT", 3, null);
        f10622l = e6;
        W6.F[] fArr = {f9, f10, f11, e6};
        f10623m = fArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(fArr);
    }

    public F(java.lang.String str, int i3, java.lang.Object obj) {
        super(str, i3);
        this.f10624h = obj;
    }

    public static W6.F valueOf(java.lang.String str) {
        return (W6.F) java.lang.Enum.valueOf(W6.F.class, str);
    }

    public static W6.F[] values() {
        return (W6.F[]) f10623m.clone();
    }
}

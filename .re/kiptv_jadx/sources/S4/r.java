package S4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final S4.r f9437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final S4.r f9438i;
    public static final /* synthetic */ S4.r[] j;

    static {
        S4.r rVar = new S4.r("TMDB", 0);
        f9437h = rVar;
        S4.r rVar2 = new S4.r("XTREAM", 1);
        f9438i = rVar2;
        S4.r[] rVarArr = {rVar, rVar2};
        j = rVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(rVarArr);
    }

    public static S4.r valueOf(java.lang.String str) {
        return (S4.r) java.lang.Enum.valueOf(S4.r.class, str);
    }

    public static S4.r[] values() {
        return (S4.r[]) j.clone();
    }
}

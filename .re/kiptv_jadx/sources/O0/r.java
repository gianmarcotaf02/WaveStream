package O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O0.r f7684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O0.r f7685i;
    public static final /* synthetic */ O0.r[] j;

    static {
        O0.r rVar = new O0.r("Min", 0);
        f7684h = rVar;
        O0.r rVar2 = new O0.r("Max", 1);
        f7685i = rVar2;
        O0.r[] rVarArr = {rVar, rVar2};
        j = rVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(rVarArr);
    }

    public static O0.r valueOf(java.lang.String str) {
        return (O0.r) java.lang.Enum.valueOf(O0.r.class, str);
    }

    public static O0.r[] values() {
        return (O0.r[]) j.clone();
    }
}

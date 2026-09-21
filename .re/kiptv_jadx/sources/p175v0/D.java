package p175v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D implements p175v0.C {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p175v0.D f29046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p175v0.D f29047i;
    public static final p175v0.D j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p175v0.D[] f29048k;

    static {
        p175v0.D d4 = new p175v0.D("Active", 0);
        f29046h = d4;
        p175v0.D d6 = new p175v0.D("ActiveParent", 1);
        f29047i = d6;
        p175v0.D d9 = new p175v0.D("Captured", 2);
        p175v0.D d10 = new p175v0.D("Inactive", 3);
        j = d10;
        p175v0.D[] dArr = {d4, d6, d9, d10};
        f29048k = dArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(dArr);
    }

    public static p175v0.D valueOf(java.lang.String str) {
        return (p175v0.D) java.lang.Enum.valueOf(p175v0.D.class, str);
    }

    public static p175v0.D[] values() {
        return (p175v0.D[]) f29048k.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new I3.b();
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new I3.b();
            }
        }
        return true;
    }
}

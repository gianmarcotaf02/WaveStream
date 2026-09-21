package E5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class J0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E5.J0 f2894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E5.J0 f2895i;
    public static final /* synthetic */ E5.J0[] j;

    static {
        E5.J0 j9 = new E5.J0("XTREAM", 0);
        f2894h = j9;
        E5.J0 j10 = new E5.J0("M3U", 1);
        f2895i = j10;
        E5.J0[] j0Arr = {j9, j10};
        j = j0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(j0Arr);
    }

    public static E5.J0 valueOf(java.lang.String str) {
        return (E5.J0) java.lang.Enum.valueOf(E5.J0.class, str);
    }

    public static E5.J0[] values() {
        return (E5.J0[]) j.clone();
    }
}

package B7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final B7.k f836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final B7.k f837i;
    public static final B7.k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ B7.k[] f838k;

    static {
        B7.k kVar = new B7.k("NOT_COMPUTED", 0);
        f836h = kVar;
        B7.k kVar2 = new B7.k("COMPUTING", 1);
        f837i = kVar2;
        B7.k kVar3 = new B7.k("RECURSION_WAS_DETECTED", 2);
        j = kVar3;
        f838k = new B7.k[]{kVar, kVar2, kVar3};
    }

    public static B7.k valueOf(java.lang.String str) {
        return (B7.k) java.lang.Enum.valueOf(B7.k.class, str);
    }

    public static B7.k[] values() {
        return (B7.k[]) f838k.clone();
    }
}

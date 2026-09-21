package B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final B.A f458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final B.A f459i;
    public static final B.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ B.A[] f460k;

    static {
        B.A a2 = new B.A("Vertical", 0);
        f458h = a2;
        B.A a9 = new B.A("Horizontal", 1);
        f459i = a9;
        B.A a10 = new B.A("Both", 2);
        j = a10;
        B.A[] aArr = {a2, a9, a10};
        f460k = aArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aArr);
    }

    public static B.A valueOf(java.lang.String str) {
        return (B.A) java.lang.Enum.valueOf(B.A.class, str);
    }

    public static B.A[] values() {
        return (B.A[]) f460k.clone();
    }
}

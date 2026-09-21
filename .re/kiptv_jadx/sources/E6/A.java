package E6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E6.A f3190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E6.A f3191i;
    public static final E6.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final E6.A f3192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ E6.A[] f3193l;

    static {
        E6.A a2 = new E6.A("PUBLIC", 0);
        f3190h = a2;
        E6.A a9 = new E6.A("PROTECTED", 1);
        f3191i = a9;
        E6.A a10 = new E6.A("INTERNAL", 2);
        j = a10;
        E6.A a11 = new E6.A("PRIVATE", 3);
        f3192k = a11;
        E6.A[] aArr = {a2, a9, a10, a11};
        f3193l = aArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aArr);
    }

    public static E6.A valueOf(java.lang.String str) {
        return (E6.A) java.lang.Enum.valueOf(E6.A.class, str);
    }

    public static E6.A[] values() {
        return (E6.A[]) f3193l.clone();
    }
}

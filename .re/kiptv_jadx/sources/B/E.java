package B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final B.E f465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final B.E f466i;
    public static final /* synthetic */ B.E[] j;

    static {
        B.E e6 = new B.E("Min", 0);
        f465h = e6;
        B.E e9 = new B.E("Max", 1);
        f466i = e9;
        B.E[] eArr = {e6, e9};
        j = eArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(eArr);
    }

    public static B.E valueOf(java.lang.String str) {
        return (B.E) java.lang.Enum.valueOf(B.E.class, str);
    }

    public static B.E[] values() {
        return (B.E[]) j.clone();
    }
}

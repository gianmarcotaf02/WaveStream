package S7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final S7.B f9521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final S7.B f9522i;
    public static final S7.B j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final S7.B f9523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ S7.B[] f9524l;

    static {
        S7.B b9 = new S7.B("DEFAULT", 0);
        f9521h = b9;
        S7.B b10 = new S7.B("LAZY", 1);
        f9522i = b10;
        S7.B b11 = new S7.B("ATOMIC", 2);
        j = b11;
        S7.B b12 = new S7.B("UNDISPATCHED", 3);
        f9523k = b12;
        S7.B[] bArr = {b9, b10, b11, b12};
        f9524l = bArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bArr);
    }

    public static S7.B valueOf(java.lang.String str) {
        return (S7.B) java.lang.Enum.valueOf(S7.B.class, str);
    }

    public static S7.B[] values() {
        return (S7.B[]) f9524l.clone();
    }
}

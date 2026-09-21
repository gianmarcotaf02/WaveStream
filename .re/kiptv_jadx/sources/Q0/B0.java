package Q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Q0.B0 f8207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q0.B0 f8208i;
    public static final Q0.B0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Q0.B0[] f8209k;

    static {
        Q0.B0 b9 = new Q0.B0("ContinueTraversal", 0);
        f8207h = b9;
        Q0.B0 b10 = new Q0.B0("SkipSubtreeAndContinueTraversal", 1);
        f8208i = b10;
        Q0.B0 b11 = new Q0.B0("CancelTraversal", 2);
        j = b11;
        Q0.B0[] b0Arr = {b9, b10, b11};
        f8209k = b0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(b0Arr);
    }

    public static Q0.B0 valueOf(java.lang.String str) {
        return (Q0.B0) java.lang.Enum.valueOf(Q0.B0.class, str);
    }

    public static Q0.B0[] values() {
        return (Q0.B0[]) f8209k.clone();
    }
}

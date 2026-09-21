package W6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W6.D f10617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W6.D f10618i;
    public static final W6.D j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ W6.D[] f10619k;

    static {
        W6.D d4 = new W6.D("ONE_COLLECTION_PARAMETER", 0);
        f10617h = d4;
        W6.D d6 = new W6.D("OBJECT_PARAMETER_NON_GENERIC", 1);
        f10618i = d6;
        W6.D d9 = new W6.D("OBJECT_PARAMETER_GENERIC", 2);
        j = d9;
        W6.D[] dArr = {d4, d6, d9};
        f10619k = dArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(dArr);
    }

    public static W6.D valueOf(java.lang.String str) {
        return (W6.D) java.lang.Enum.valueOf(W6.D.class, str);
    }

    public static W6.D[] values() {
        return (W6.D[]) f10619k.clone();
    }
}

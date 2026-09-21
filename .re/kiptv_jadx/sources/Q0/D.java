package Q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Q0.D f8211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q0.D f8212i;
    public static final Q0.D j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Q0.D[] f8213k;

    static {
        Q0.D d4 = new Q0.D("InMeasureBlock", 0);
        f8211h = d4;
        Q0.D d6 = new Q0.D("InLayoutBlock", 1);
        f8212i = d6;
        Q0.D d9 = new Q0.D("NotUsed", 2);
        j = d9;
        Q0.D[] dArr = {d4, d6, d9};
        f8213k = dArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(dArr);
    }

    public static Q0.D valueOf(java.lang.String str) {
        return (Q0.D) java.lang.Enum.valueOf(Q0.D.class, str);
    }

    public static Q0.D[] values() {
        return (Q0.D[]) f8213k.clone();
    }
}

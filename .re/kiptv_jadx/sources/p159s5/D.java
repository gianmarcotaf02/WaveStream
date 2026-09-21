package p159s5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p159s5.D f27269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p159s5.D[] f27270i;

    static {
        p159s5.D d4 = new p159s5.D("DEFAULT", 0);
        f27269h = d4;
        p159s5.D[] dArr = {d4, new p159s5.D("ALPHA_ASC", 1), new p159s5.D("ALPHA_DESC", 2)};
        f27270i = dArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(dArr);
    }

    public static p159s5.D valueOf(java.lang.String str) {
        return (p159s5.D) java.lang.Enum.valueOf(p159s5.D.class, str);
    }

    public static p159s5.D[] values() {
        return (p159s5.D[]) f27270i.clone();
    }
}

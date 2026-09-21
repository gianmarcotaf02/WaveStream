package J;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J.L f5651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J.L f5652i;
    public static final J.L j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ J.L[] f5653k;

    static {
        J.L l2 = new J.L("Cursor", 0);
        f5651h = l2;
        J.L l9 = new J.L("SelectionStart", 1);
        f5652i = l9;
        J.L l10 = new J.L("SelectionEnd", 2);
        j = l10;
        J.L[] lArr = {l2, l9, l10};
        f5653k = lArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(lArr);
    }

    public static J.L valueOf(java.lang.String str) {
        return (J.L) java.lang.Enum.valueOf(J.L.class, str);
    }

    public static J.L[] values() {
        return (J.L[]) f5653k.clone();
    }
}

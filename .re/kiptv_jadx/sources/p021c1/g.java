package p021c1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.text.Layout.Alignment f18465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.text.Layout.Alignment f18466b;

    static {
        android.text.Layout.Alignment[] alignmentArrValues = android.text.Layout.Alignment.values();
        android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        android.text.Layout.Alignment alignment2 = alignment;
        for (android.text.Layout.Alignment alignment3 : alignmentArrValues) {
            if (kotlin.jvm.internal.m.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (kotlin.jvm.internal.m.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f18465a = alignment;
        f18466b = alignment2;
    }
}

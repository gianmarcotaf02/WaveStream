package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends p076i4.O0 implements java.io.Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p076i4.L0 f22810i = new p076i4.L0(0);
    public static final p076i4.L0 j = new p076i4.L0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22811h;

    public /* synthetic */ L0(int i3) {
        this.f22811h = i3;
    }

    @Override // p076i4.O0
    public final p076i4.O0 a() {
        switch (this.f22811h) {
            case 0:
                return j;
            default:
                return f22810i;
        }
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f22811h) {
            case 0:
                java.lang.Comparable comparable = (java.lang.Comparable) obj;
                java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                java.lang.Comparable comparable3 = (java.lang.Comparable) obj;
                java.lang.Comparable comparable4 = (java.lang.Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final java.lang.String toString() {
        switch (this.f22811h) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}

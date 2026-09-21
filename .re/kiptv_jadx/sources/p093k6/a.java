package p093k6;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements java.util.Comparator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p093k6.a f24495i = new p093k6.a(0);
    public static final p093k6.a j = new p093k6.a(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24496h;

    public /* synthetic */ a(int i3) {
        this.f24496h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f24496h) {
            case 0:
                java.lang.Comparable a2 = (java.lang.Comparable) obj;
                java.lang.Comparable b9 = (java.lang.Comparable) obj2;
                kotlin.jvm.internal.m.e(a2, "a");
                kotlin.jvm.internal.m.e(b9, "b");
                return a2.compareTo(b9);
            default:
                java.lang.Comparable a9 = (java.lang.Comparable) obj;
                java.lang.Comparable b10 = (java.lang.Comparable) obj2;
                kotlin.jvm.internal.m.e(a9, "a");
                kotlin.jvm.internal.m.e(b10, "b");
                return b10.compareTo(a9);
        }
    }

    @Override // java.util.Comparator
    public final java.util.Comparator reversed() {
        switch (this.f24496h) {
            case 0:
                return j;
            default:
                return f24495i;
        }
    }
}

package p105m2;

/* JADX INFO: loaded from: classes.dex */
public final class S implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p105m2.T f25233i;

    public /* synthetic */ S(p105m2.T t9, int i3) {
        this.f25232h = i3;
        this.f25233i = t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25232h) {
            case 0:
                android.util.SparseArray sparseArray = this.f25233i.f25240h;
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((p105m2.V) sparseArray.valueAt(i3)).getClass();
                    p105m2.V.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                p105m2.T t9 = this.f25233i;
                p105m2.Y y = t9.f25241i;
                if (y.f25261u == t9) {
                    y.k();
                }
                break;
        }
    }
}

package T1;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f9714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T1.w f9715b;

    public t(int i3) {
        this.f9714a = new android.util.SparseArray(i3);
    }

    public final void a(T1.w wVar, int i3, int i9) {
        int iA = wVar.a(i3);
        android.util.SparseArray sparseArray = this.f9714a;
        T1.t tVar = sparseArray == null ? null : (T1.t) sparseArray.get(iA);
        if (tVar == null) {
            tVar = new T1.t(1);
            sparseArray.put(wVar.a(i3), tVar);
        }
        if (i9 > i3) {
            tVar.a(wVar, i3 + 1, i9);
        } else {
            tVar.f9715b = wVar;
        }
    }
}

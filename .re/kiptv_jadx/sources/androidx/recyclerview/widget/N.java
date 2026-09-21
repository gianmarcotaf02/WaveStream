package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.util.SparseArray f17239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.Set f17241c;

    public final androidx.recyclerview.widget.M a(int i3) {
        android.util.SparseArray sparseArray = this.f17239a;
        androidx.recyclerview.widget.M m8 = (androidx.recyclerview.widget.M) sparseArray.get(i3);
        if (m8 != null) {
            return m8;
        }
        androidx.recyclerview.widget.M m9 = new androidx.recyclerview.widget.M();
        sparseArray.put(i3, m9);
        return m9;
    }
}

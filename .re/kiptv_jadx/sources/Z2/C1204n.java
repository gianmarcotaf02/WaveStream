package Z2;

/* JADX INFO: renamed from: Z2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1204n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f12902a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12903b = 0;

    public final void a() {
        this.f12903b += 1000;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = this.f12902a.iterator();
        while (it.hasNext()) {
            sb.append((Z2.C1205o) it.next());
            sb.append(' ');
        }
        sb.append('[');
        return Y6.f.j(sb, this.f12903b, ']');
    }
}

package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class H extends p076i4.J {
    public static p076i4.J g(int i3) {
        if (i3 < 0) {
            return p076i4.J.f22803b;
        }
        return i3 > 0 ? p076i4.J.f22804c : p076i4.J.f22802a;
    }

    @Override // p076i4.J
    public final p076i4.J a(int i3, int i9) {
        return g(java.lang.Integer.compare(i3, i9));
    }

    @Override // p076i4.J
    public final p076i4.J b(long j, long j9) {
        return g(java.lang.Long.compare(j, j9));
    }

    @Override // p076i4.J
    public final p076i4.J c(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // p076i4.J
    public final p076i4.J d(boolean z6, boolean z9) {
        return g(java.lang.Boolean.compare(z6, z9));
    }

    @Override // p076i4.J
    public final p076i4.J e(boolean z6, boolean z9) {
        return g(java.lang.Boolean.compare(z9, z6));
    }

    @Override // p076i4.J
    public final int f() {
        return 0;
    }
}

package Z7;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Z7.h {
    public static final Z7.e j;

    static {
        int i3 = Z7.k.f13051c;
        int i9 = Z7.k.f13052d;
        long j9 = Z7.k.f13053e;
        java.lang.String str = Z7.k.f13049a;
        Z7.e eVar = new Z7.e();
        eVar.f13046i = new Z7.c(i3, i9, j9, str);
        j = eVar;
    }

    @Override // S7.AbstractC0906w
    public final S7.AbstractC0906w Y(int i3) {
        X7.a.a(i3);
        return i3 >= Z7.k.f13051c ? this : super.Y(i3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // S7.AbstractC0906w
    public final java.lang.String toString() {
        return "Dispatchers.Default";
    }
}

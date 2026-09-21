package Y1;

/* JADX INFO: loaded from: classes.dex */
public final class M extends java.io.Writer implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.StringBuilder f11229i = new java.lang.StringBuilder(128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f11228h = "FragmentManager";

    public final void b() {
        java.lang.StringBuilder sb = this.f11229i;
        if (sb.length() > 0) {
            android.util.Log.d(this.f11228h, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i3, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            char c9 = cArr[i3 + i10];
            if (c9 == '\n') {
                b();
            } else {
                this.f11229i.append(c9);
            }
        }
    }
}

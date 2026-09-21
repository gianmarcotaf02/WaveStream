package M8;

/* JADX INFO: renamed from: M8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0686n implements M8.I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.v f7264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7265i;
    public boolean j;

    public C0686n(M8.v fileHandle) {
        kotlin.jvm.internal.m.e(fileHandle, "fileHandle");
        this.f7264h = fileHandle;
        this.f7265i = 0L;
    }

    @Override // M8.I
    public final void J(long j, M8.C0682j source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        M8.v vVar = this.f7264h;
        long j9 = this.f7265i;
        vVar.getClass();
        M8.AbstractC0674b.e(source.f7260i, 0L, j);
        long j10 = j9 + j;
        while (j9 < j10) {
            M8.F f9 = source.f7259h;
            kotlin.jvm.internal.m.b(f9);
            int iMin = (int) java.lang.Math.min(j10 - j9, f9.f7221c - f9.f7220b);
            byte[] array = f9.f7219a;
            int i3 = f9.f7220b;
            synchronized (vVar) {
                kotlin.jvm.internal.m.e(array, "array");
                vVar.f7289l.seek(j9);
                vVar.f7289l.write(array, i3, iMin);
            }
            int i9 = f9.f7220b + iMin;
            f9.f7220b = i9;
            long j11 = iMin;
            j9 += j11;
            source.f7260i -= j11;
            if (i9 == f9.f7221c) {
                source.f7259h = f9.a();
                M8.G.a(f9);
            }
        }
        this.f7265i += j;
    }

    @Override // M8.I
    public final M8.M c() {
        return M8.M.f7231d;
    }

    @Override // M8.I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        M8.v vVar = this.f7264h;
        java.util.concurrent.locks.ReentrantLock reentrantLock = vVar.f7288k;
        reentrantLock.lock();
        try {
            int i3 = vVar.j - 1;
            vVar.j = i3;
            if (i3 == 0 && vVar.f7287i) {
                reentrantLock.unlock();
                synchronized (vVar) {
                    vVar.f7289l.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // M8.I, java.io.Flushable
    public final void flush() {
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        M8.v vVar = this.f7264h;
        synchronized (vVar) {
            vVar.f7289l.getFD().sync();
        }
    }
}

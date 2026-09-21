package M8;

import java.util.concurrent.locks.ReentrantLock;

public final class C0686n implements I {

    public final v f7264h;

    public long f7265i;
    public boolean j;

    public C0686n(v fileHandle) {
        kotlin.jvm.internal.m.e(fileHandle, "fileHandle");
        this.f7264h = fileHandle;
        this.f7265i = 0L;
    }

    @Override
    public final void J(long j, C0682j source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        v vVar = this.f7264h;
        long j9 = this.f7265i;
        vVar.getClass();
        AbstractC0674b.e(source.f7260i, 0L, j);
        long j10 = j9 + j;
        while (j9 < j10) {
            F f9 = source.f7259h;
            kotlin.jvm.internal.m.b(f9);
            int iMin = (int) Math.min(j10 - j9, f9.f7221c - f9.f7220b);
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
                G.a(f9);
            }
        }
        this.f7265i += j;
    }

    @Override
    public final M c() {
        return M.f7231d;
    }

    @Override
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        v vVar = this.f7264h;
        ReentrantLock reentrantLock = vVar.f7288k;
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

    @Override
    public final void flush() {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        v vVar = this.f7264h;
        synchronized (vVar) {
            vVar.f7289l.getFD().sync();
        }
    }
}
